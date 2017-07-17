package com.softserve.controllers;

import com.softserve.entity.Employees;
import com.softserve.services.EmployeesService;
import com.softserve.services.ExcursionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
public class ExcursionsController {

    @Autowired
    private ExcursionsService excursionsService;

    @RequestMapping(value="/excursions", method = RequestMethod.GET)
    public String excursionList(Model model){
        model.addAttribute("exclist", excursionsService.getAllExcursionsWithGuides());
        return "excursions";
    }
}
