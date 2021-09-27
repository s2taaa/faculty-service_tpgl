package com.example.facultyservice.service;

import com.example.facultyservice.entity.Faculty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FacultyService {

    public Faculty save(Faculty c);
    public List<Faculty> getAll();
    public Faculty get(Long id);
    public Faculty update(Faculty c);
    public void delete(Long id);

}
