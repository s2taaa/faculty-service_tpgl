package com.example.facultyservice.controller;

import com.example.facultyservice.entity.Faculty;
import com.example.facultyservice.service.FacultyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculty")
@Slf4j
public class FacultyController {
    @Autowired
    private FacultyService facultyService;
    @GetMapping
    public List<Faculty> getAll(){
        return facultyService.getAll();
    }

    @PostMapping
    public String create(@RequestBody Faculty faculty){
        facultyService.save(faculty);
        return "saved";
    }

    @GetMapping("/{id}")
    public Faculty get(@PathVariable("id") Long id){
        return facultyService.get(id);
    }

    @PutMapping("/{id}")
    public String update(@RequestBody Faculty faculty){
        facultyService.update(faculty);
        return "updated";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        facultyService.delete(id);
        return "deleted";
    }
}
