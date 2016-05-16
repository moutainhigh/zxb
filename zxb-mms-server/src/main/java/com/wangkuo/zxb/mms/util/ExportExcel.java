package com.wangkuo.zxb.mms.util;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by cuihe on 15/10/29.
 */
public class ExportExcel {

    static String path = "excel";

    public static String saveExcel(String fileName, XSSFWorkbook book, HttpServletRequest request) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String urlname = sdf.format(new Date()) + "_" + UUID.randomUUID().toString();//日期+GUID
        String filePath = request.getSession().getServletContext().getRealPath("/") + "/" + path;

        File file = new File(filePath);
        //判断文件夹是否存在,如果不存在则创建文件夹
        if (!file.exists()) {
            file.mkdir();
        }
        String fileUrl = path + "/" + fileName + ".xlsx";
        fileName = filePath + "/" + fileName + ".xlsx";
        try {
            OutputStream out = new FileOutputStream(fileName);
            book.write(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileUrl;
    }

    /**
     * 生成
     *
     * @param entityClass
     * @param dataSet
     * @param profile
     * @param <T>
     * @return
     * @throws NoSuchFieldException
     */
    public static <T> XSSFWorkbook generateXlsxWorkbook(Class<T> entityClass, Collection<T> dataSet, String profile) throws NoSuchFieldException {
        ArrayList<ExcelOrder> lstExcelOrder = new ArrayList<ExcelOrder>();
        Field[] fs = entityClass.getDeclaredFields();
        if (fs != null && fs.length > 0) {
            for (Field field : fs) {
                ExcelAnnotation excelAnnotation = field.getAnnotation(ExcelAnnotation.class);


                if (excelAnnotation != null) {

                    final int profilePos = ArrayUtils.indexOf(excelAnnotation.profile(), profile);

                    if (ArrayUtils.isNotEmpty(excelAnnotation.profile()) && profilePos == ArrayUtils.INDEX_NOT_FOUND) {
                        continue;
                    }

                    ExcelOrder excelOrder = new ExcelOrder();
                    excelOrder.setField(field.getName());

                    if (ArrayUtils.isNotEmpty(excelAnnotation.profile()) && ArrayUtils.isNotEmpty(excelAnnotation.alias()) && excelAnnotation.alias().length == excelAnnotation.profile().length) {
                        String alias = excelAnnotation.alias()[profilePos];
                        if (StringUtils.isNotEmpty(alias)) {
                            excelOrder.setName(alias);
                        } else {
                            excelOrder.setName(excelAnnotation.name());
                        }
                    } else {
                        excelOrder.setName(excelAnnotation.name());
                    }

                    excelOrder.setOrder(excelAnnotation.order());
                    excelOrder.setKey(excelAnnotation.key());
                    excelOrder.setValue(excelAnnotation.value());
                    lstExcelOrder.add(excelOrder);
                }
            }
        }

        return generateXlsxWorkbook(entityClass, dataSet, lstExcelOrder);
    }

    /**
     * 根据输入的数据生成一个XSSFWorkbook
     *
     * @param title：sheet名称
     * @param dataSet：实体类集合
     * @return：XSSFWorkbook
     */
    public static <T> XSSFWorkbook generateXlsxWorkbook(Class<T> entityClass, Collection<T> dataSet) throws NoSuchFieldException {

        ArrayList<ExcelOrder> lstExcelOrder = new ArrayList<ExcelOrder>();
        Field[] fs = entityClass.getDeclaredFields();
        if (fs != null && fs.length > 0) {
            for (Field field : fs) {
                ExcelAnnotation excelAnnotation = field.getAnnotation(ExcelAnnotation.class);
                if (excelAnnotation != null) {
                    ExcelOrder excelOrder = new ExcelOrder();
                    excelOrder.setField(field.getName());
                    excelOrder.setName(excelAnnotation.name());
                    excelOrder.setOrder(excelAnnotation.order());
                    excelOrder.setKey(excelAnnotation.key());
                    excelOrder.setValue(excelAnnotation.value());
                    excelOrder.setFormat(excelAnnotation.format());
                    lstExcelOrder.add(excelOrder);
                }
            }
        }

        return generateXlsxWorkbook(entityClass, dataSet, lstExcelOrder);
    }

    private static <T> XSSFWorkbook generateXlsxWorkbook(Class<T> entityClass, Collection<T> dataSet, ArrayList<ExcelOrder> lstExcelOrder) throws NoSuchFieldException {

        String title = "sheet1";
        // 声明一个工作薄
        XSSFWorkbook workbook = new XSSFWorkbook();
        // 生成一个表格
        XSSFSheet sheet = workbook.createSheet(title);
        // 设置表格默认列宽度为15个字节
        sheet.setDefaultColumnWidth((int) 15);

        XSSFCellStyle headerStyle = getHeaderStyle(workbook);
        XSSFCellStyle contentStyle = getContentStyle(workbook);

        //创建单元格样式
        XSSFCellStyle style = (XSSFCellStyle) workbook.createCellStyle();
        DataFormat format = workbook.createDataFormat();

        // 生成表格标题行
        XSSFRow row = sheet.createRow(0);


        Collections.sort(lstExcelOrder);

        int i = 0;
        for (ExcelOrder key : lstExcelOrder) {
            XSSFCell cell = row.createCell(i);
            cell.setCellStyle(headerStyle);
            XSSFRichTextString text = new XSSFRichTextString(key.getName());
            cell.setCellValue(text);
            i++;
        }


        //循环dataSet，每一条对应一行
        int index = 0;
        for (T data : dataSet) {
            index++;
            row = sheet.createRow(index);

            int j = 0;
            for (ExcelOrder key : lstExcelOrder) {
                XSSFCell cell = row.createCell(j);
                cell.setCellStyle(contentStyle);

                //拼装getter方法名
                String getMethodName = "get" + key.getField().substring(0, 1).toUpperCase() + key.getField().substring(1);

                try {
                    //利用反射机制获取dataSet中的属性值，填进cell中
                    Class<? extends Object> tCls = data.getClass();

                    Method getMethod = tCls.getMethod(getMethodName, new Class[]{});
                    Object value = getMethod.invoke(data, new Object[]{}); //调用getter从data中获取数据

                    // 判断值的类型后进行类型转换
                    String textValue = null;
                    if (value instanceof Date) {
                        Date date = (Date) value;
                        SimpleDateFormat sdf=null;
                        if(key.getFormat()!=null &&!key.getFormat().equals(""))
                        {
                             sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        }else {
                             sdf = new SimpleDateFormat("yyyy-MM-dd");
                        }
                        textValue = sdf.format(date);
                    } else {
                        // 其它数据类型都当作字符串简单处理
                        if (value == null) textValue = "";
                        else textValue = value.toString();
                    }
                    if (key.getKey().length > 0) {
                        int n = 0;
                        for (int k : key.getKey()) {
                            if (String.valueOf(k).equals(textValue)) {
                                if (key.getValue().length >= (n + 1)) {
                                    textValue = key.getValue()[n];
                                } else {
                                    textValue = "";
                                }
                                break;
                            }
                            ++n;
                        }
                    }

                    /*if(textValue != null){
                        Pattern p = Pattern.compile("^//d+(//.//d+)?$");
                        Matcher matcher = p.matcher(textValue);
                        if (matcher.matches()) {
                            // 是数字当作double处理
                            cell.setCellValue(Double.parseDouble(textValue));
                        } else {
                            XSSFRichTextString richString = new XSSFRichTextString(textValue);
                            cell.setCellValue(richString);
                        }
                    }*/
                    if (value instanceof BigDecimal) {
                        cell.setCellValue(Double.parseDouble(textValue));
                    } else {
                        XSSFRichTextString richString = new XSSFRichTextString(textValue);
                        cell.setCellValue(richString);
                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }
                j++;
            }
        }

        return workbook;
    }


    /**
     * 生成一个标题style
     *
     * @return style
     */
    private static XSSFCellStyle getHeaderStyle(Workbook workbook) {
        return getHeaderStyle(workbook, Color.BLUE, IndexedColors.WHITE.getIndex());
    }

    /**
     * 生成一个指定颜色的标题style
     *
     * @param workbook
     * @param foregroundColor
     * @param fontColor
     * @return
     */
    private static XSSFCellStyle getHeaderStyle(Workbook workbook, Color foregroundColor, short fontColor) {

        // 生成一个样式（用于标题）
        XSSFCellStyle style = (XSSFCellStyle) workbook.createCellStyle();
        // 设置这些样式
        style.setFillForegroundColor(new XSSFColor(foregroundColor));
        style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
        style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
        style.setBorderRight(XSSFCellStyle.BORDER_THIN);
        style.setBorderTop(XSSFCellStyle.BORDER_THIN);
        style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        // 生成一个字体
        XSSFFont font = (XSSFFont) workbook.createFont();
        font.setColor(fontColor);
        font.setFontHeightInPoints((short) 12);
        font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
        // 把字体应用到当前的样式
        style.setFont(font);

        return style;
    }

    /**
     * 生成一个用于内容的style
     *
     * @param workbook
     * @return
     */
    private static XSSFCellStyle getContentStyle(Workbook workbook) {
        // 生成并设置另一个样式（用于内容）
        XSSFCellStyle style = (XSSFCellStyle) workbook.createCellStyle();
        //style.setFillForegroundColor(new XSSFColor(Color.YELLOW));
        //style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
        style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
        style.setBorderRight(XSSFCellStyle.BORDER_THIN);
        style.setBorderTop(XSSFCellStyle.BORDER_THIN);
        style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
        // 生成另一个字体
        XSSFFont font = (XSSFFont) workbook.createFont();
        font.setBoldweight(XSSFFont.BOLDWEIGHT_NORMAL);
        // 把字体应用到当前的样式
        style.setFont(font);

        return style;
    }


    static class ExcelOrder implements Comparable<ExcelOrder> {
        private String field;
        private String name;
        private Integer order;
        private int[] key;
        private String[] value;
        private String format;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public int[] getKey() {
            return key;
        }

        public void setKey(int[] key) {
            this.key = key;
        }

        public String[] getValue() {
            return value;
        }

        public void setValue(String[] value) {
            this.value = value;
        }


        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        @Override
        public int compareTo(ExcelOrder o) {
            return this.order.compareTo(o.order);
        }
    }

    class ExcelMap extends HashMap<String, String> {

    }

}
