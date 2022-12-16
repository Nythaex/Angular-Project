import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProgramComponent } from './program.component';
import { ProgramRoutingModule } from './program-routing.module';



@NgModule({
  declarations: [
    ProgramComponent
  ],
  imports: [
    CommonModule,
    ProgramRoutingModule
  ]
})
export class ProgramModule { }
