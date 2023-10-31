package com.jiejie.match.service;

import com.jiejie.match.utils.AlgorithmUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 算法工具类测试
 */
public class AlgorithmUtilsTest {


    @Test
    void test() {
        String str1 = "Lyj是狗";
        String str2 = "Lyj不是狗";
        String str3 = "Lyj是猪不是狗";
        String str4 = "Lyj是猫";
        // 1
        int score1 = AlgorithmUtils.minDistance(str1, str2);
        // 3
        int score2 = AlgorithmUtils.minDistance(str1, str3);
        System.out.println(score1); // 1
        System.out.println(score2); // 3
        // score小的,相似度大
    }

    @Test
    void testCompareTags() {
        List<String> tagList1 = Arrays.asList("Java", "大一", "男");
        List<String> tagList2 = Arrays.asList("Java", "大一", "女");
        List<String> tagList3 = Arrays.asList("Python", "大二", "女");
        // 1
        int score1 = AlgorithmUtils.minDistance(tagList1, tagList2);
        // 3
        int score2 = AlgorithmUtils.minDistance(tagList1, tagList3);
        System.out.println(score1); // score1 = 1
        System.out.println(score2); // score2 = 3
    }

}
