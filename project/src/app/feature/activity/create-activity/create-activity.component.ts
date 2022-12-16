import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { ActivityService } from '../activity.service';

@Component({
  selector: 'app-create-activity',
  templateUrl: './create-activity.component.html',
  styleUrls: ['./create-activity.component.scss']
})
export class CreateActivityComponent {


  constructor(private activityService:ActivityService,private route:Router){}

  createActivity(form:NgForm):void{
    const activityProp: {title:string ,description:string,location:string,image:string}=form.value;
  

    this.activityService.addActivity(activityProp.title,activityProp.description,activityProp.location,
      activityProp.image).subscribe({
        next:(activity)=>{
          this.route.navigate(['program'])
        }
      })    
}}
