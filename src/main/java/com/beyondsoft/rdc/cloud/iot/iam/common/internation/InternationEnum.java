/*
 * Copyright (c) 2018. Beyondsoft Corporation.
 * All Rights Reserved.
 *
 * BEYONDSOFT CONFIDENTIALITY
 *
 * The information in this file is confidential and privileged from Beyondsoft Corporation,
 * which is intended only for use solely by Beyondsoft Corporation.
 * Disclosure, copying, distribution, or use of the contents of this file by persons other than Beyondsoft Corporation
 * is strictly prohibited and may violate applicable laws.
 */

package com.beyondsoft.rdc.cloud.iot.iam.common.internation;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangningning@beyondsoft.com
 * @version 1.0
 * @date 19-8-12 上午11:14
 */
@Slf4j
public enum InternationEnum {

    SUCCESS("成功", "Success"),
    SYSTEM_ERROR("系统错误", "System error"),
    FILE_NOT_MATCH("识别码与授权文件不匹配，请重新提交", "The identification code does not match the authorization file, please resubmit"),

    //common
    KEY_FILE_NOT_EXIST_ERROR("文件不存在", "File does not exist"),

    //NOCV
    KEY_START_DATE_NULL("开始时间不能为空", "Start time cannot be empty"),
    KEY_END_DATE_NULL("结束时间不能为空", "End time cannot be empty"),

    //FLOOR
    KEY_SPACE_OCCUPY_ERROR("该空间已被使用，无法删除", "The space is already in use and cannot be deleted"),
    KEY_SPACE_CHILDREN_ERROR("该空间下有子信息，无法删除", "There are sub information in this space, unable to delete"),
    KEY_FLOOE_SAVE_ERROR("楼栋信息添加失败", "Building information adding failed"),
    KEY_FLOOT_DELETE_ERROR("楼栋信息删除失败", "Building information deletion failed"),
    KEY_FLOOR_UPDATE_ERROR("楼栋信息修改失败", "Building information modification failed"),
    KEY_FLOOT_FIND_ONE_ERROR("楼栋信息查询单个失败", "Building information query single failed"),
    KEY_FLOOR_FIND_LIST_ERROR("楼栋信息查询多个失败", "Building information query multiple failures"),

    //ROLE
    KEY_ROLE_OCCUPY_ERROR("角色已占用，不可删除", "Role occupied, cannot be deleted"),
    KEY_ROLE_NAME_EXIST_ERROR("角色名称已存在", "Role name already exists"),

    //登录
    KEY_USERNAME_ERROR("用户名错误", "User name error"),
    KEY_PASSWORD_ERROR("密码错误", "Password error"),
    KEY_USER_DELETE_FAIL_ERROR("删除失败！", "Delete failed!"),
    KEY_USER_DELETE_SUCCESS_ERROR("删除成功！", "Deleted successfully! "),

    //
    KEY_ID_INFO_ERROR("读取身份证信息失败!", "Failed to read ID card information!"),

    //label
    KEY_LABEL_NAME_EXIST_ERROR("标签名称已存在", "Label name already exists"),
    KEY_LABEL_OCCUPY_ERROR("标签已占用，不可删除", "Label occupied, cannot be deleted"),

    // device
    DEVICE_NAME_HAS_EXISTS("设备名称已存在", "Device name already exists"),
    DEVICE_SERIAL_NUMVER_HAS_EXISTS("设备序列号已存在", "Device serial number already exists"),

    END("","");

    private String zhName;

    private String enName;

    InternationEnum(String zhName, String enName) {
        this.zhName = zhName;
        this.enName = enName;
    }

    public String getZhName() {
        return zhName;
    }

    public String getEnName() {
        return enName;
    }

    public static InternationEnum getInternationEnum(String zhName) {
        for (InternationEnum internationEnum : InternationEnum.values()) {
            //log.debug("==枚举==internationEnum：{}", internationEnum.getZhName());
            if (zhName.equals(internationEnum.getZhName())) {
                return internationEnum;
            }
        }
        return null;
    }

    public String getLanguage(String language){
        String str = new String();
        switch (language){
            case "zh" : {
                str = this.getZhName();
                break;
            }
            case "en" : {
                str = this.getEnName();
                break;
            }
            default:{
                str = this.getZhName();
                break;
            }
        }

        return str;
    }
}
