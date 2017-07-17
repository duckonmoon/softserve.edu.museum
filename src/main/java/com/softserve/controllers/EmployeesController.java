package com.softserve.controllers;

import com.softserve.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */
@Controller
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @RequestMapping(value = "/employees" ,method = RequestMethod.GET)
    public  String employeeList(Model model) {
        model.addAttribute("list", employeesService.getAllEmployees());
        return "employees";
    }
}
