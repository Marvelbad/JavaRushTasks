package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() != null) {
                builder.append(entry.getKey())
                        .append(" = '")
                        .append(entry.getValue())
                        .append("' and ");
            }
        }


//        return builder.delete(builder.lastIndexOf("'") + 1, builder.length()).toString();
        return builder.substring(0, builder.lastIndexOf("'") + 1);
//        String trim = builder.toString().trim();
//        return trim.substring(0, trim.lastIndexOf(" "));
    }
}
