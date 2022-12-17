package com.example.backend.services;

import com.example.backend.models.entitie.Activity;
import com.example.backend.models.entitie.Program;
import com.example.backend.models.view.ProgramView;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProgramService {
    void saveProgram(Program program);
    Program getProgramById(Long id);
    void deleteProgramIfExists();
    Program getCurrentProgram();
    List<Activity> crateProgram();

}
