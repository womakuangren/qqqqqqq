package com.atguigu.crud.test;

import com.atguigu.crud.bean.ArEmployee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class Mybatis_plus_test2 {
    @Test
    public void test1(){
        ArEmployee t = new ArEmployee();
        //数据库新增
         t.setLastName("aaaasqqqqqdf");
         t.setAge(33);
         t.setGender(1);
         t.setEmail("bbbbbdej@qq.com");
         System.out.println(t.insert());
    }
}
