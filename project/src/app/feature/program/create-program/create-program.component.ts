import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { IActivityIdAndTitle } from 'src/app/shared/model';
import { ActivityService } from '../../activity/activity.service';
import { ProgramService } from '../program.service';

@Component({
  selector: 'app-create-program',
  templateUrl: './create-program.component.html',
  styleUrls: ['./create-program.component.scss']
})
export class CreateProgramComponent implements OnInit{

  constructor(private activityService:ActivityService,private programService:ProgramService,private route:Router){}

  ngOnInit(): void {
    this.activities=[];
    this.activityService.getAllOnlyIdAndTitle().subscribe({
      next:(activityList)=>{
        activityList.forEach(activity=>{
          this.activities.push(activity)
          
        })
        
      }
    })


  }

  activities:IActivityIdAndTitle[]=[];



  createProgram(form:NgForm){
        const {activity1,activity2,activity3,activity4,activity5,activity6}=form.value;
        this.programService.changeProgram(activity1,activity2,activity3,activity4,activity5,activity6).subscribe({
          next:(ac)=>{
          this.route.navigate(["program"])
          }
        })
        
        
  }


}
