package com.example.backend.web;

import com.example.backend.models.binding.ActivityBinding;
import com.example.backend.models.binding.ProgramBinding;
import com.example.backend.models.entitie.Activity;
import com.example.backend.models.entitie.Program;
import com.example.backend.models.enums.Location;
import com.example.backend.models.view.ProgramView;
import com.example.backend.services.ActivityService;
import com.example.backend.services.ProgramService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController()
public class ProgramResource {

    private final ActivityService activityService;
    private final ProgramService programService;

    public ProgramResource(ActivityService activityService, ProgramService programService)
    {
        this.activityService = activityService;
        this.programService = programService;
    }

    @ResponseStatus( HttpStatus.CREATED)
    @PostMapping("/program/change")
    public void changeProgram(@RequestBody ProgramBinding programBinding)  {

        programService.deleteProgramIfExists();

        Program program=new Program();

         program.setActivity1(programBinding.getActivity1());
         program.setActivity2(programBinding.getActivity2());
         program.setActivity3(programBinding.getActivity3());
         program.setActivity4(programBinding.getActivity4());
         program.setActivity5(programBinding.getActivity5());
         program.setActivity6(programBinding.getActivity6());

         program.setCurrent("current");
         programService.saveProgram(program);

    }



    @GetMapping("/program")
    public ResponseEntity<List<Activity>> changeProgram()  {
        List<Activity> programView=programService.crateProgram();
      return ResponseEntity.ok(programView);
    }
}
