package com.ellison.demo;

import cn.hutool.core.convert.Convert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HutoolDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 类型转换
     */
    @Test
    public void convert(){
        int a = 1;
//aStr为"1"
        String aStr = Convert.toStr(a);
        System.out.println(aStr);

        long[] b = {1,2,3,4,5};
//bStr为："[1, 2, 3, 4, 5]"
        String bStr = Convert.toStr(b);
        System.out.println(bStr);
    }

}
