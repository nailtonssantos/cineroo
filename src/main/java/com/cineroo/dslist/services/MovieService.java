package com.cineroo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cineroo.dslist.dto.MovieMinDTO;
import com.cineroo.dslist.entities.Movie;
import com.cineroo.dslist.repositories.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    
    public List<MovieMinDTO> findAll(){
        List<Movie> result =  movieRepository.findAll();
        return result.stream().map(x -> new MovieMinDTO(x)).toList();
    }
 
}
