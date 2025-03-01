package com.yupi.yuchuan.model.enums;

import cn.hutool.core.util.ObjectUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * App 应用类型枚举
 *
 * @author yuchuan
 * @date 2025/2/26 00:14
 */
public enum ScoringStrategyEnum {

    SCORE("得分类", 0),
    TEST("测评类", 1);


    private final String text;

    private final int value;



    ScoringStrategyEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }


    /**
     * 根据 value 获取枚举
     *
     * @return
     */

    public static ScoringStrategyEnum getByValue(Integer value) {
        if (ObjectUtil.isEmpty(value)) {
            return null;
        }
        for (ScoringStrategyEnum anEnum : ScoringStrategyEnum.values()) {
            if (anEnum.value == value) {
                return anEnum;
            }
        }
        return null;
    }


    /**
     * 获取值列表
     *
     * @return
     */

    public static List<Integer> getValues(){
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    // Getter 方法
    public int getValue(){
        return value; 
    }
    public String getText(){return text;}
}
