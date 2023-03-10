package com.study.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.springboot.entity.MovieCategory;

@Repository
public interface MovieCategoryReository 
	extends JpaRepository<MovieCategory, Integer>{

}