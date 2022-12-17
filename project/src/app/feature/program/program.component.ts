import { Component, OnInit } from '@angular/core';
import { IActivity } from 'src/app/shared/model/Activity';
import { ProgramService } from './program.service';

@Component({
  selector: 'app-program',
  templateUrl: './program.component.html',
  styleUrls: ['./program.component.scss']
})
export class ProgramComponent implements OnInit{

  constructor(private programService:ProgramService){}

  activities:IActivity[]=[]
  

  ngOnInit(): void {
       this.programService.getProgram().subscribe({
        next:(activityList)=>{
          activityList.forEach(activity=>{
            this.activities.push(activity)
            
          })    
        }
       })
      
  }

}
