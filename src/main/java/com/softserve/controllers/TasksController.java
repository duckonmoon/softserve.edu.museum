package com.softserve.controllers;

import com.softserve.services.ArtpiecesService;
import com.softserve.services.EmployeesService;
import com.softserve.services.ExcursionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by User on 17.07.2017.
 */
@Controller
public class TasksController {
    @Autowired
    private ExcursionsService excursionsService;

    @Autowired
    private EmployeesService employeesService;

    @Autowired
    private ArtpiecesService artpiecesService;


    @RequestMapping(value = "/task1" ,method = RequestMethod.POST)
    public  String employeeList(Model model, @RequestParam("artpiece") String artpiece) {
        model.addAttribute("artpieceObject", artpiecesService.getArtpieceByName(artpiece));
        return "task1";
    }

    @RequestMapping(value = "/task2" ,method = RequestMethod.POST)
    public  String authorList(Model model, @RequestParam("author") String author) {
        model.addAttribute("listArt", artpiecesService.getArtpieceByAuthors(author));
        return "task2";
    }

    @RequestMapping(value = "/task3" ,method = RequestMethod.GET)
    public  String authorList(Model model) {
        model.addAttribute("listArt", artpiecesService.getEmployArt());
        return "task3";
    }
}
