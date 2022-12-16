package com.example.backend.services;

import com.example.backend.models.entitie.Program;
import org.springframework.stereotype.Service;

@Service
public interface ProgramService {
    void saveProgram(Program program);
    Program getProgramById(Long id);
}
