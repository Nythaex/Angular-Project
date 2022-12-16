import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateActivityComponent } from './create-activity/create-activity.component';
import { ActivityRoutingModule } from './activity-routing.module';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    CreateActivityComponent
   
  ],
  imports: [
    CommonModule,
    ActivityRoutingModule,
    FormsModule
  ]
})
export class ActivityModule { }
