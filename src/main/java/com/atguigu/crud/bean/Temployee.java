package com.atguigu.crud.bean;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
@TableName("tbl_employee")//全局表前缀策略，可不写
public class Temployee {
    //配置主键自增策略  可不写。
    //@TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;
    //驼峰命名规则（默认）
    @TableField("last_name")
    private String lastName;

    private String email;

    private Integer gender;

    private Integer age;

    //数据库表中不存在的字段
    @TableField(exist = false)
    private  category category;
}
