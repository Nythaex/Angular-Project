import { RouterModule, Routes } from "@angular/router";
import { AuthGuard } from "src/app/shared/guards/auth.guard";
import { CreateProgramComponent } from "./create-program/create-program.component";
import { ProgramComponent } from "./program.component";

const routes:Routes=[
    {
     path:'',
     component:ProgramComponent
    }, 
    {
        path:'change',
        component:CreateProgramComponent,
        canActivate: [AuthGuard]
       }
 ];
 
 export const ProgramRoutingModule=RouterModule.forChild(routes);