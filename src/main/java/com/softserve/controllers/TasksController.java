package com.softserve.controllers;

import com.softserve.entity.Artpieces;
import com.softserve.services.ArtpiecesService;
import com.softserve.services.EmployeesService;
import com.softserve.services.ExcursionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

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
     * Show info about the artpiece
     */
    @RequestMapping(value = "/task1" ,method = RequestMethod.POST)
    public  String employeeList(Model model, @RequestParam("artpiece") String artpiece) {
        try {
            model.addAttribute("artpieceObject", artpiecesService.getArtpieceByName(artpiece));
        }
        catch (Exception e)
        {
            Artpieces artpieces = new Artpieces();
            Random r = new Random();
            artpieces.setAuthor("Not Found");
            artpieces.setIdArtpiece(200 + new Long(r.nextInt(10000)));
            artpieces.setMaterial("Not Found");
            artpieces.setHall(new Long(404));
            artpieces.setName(artpiece);
            artpieces.setTechnique("Not Found");
            model.addAttribute("artpieceObject", artpieces);
        }
        return "task1";
    }

    /**
     * Task 2
     * Show all artpieces of an author
     */
    @RequestMapping(value = "/task2" ,method = RequestMethod.POST)
    public  String authorList(Model model, @RequestParam("author") String author) {
        model.addAttribute("listArt", artpiecesService.getArtpieceByAuthors(author));
        return "task2";
    }

    /**
     * Task 3
     * Show artpieces by employee
     */
    @RequestMapping(value = "/task3" ,method = RequestMethod.POST)
    public  String nameList(Model model,@RequestParam("name") String name) {
        model.addAttribute("listArt", artpiecesService.getEmployArt(name));
        model.addAttribute("name",name);
        return "task3";
    }

    /**
     * Task 4
     * Show artpieces in a hall
     */
    @RequestMapping(value = "/task4" ,method = RequestMethod.POST)
    public  String ListByHall(Model model, @RequestParam("hall") String hall) {
        try {
            model.addAttribute("listArt", artpiecesService.getArtpieceByHall(Long.parseLong(hall)));
            model.addAttribute("hall", hall);
        }
        catch (Exception e)
        {
            model.addAttribute("listArt", null);
            model.addAttribute("hall", "that doesn't exist");
        }
        return "task4";
    }

    /**
     * Task 5
     * Show all guides
     */
    @RequestMapping(value = "/task5" ,method = RequestMethod.GET)
    public  String everything(Model model) {
        model.addAttribute("listEmp", employeesService.everything());
        return "task5";
    }

    /**
     * Task 7
     * Show excursionists that are free
     */
    //TODO would be good to add the name of the guide and not just the parameters from database
    @RequestMapping(value = "/task7" ,method = RequestMethod.POST)
    public  String nothing(Model model, @RequestParam("startdate") String start,@RequestParam("enddate") String end) {
        model.addAttribute("listExc", excursionsService.getExcursionsByStartEnd(start,end));
        return "task7";
    }

    /**
     * Task 8
     * Show material statistic
     */
    @RequestMapping(value = "/task8" ,method = RequestMethod.POST)
    public String materialStatistic(Model model, @RequestParam("material") String material) {
        model.addAttribute("statistic", artpiecesService.getMaterialStatistic(material));
        return "task8";
    }
}
