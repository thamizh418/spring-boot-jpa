package com.example.PractiseProject.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PractiseProject.model.AcademyModel;
import com.example.PractiseProject.service.AcademyService;

@RestController
@RequestMapping("/Academy")
public class AcademyController{

    @Autowired
    private AcademyService academyService;

    @GetMapping
    public List<AcademyModel> getAllEmployees() {
        return academyService.getAllAcademy();
    }

    @GetMapping("/{academy_id}")
    public AcademyModel getEmployeeById(@PathVariable Long academy_id) {
        return academyService.getAcademyById(academy_id);
    }

    @PostMapping
    public AcademyModel createEmployee(@RequestBody AcademyModel academyModel) {
        return academyService.saveAcademy(academyModel);
    }

    @DeleteMapping("/{academy_id}")
    public void deleteEmployee(@PathVariable Long academy_id) {
    	academyService.deleteAcademy(academy_id);
    }
}
