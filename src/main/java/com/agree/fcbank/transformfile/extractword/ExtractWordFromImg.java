package com.agree.fcbank.transformfile.extractword;

import org.springframework.stereotype.Component;

import java.io.File;

/***
 * @author  沙建斌
 * @date  2021-11-04
 * @version 1.0
 * @description 此类主要提供从图片中提取文字的功能
 * ***/
@Component("ExtractWordFromPicture")
public class ExtractWordFromImg {

    /***提取纯文本文件图片内的文字***/
   private   String textImg;

    /***读取二进制图片文件***/
    private File readePictreFile(String filePath){
        File imgFile = new File(filePath);

        return imgFile;
    }
    /**
     * @date  2021-11-04
     * @description 提取纯文本图片内的文字
     **/

    public String getWordFromTextImg(String ImgPath){
    return textImg;
    }
}
