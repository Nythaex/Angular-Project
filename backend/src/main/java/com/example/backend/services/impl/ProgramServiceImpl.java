package com.example.backend.services.impl;

import com.example.backend.models.entitie.Activity;
import com.example.backend.models.entitie.Program;
import com.example.backend.repositories.ProgramRepository;
import com.example.backend.services.ActivityService;
import com.example.backend.services.ProgramService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService {
    private final ProgramRepository programRepository;
    private final ActivityService activityService;

    public ProgramServiceImpl(ProgramRepository programRepository, ActivityService activityService) {
        this.programRepository = programRepository;
        this.activityService = activityService;
    }

    @Override
    public void saveProgram(Program program) {
       programRepository.save(program);
    }

    @Override
    public Program getProgramById(Long id) {
        return programRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProgramIfExists() {
        Program program=this.getCurrentProgram();
        if (program!=null){
            programRepository.delete(program);
        }
    }

    @Override
    public Program getCurrentProgram() {
        return programRepository.findFirstByCurrent("current");
    }

    @Override
    public List<Activity> crateProgram() {
        Program program=getCurrentProgram();
        List<Activity> activities=new ArrayList<>();

        activities.add(activityService.getActivityById(program.getActivity1()));
        activities.add(activityService.getActivityById(program.getActivity2()));
        activities.add(activityService.getActivityById(program.getActivity3()));
        activities.add(activityService.getActivityById(program.getActivity4()));
        activities.add(activityService.getActivityById(program.getActivity5()));
        activities.add(activityService.getActivityById(program.getActivity6()));


        return activities;
    }
}
