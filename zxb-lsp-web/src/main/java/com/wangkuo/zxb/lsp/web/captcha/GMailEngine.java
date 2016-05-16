package com.wangkuo.zxb.lsp.web.captcha;

import com.octo.captcha.component.image.backgroundgenerator.BackgroundGenerator;
import com.octo.captcha.component.image.backgroundgenerator.UniColorBackgroundGenerator;
import com.octo.captcha.component.image.color.RandomListColorGenerator;
import com.octo.captcha.component.image.deformation.ImageDeformation;
import com.octo.captcha.component.image.deformation.ImageDeformationByFilters;
import com.octo.captcha.component.image.fontgenerator.FontGenerator;
import com.octo.captcha.component.image.fontgenerator.RandomFontGenerator;
import com.octo.captcha.component.image.textpaster.DecoratedRandomTextPaster;
import com.octo.captcha.component.image.textpaster.TextPaster;
import com.octo.captcha.component.image.textpaster.textdecorator.TextDecorator;
import com.octo.captcha.component.image.wordtoimage.DeformedComposedWordToImage;
import com.octo.captcha.component.image.wordtoimage.WordToImage;
import com.octo.captcha.component.word.wordgenerator.RandomWordGenerator;
import com.octo.captcha.component.word.wordgenerator.WordGenerator;
import com.octo.captcha.engine.image.ListImageCaptchaEngine;
import com.octo.captcha.image.gimpy.GimpyFactory;

import java.awt.*;
import java.awt.image.ImageFilter;

/**
 * @author 林守锦
 * @version 1.0
 * @date 14-3-8
 */
public class GMailEngine extends ListImageCaptchaEngine {
    @Override
    protected void buildInitialFactories() {
        int minWordLength = 4;
        int maxWordLength = 4;
        int minFontSize = 24;
        int maxFontSize = 24;
        int imageWidth = 100;
        int imageHeight = 40;

        //word generator
        WordGenerator dictionnaryWords = new RandomWordGenerator("0123456789");

        //word2image components
        TextPaster randomPaster = new DecoratedRandomTextPaster(minWordLength, maxWordLength,
                new RandomListColorGenerator(new Color[]{new Color(23, 170, 27), new Color(220, 34, 11),
                        new Color(23, 67, 172)}), new TextDecorator[]{}
        );

        BackgroundGenerator background = new UniColorBackgroundGenerator(imageWidth, imageHeight);

        FontGenerator font = new RandomFontGenerator(minFontSize, maxFontSize, new Font[]{
                new Font("nyala", Font.BOLD, minFontSize), new Font("Bell MT", Font.PLAIN, maxFontSize),
                new Font("Credit valley", Font.BOLD, maxFontSize)});

        ImageDeformation postDef = new ImageDeformationByFilters(new ImageFilter[]{});
        ImageDeformation backDef = new ImageDeformationByFilters(new ImageFilter[]{});
        ImageDeformation textDef = new ImageDeformationByFilters(new ImageFilter[]{});


        WordToImage word2image = new DeformedComposedWordToImage(font, background, randomPaster, backDef, textDef,
                postDef);
        addFactory(new GimpyFactory(dictionnaryWords, word2image));
    }
}
