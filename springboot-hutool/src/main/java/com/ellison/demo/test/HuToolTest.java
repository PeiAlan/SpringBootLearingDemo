package com.ellison.demo.test;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

import java.util.Date;

public class HuToolTest {
    public static void main(String[] args) {
//        convert();
//        dateutil();
        idutil();
    }

    /**
     * 类型转换
     */
    public static void convert(){
        int a = 1;
//aStr为"1"
        String aStr = Convert.toStr(a);
        System.out.println(aStr);

        long[] b = {1,2,3,4,5};
//bStr为："[1, 2, 3, 4, 5]"
        String bStr = Convert.toStr(b);
        System.out.println(bStr);

        String date = "2017-05-06";
        Date value = Convert.toDate(date);
        System.out.println(value);
    }

    /**
     * 日期时间转换
     */
    public static void dateutil(){
        DateTime date = DateUtil.date();
        int quarter = DateUtil.quarter(date);
        System.out.println(Convert.numberToChinese(Convert.toDouble(quarter),false));
    }

    /**
     * ID 自动生成
     */
    public static void idutil(){
        //UUID
        String s = IdUtil.randomUUID();
        System.out.println("UUID: "+s);

        // 雪花算法
        Snowflake snowflake = IdUtil.createSnowflake(2, 30);
        for (int i = 0; i < 100000000; i++) {
            System.out.println("雪花ID：" + snowflake.nextId());
        }

    }
}
