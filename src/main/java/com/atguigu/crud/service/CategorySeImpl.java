package com.atguigu.crud.service;

import com.atguigu.crud.bean.category;
import com.atguigu.crud.bean.categoryExample;
import com.atguigu.crud.dao.categoryMapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class CategorySeImpl implements CategorySe {

    @Autowired
    private categoryMapper categoryMapper;

    public List<category> getCategoryinfall(int mmm, int nnn){
        categoryExample ca = new categoryExample();
        ca.setMmm(mmm);
        ca.setNnn(nnn);
       List<category> cao = categoryMapper.selectByExample(ca);
       return cao;
    }

    public List<category>  getCategoryinf(){
        categoryExample ca = new categoryExample();
        List<category> cao = categoryMapper.selectByExample(ca);
        return cao;
    }

}
