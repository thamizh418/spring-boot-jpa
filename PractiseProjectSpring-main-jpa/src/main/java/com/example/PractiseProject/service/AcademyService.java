package com.example.PractiseProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PractiseProject.dao.AcademyDao;
import com.example.PractiseProject.model.AcademyModel;

@Service
public class AcademyService {

    @Autowired
    private AcademyDao academyDao;

    public List<AcademyModel> getAllAcademy() {
        return academyDao.findAll();
    }

    public AcademyModel getAcademyById(Long academy_id) {
        return academyDao.findById(academy_id).orElse(null);
    }

    public AcademyModel saveAcademy(AcademyModel academyModel) {
        return academyDao.save(academyModel);
    }

    public void deleteAcademy(Long academy_id) {
    	academyDao.deleteById(academy_id);
    }
}
