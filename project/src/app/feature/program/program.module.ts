import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProgramComponent } from './program.component';
import { ProgramRoutingModule } from './program-routing.module';
import { CreateProgramComponent } from './create-program/create-program.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ActivityModule } from '../activity/activity.module';



@NgModule({
  declarations: [
   ProgramComponent,
   CreateProgramComponent
  ],
  imports: [
    CommonModule,
    ProgramRoutingModule,
    FormsModule,
    HttpClientModule,
    ActivityModule
  ]
})
export class ProgramModule { }