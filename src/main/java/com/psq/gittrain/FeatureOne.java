package com.psq.gittrain;

import java.util.ArrayList;
import java.util.List;

/**
 * FeatureOne.java
 * Description: 功能模块，第一个功能。
 *
 * @author Peng Shiquan
 * Copyright  2018-2019  创捷运维智能科技有限公司
 * All rights reserved.
 * @version: 1.0
 * Reversion:
 * 1.0 - 新建
 */
public class FeatureOne {
    /**
     * Method: helpFeature
     * Description: 帮助功能
     *
     * @param
     * @return void
     */
    public void helpFeature() {
        System.out.printf("这是一个测试的功能");
    }

    /**
     * Method: oneFeature
     * Description: 功能分支一的第二个新功能
     *
     * @param
     * @return void
     */
    public void oneFeature() {
        System.out.printf("功能分支一的第二个新功能");
    }

    /**
     * Method: listEquipmentsByES
     * Description: 根据es查询所有的设备列表
     *
     * @param
     * @return java.lang.String
     */
    public String listEquipmentsByES() {
        List<String> stringList = new ArrayList<>();
        stringList.add("风机");
        stringList.add("照明");
        return "这是全部的设备" + stringList.toString();
    }

    /**
     * Method: listVideoUrlByRedis
     * Description: 查询所有的摄像机url
     *
     * @param
     * @return java.lang.String
     */
    public String listVideoUrlByRedis() {
        System.err.println("现在开始查询摄像机");
        List<String> vidoeUrls = new ArrayList<>();
        return null;
    }
}
