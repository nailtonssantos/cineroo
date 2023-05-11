package com.cineroo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cineroo.dslist.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long>{
    


}
