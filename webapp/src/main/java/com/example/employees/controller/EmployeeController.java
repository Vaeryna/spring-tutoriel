package com.example.employees.controller;

import com.example.employees.model.Employee;
import com.example.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Employee> listEmployee = service.getEmployees();
        model.addAttribute("employees", listEmployee);
        return "home";
    }
}
