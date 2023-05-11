package com.cineroo.dslist.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cineroo.dslist.dto.MovieMinDTO;
import com.cineroo.dslist.entities.Movie;
import com.cineroo.dslist.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
    
    @Autowired
    private MovieService movieService;


    @GetMapping
    public List<MovieMinDTO> findAll(){
        List<MovieMinDTO> result = movieService.findAll();
        return result;
    }


}
