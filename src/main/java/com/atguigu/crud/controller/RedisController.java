package com.atguigu.crud.controller;

import com.atguigu.crud.bean.category;
import com.atguigu.crud.service.CategorySe;
import com.atguigu.crud.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RedisController {

    public  static Logger logger = LoggerFactory.getLogger(RedisController.class);
    @Autowired
    private CategorySe categorySe;
    @RequestMapping("/qqq")
    @ResponseBody
    public List<category> getqqq(){
        List<category> list  = categorySe.getCategoryinf();
        //category categorya = categorySe.getCategoryinfall();
        //list.add(category);
        //list.add(categorya);


        boolean aa = RedisUtil.setString("qwe","asdfasdfasd");
        logger.info("8**************************************8888");
        logger.info(""+aa);
        logger.info(RedisUtil.getString("qwe"));
        logger.info("8**************************************8888");

        return list;
    }

}
