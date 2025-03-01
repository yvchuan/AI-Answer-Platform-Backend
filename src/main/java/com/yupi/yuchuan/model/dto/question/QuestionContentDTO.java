package com.yupi.yuchuan.model.dto.question;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.swing.text.html.Option;
import java.util.List;

/**
 * TODO 添加描述
 *
 * @author yuchuan
 * @date 2025/2/28 13:50
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionContentDTO {
    /*
     * 题目标题
     */
    private String title;

    /*
     * 题目选项列表
     */
    private List<Option> options;

    /*
    题目选项
     */

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Option {
        private String result;
        private int score;
        private String value;
        private String key;
    }

}
