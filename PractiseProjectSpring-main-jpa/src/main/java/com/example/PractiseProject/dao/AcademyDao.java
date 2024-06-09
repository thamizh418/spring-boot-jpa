package com.example.PractiseProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PractiseProject.model.AcademyModel;

public interface AcademyDao extends JpaRepository<AcademyModel, Long> {
	
}

