package com.atguigu.mp.service.impl;

import com.atguigu.mp.entity.Employee;
import com.atguigu.mp.mapper.EmployeeMapper;
import com.atguigu.mp.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lining
 * @since 2019-12-04
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
