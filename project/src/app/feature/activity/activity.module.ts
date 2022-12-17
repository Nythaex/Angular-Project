import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateActivityComponent } from './create-activity/create-activity.component';
import { ActivityRoutingModule } from './activity-routing.module';
import { FormsModule } from '@angular/forms';
import { ActivityInfoComponent } from './activity-info/activity-info.component';



@NgModule({
  declarations: [
    CreateActivityComponent,
    ActivityInfoComponent
   
  ],
  imports: [
    CommonModule,
    ActivityRoutingModule,
    FormsModule
  ],exports:[
      ActivityInfoComponent
  ]
})
export class ActivityModule { }
