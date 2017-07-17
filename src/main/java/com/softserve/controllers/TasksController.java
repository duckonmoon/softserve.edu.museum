package com.softserve.controllers;

import com.softserve.services.ArtpiecesService;
import com.softserve.services.EmployeesService;
import com.softserve.services.ExcursionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@Controller
public class TasksController {
    @Autowired
    private ExcursionsService excursionsService;

    @Autowired
    private EmployeesService employeesService;

    @Autowired
    private ArtpiecesService artpiecesService;


    /**
     * Task 1
     */
    @RequestMapping(value = "/task1" ,method = RequestMethod.POST)
    public  String employeeList(Model model, @RequestParam("artpiece") String artpiece) {
        model.addAttribute("artpieceObject", artpiecesService.getArtpieceByName(artpiece));
        return "task1";
    }

    /**
     * Task 2
     */
    @RequestMapping(value = "/task2" ,method = RequestMethod.POST)
    public  String authorList(Model model, @RequestParam("author") String author) {
        model.addAttribute("listArt", artpiecesService.getArtpieceByAuthors(author));
        return "task2";
    }

    /**
     * Task 3
     */
    @RequestMapping(value = "/task3" ,method = RequestMethod.POST)
    public  String nameList(Model model,@RequestParam("name") String name) {
        model.addAttribute("listArt", artpiecesService.getEmployArt(name));
        model.addAttribute("name",name);
        return "task3";
    }

    /**
     * Task 4
     */
    @RequestMapping(value = "/task4" ,method = RequestMethod.POST)
    public  String ListByHall(Model model,@RequestParam("hall") String hall) {
        model.addAttribute("listArt", artpiecesService.getArtpieceByHall(Long.parseLong(hall)));
        model.addAttribute("hall",hall);
        return "task4";
    }

    /**
     * Task 5
     */
    @RequestMapping(value = "/task5" ,method = RequestMethod.GET)
    public  String everything(Model model) {
        model.addAttribute("listExc", employeesService.everything());
        return "task5";
    }


    @RequestMapping(value = "/task7" ,method = RequestMethod.POST)
    public  String nothing(Model model, @PathVariable("startdate") String start,@PathVariable("enddate") String end) {
        model.addAttribute("listArt", excursionsService.getExcursionsByStartEnd(start,end));
        return "task7";
    }

    


}
