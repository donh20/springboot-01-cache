package com.ncamc.springboot;

import com.ncamc.springboot.cache.bean.Employee;
import com.ncamc.springboot.cache.bean.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.midi.Soundbank;

@SpringBootTest
class Springboot01CacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
        Employee employee = employeeMapper.getEmpById(1);
        System.out.println(employee);
    }
}
