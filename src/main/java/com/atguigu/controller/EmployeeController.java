package com.atguigu.controller;

import com.atguigu.bean.Employee;
import com.atguigu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 *
 **/
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/getEmployees")
    public String getEmployees(Map<String,Object> map)
    {
        List<Employee> employeeList = employeeService.getEmployeeList();
        map.put("employees",employeeList);
        return "list";
    }
}
