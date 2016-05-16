package com.wangkuo.zxb.lsp.api.dto.input;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2016-04-11
 */
public class EditStowageInput implements Serializable {
    private Long id;

    @NotNull
    @Min(1)
    private Long allocCenterId;

    @NotEmpty
    @Length(max = 20)
    private String plateNumber;

    @NotEmpty
    @Length(max = 20)
    private String driverName;

    @NotEmpty
    @Length(max = 20)
    private String driverPhone;

    @NotEmpty
    @Length(max = 20)
    private String truckLength;

    @Length(max = 20)
    private String truckModel;

    @NotNull
    @Size(min = 1)
    private List<Long> waybillIds;

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Getter for property 'allocCenterId'.
     *
     * @return Value for property 'allocCenterId'.
     */
    public Long getAllocCenterId() {
        return allocCenterId;
    }

    /**
     * Setter for property 'allocCenterId'.
     *
     * @param allocCenterId Value to set for property 'allocCenterId'.
     */
    public void setAllocCenterId(Long allocCenterId) {
        this.allocCenterId = allocCenterId;
    }

    /**
     * Getter for property 'plateNumber'.
     *
     * @return Value for property 'plateNumber'.
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * Setter for property 'plateNumber'.
     *
     * @param plateNumber Value to set for property 'plateNumber'.
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * Getter for property 'driverName'.
     *
     * @return Value for property 'driverName'.
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Setter for property 'driverName'.
     *
     * @param driverName Value to set for property 'driverName'.
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * Getter for property 'driverPhone'.
     *
     * @return Value for property 'driverPhone'.
     */
    public String getDriverPhone() {
        return driverPhone;
    }

    /**
     * Setter for property 'driverPhone'.
     *
     * @param driverPhone Value to set for property 'driverPhone'.
     */
    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    /**
     * Getter for property 'truckLength'.
     *
     * @return Value for property 'truckLength'.
     */
    public String getTruckLength() {
        return truckLength;
    }

    /**
     * Setter for property 'truckLength'.
     *
     * @param truckLength Value to set for property 'truckLength'.
     */
    public void setTruckLength(String truckLength) {
        this.truckLength = truckLength;
    }

    /**
     * Getter for property 'truckModel'.
     *
     * @return Value for property 'truckModel'.
     */
    public String getTruckModel() {
        return truckModel;
    }

    /**
     * Setter for property 'truckModel'.
     *
     * @param truckModel Value to set for property 'truckModel'.
     */
    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }

    /**
     * Getter for property 'waybillIds'.
     *
     * @return Value for property 'waybillIds'.
     */
    public List<Long> getWaybillIds() {
        return waybillIds;
    }

    /**
     * Setter for property 'waybillIds'.
     *
     * @param waybillIds Value to set for property 'waybillIds'.
     */
    public void setWaybillIds(List<Long> waybillIds) {
        this.waybillIds = waybillIds;
    }

    @Override
    public String toString() {
        return "EditStowageInput{" +
                "id=" + id +
                ", allocCenterId=" + allocCenterId +
                ", plateNumber='" + plateNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverPhone='" + driverPhone + '\'' +
                ", truckLength='" + truckLength + '\'' +
                ", truckModel='" + truckModel + '\'' +
                ", waybillIds=" + waybillIds +
                '}';
    }
}
