package com.ncamc.springboot.cache.bean.service;

import com.ncamc.springboot.cache.bean.Employee;
import com.ncamc.springboot.cache.bean.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    /*
    *  将方法的运行结果进行缓存，以后再需要查相同的数据，直接从缓存中获取，不调用方法
    * CacheManager管理多个Cache组件的，对缓存的真正CRUD操作在Cache组件中，每一个缓存组件有自己唯一一个名字
    *  几个属性：
    *   cacheNames/value: 指定缓存的名字；
    *   key：缓存数据时用的key；可以用它来指定，默认是使用方法参数的值。1-方法的返回值
    *       编写SpEL表达式: #id;参数id的值 #a0 #p0 #root.args[0]
    *   keyGenerator:key的生成器
    *  @param id
    *  @return
    * */
    @Cacheable(cacheNames="emp",key = "#root.args[0]")
    public Employee getEmp(Integer id) {
        System.out.println("查询"+id+"号员工");
        Employee emp = employeeMapper.getEmpById(id);
        return emp;
    }
}
