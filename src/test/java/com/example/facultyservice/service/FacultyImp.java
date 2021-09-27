package com.example.facultyservice.service;

import com.example.facultyservice.entity.Faculty;
import com.example.facultyservice.repository.FacultyRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class FacultyImp implements FacultyService {

    @Autowired
    private FacultyRepo facultyRepo;
    @Override
    public Faculty save(Faculty c) {
        log.info("Inside saveFaculty of Service!");
        return facultyRepo.save(c);
    }

    @Override
    public List<Faculty> getAll() {
        return facultyRepo.findAll();
    }

    @Override
    public Faculty get(Long id) {
        log.info("Inside findFaculty of Service!");
        return facultyRepo.findById(id).get();
    }

    @Override
    public Faculty update(Faculty c) {
        return facultyRepo.save(c);
    }

    @Override
    public void delete(Long id) {
        facultyRepo.deleteById(id);

    }
}
