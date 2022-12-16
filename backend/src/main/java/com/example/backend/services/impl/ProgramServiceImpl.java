package com.example.backend.services.impl;

import com.example.backend.models.entitie.Program;
import com.example.backend.repositories.ProgramRepository;
import com.example.backend.services.ProgramService;


public class ProgramServiceImpl implements ProgramService {
    private final ProgramRepository programRepository;

    public ProgramServiceImpl(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Override
    public void saveProgram(Program program) {
       programRepository.save(program);
    }

    @Override
    public Program getProgramById(Long id) {
        return programRepository.findById(id).orElse(null);
    }
}
