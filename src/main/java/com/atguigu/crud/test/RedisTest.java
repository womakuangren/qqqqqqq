package com.atguigu.crud.test;

import com.atguigu.crud.utils.RedisConfigConstant;
import com.atguigu.crud.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@ContextConfiguration(locations = { "classpath*:/Spring-redis.xml"})
public class RedisTest {

    @Test
    public void redisSetTest(){
       boolean aa = RedisUtil.setString("qwe","asdfasdfasd");
        System.out.println("8**************************************8888");
        System.out.println(aa);
        System.out.println(RedisUtil.getString("qwe"));
        System.out.println("8**************************************8888");

    }

    public static void main(String[] args) {
    }
}
