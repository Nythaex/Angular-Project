import { RouterModule, Routes } from "@angular/router";
import { CreateProgramComponent } from "./create-program/create-program.component";
import { ProgramComponent } from "./program.component";

const routes:Routes=[
    {
     path:'',
     component:ProgramComponent
    }, 
    {
        path:'change',
        component:CreateProgramComponent
       }
 ];
 
 export const ProgramRoutingModule=RouterModule.forChild(routes);