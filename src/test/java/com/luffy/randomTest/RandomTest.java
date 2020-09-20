package com.luffy.randomTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;

/**
 * @author: zqy
 * @date: 2020-08-13 13:21
 **/
public class RandomTest {
    public static void main(String[] args) {
        String biz_content = "{\n" +
                "\t\"contrast_result\": [{\n" +
                "\t\t\"goods_count\": \"1\",\n" +
                "\t\t\"goods_id\": \"81\",\n" +
                "\t\t\"goods_name\": \"娃哈哈冰红茶\",\n" +
                "\t\t\"goods_reduce\": \"true\"\n" +
                "\t}],\n" +
                "\t\"image_infos\": [{\n" +
                "\t\t\"cam_id\": \"2\",\n" +
                "\t\t\"image_id\": \"A*3E7UT4JMU4QAAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"1\"\n" +
                "\t}, {\n" +
                "\t\t\"cam_id\": \"1\",\n" +
                "\t\t\"image_id\": \"A*4DFOSbx7bPQAAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"1\"\n" +
                "\t}, {\n" +
                "\t\t\"cam_id\": \"4\",\n" +
                "\t\t\"image_id\": \"A*a_Z1TIFjXtYAAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"2\"\n" +
                "\t}, {\n" +
                "\t\t\"cam_id\": \"2\",\n" +
                "\t\t\"image_id\": \"A*bCEQTIy2AtAAAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"2\"\n" +
                "\t}, {\n" +
                "\t\t\"cam_id\": \"1\",\n" +
                "\t\t\"image_id\": \"A*hIfUS5kgiyAAAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"2\"\n" +
                "\t}, {\n" +
                "\t\t\"cam_id\": \"3\",\n" +
                "\t\t\"image_id\": \"A*KktVT4He41MAAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"2\"\n" +
                "\t}, {\n" +
                "\t\t\"cam_id\": \"5\",\n" +
                "\t\t\"image_id\": \"A*P2ikT6A_b94AAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"2\"\n" +
                "\t}, {\n" +
                "\t\t\"cam_id\": \"5\",\n" +
                "\t\t\"image_id\": \"A*tEgjQ6yHoQEAAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"1\"\n" +
                "\t}, {\n" +
                "\t\t\"cam_id\": \"3\",\n" +
                "\t\t\"image_id\": \"A*zqFfR7DXQzAAAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"1\"\n" +
                "\t}, {\n" +
                "\t\t\"cam_id\": \"4\",\n" +
                "\t\t\"image_id\": \"A*_lBeQ7q5I6YAAAAAAAAAAABkEkInAQ\",\n" +
                "\t\t\"shoot_moment\": \"1\"\n" +
                "\t}],\n" +
                "\t\"is_marketing\": \"false\",\n" +
                "\t\"trace_exception\": \"false\",\n" +
                "\t\"trace_id\": \"4510000030202008111739425285\",\n" +
                "\t\"trade_dispose\": \"INVALID\",\n" +
                "\t\"trade_info\": {},\n" +
                "\t\"trade_result\": \"fail\",\n" +
                "\t\"transaction_id\": \"visionpay8BC1588239370A8E49DE0ED4\"\n" +
                "}";
        JSONObject bizContentObject = JSON.parseObject(biz_content);
        JSONArray contrast_result = bizContentObject.getJSONArray("contrast_result");
        JSONObject trade_info = bizContentObject.getJSONObject("trade_info");
        System.out.println(ObjectUtils.isEmpty(trade_info));
        System.out.println(trade_info);
        System.out.println(contrast_result);
        for (int i = 0; i < contrast_result.size(); i++) {
            JSONObject jsonObject = contrast_result.getJSONObject(i);
            Boolean goods_reduce = jsonObject.getBoolean("goods_reduce");
            Integer goods_id = jsonObject.getInteger("goods_id");
            Integer goods_count = jsonObject.getInteger("goods_count");
            System.out.println(goods_reduce);
            System.out.println(goods_id);
            System.out.println(goods_count);
        }

    }

    @Test
    public void test1() {
        Double d = 0.000001d;
        System.out.println(Double.toString(d));
    }

    @Test
    public void test2() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", "0");
        hashMap.put("type", "11");
        hashMap.put("external_agreement_no", "ali_15966544034354510000025");
        System.out.println(JSON.toJSONString(hashMap));
    }

    @Test
    public void test3() {

        String s = "abcabcbb";
        if (s == null || s.length() == 0)
            System.out.println(0);

        String longString = "";
        int max = 1;

        for (int i = 0; i < s.length(); i++) {
            longString = s.charAt(i) + "";
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                String c = s.charAt(j) + "";
                if (!longString.contains(c)) {
                    longString += c;
                    count++;
                } else {
                    break;
                }
            }
            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
