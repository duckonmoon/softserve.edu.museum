package com.softserve.controllers;

import com.softserve.services.ArtpiecesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */
@Controller
public class ArtpiecesController {

    @Autowired
    private ArtpiecesService artpiecesService;

    @RequestMapping(value = "/artpieces" ,method = RequestMethod.GET)
    public  String checkBook(Model model) {
        model.addAttribute("list", artpiecesService.getAllArtpieces());
        return "artpieces";
    }



//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public @ResponseBody String getAllAuthors(){
//        return artpiecesService.getAllArtpieces().toString();
//    }
}
