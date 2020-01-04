package com.atguigu.crud.test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class mybatis_plus_generator {

    @Test
    public void testGenerator() {
//全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true) //是否支持AR模式
                .setAuthor("lining") //作者
                .setOutputDir("D:\\IDEA\\xiangmu\\ssm-crud\\src\\main\\java")//生成路径
                .setFileOverride(true)//文件覆盖
                .setServiceName("%sService") //设置生成的service接口名 首字母是否为I
                .setIdType(IdType.AUTO) //主键策略
                .setBaseResultMap(true)//
                .setBaseColumnList(true);//


//数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)
                .setUrl("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=GMT%2B8")
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUsername("root")
                .setPassword("123456");
//策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) // 全局大写命名
                .setDbColumnUnderline(true) //表名 字段名 是否使用下滑 线命名
                .setNaming(NamingStrategy.underline_to_camel) // 数库表映射到实体的命名策略
                .setInclude("tbl_employee") //生成的表
                .setTablePrefix("tbl_"); // 表前缀
//包名策略
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.atguigu.mp")
                .setController("controller")
                .setEntity("entity")
                .setXml("mapper")
                .setService("service");

//整合配置
        AutoGenerator ag = new
                AutoGenerator().setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);
//执行
        ag.execute();
    }
}
