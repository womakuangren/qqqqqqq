package com.atguigu.crud.test;


import com.atguigu.crud.bean.Temployee;
import com.atguigu.crud.dao.TemployeeMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class Mybatis_plus {
    @Autowired
    private TemployeeMapper temployeeMapper;
    @Test
    public  void test1(){
        Temployee t = new Temployee();
        //数据库新增
       //t.setId(6);
        t.setLastName("asqqqqqdf");
        t.setAge(33);
        t.setGender(1);
        t.setEmail("afsdfwoej@qq.com");
        //数据库插入
        Integer aaa = temployeeMapper.insert(t);
        //Integer abc = temployeeMapper.insertAllColumn(t);
        System.out.println(aaa.toString()+"*****************"+aaa);
        System.out.println(t.getId());


        //数据库更新
  /**      int aaa = temployeeMapper.updateById(t);
        int bbb = temployeeMapper.updateAllColumnById(t);
        int ccc = temployeeMapper.update(t,null);
        //update 很多方法都可以用
        int accc = temployeeMapper.update(t,new EntityWrapper<Temployee>().like("id","4"));
        int abbc = temployeeMapper.updateForSet("aaa",new EntityWrapper<Temployee>().eq("id","7"));
   **/

        //数据库查询
 /**      //  t.setId(1);
    //    Temployee a = temployeeMapper.selectOne(t);
        //Temployee a = temployeeMapper.selectById("4");
//        System.out.println("**********************"+a.getLastName());
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        List<Temployee> a = temployeeMapper.selectBatchIds(list);
//        for(Temployee asdf:a){
//            System.out.println(asdf.getId() +"  "+asdf.getLastName());
//        }
        //map方式查询
//        Map<String,Object> map = new  HashMap<String,Object>();
//        map.put("last_name","asdf");
//        map.put("id",3);
//        List<Temployee> a = temployeeMapper.selectByMap(map);
//        if(a.isEmpty()){
//            System.out.println("****************");
//        }
//
            //分页查询
//        List<Temployee> a = temployeeMapper.selectPage(new Page<Temployee>(2,2),null);
//        System.out.println("************");
//        System.out.println(a);
//        for(Temployee asdf:a){
//            System.out.println(asdf.getId() +"  "+asdf.getLastName());
//        }
  **/

        //删除数据
/**       int a = temployeeMapper.deleteById(5);
//        Map<String,Object> map = new  HashMap<String,Object>();
//        map.put("last_name","asdf");
//        map.put("id",3);
//        int a = temployeeMapper.deleteByMap(map);
//        System.out.println(a);
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(7);
//        list.add(8);
//        int a = temployeeMapper.deleteBatchIds(list);
//        System.out.println(a); **/
    //
    }
    @Test
    public void test2(){
        /**
        *我们需要分页查询 tbl_employee 表中，年龄在 18~50 之间性别为男且
         * 姓名为 xx 的所有用户，这时候我们该如何实现上述需求呢？
         * */
       // int a  = temployeeMapper.selectCount(new EntityWrapper<Temployee>().like("email","qqq"));
        //int a  = temployeeMapper.selectCount(new EntityWrapper<Temployee>().between("age",30,40));
        int a  = temployeeMapper.selectCount(
                new EntityWrapper<Temployee>()
                        .eq("age",33)
                        .lt("gender",1)
                      //  .or() // (age = ? AND gender < ? OR email LIKE ?)
                        .orNew()   //(age = ? AND gender < ?) OR (email LIKE ?)
                        .like("email","asdf")
                );


        System.out.println(a);
    }
}
