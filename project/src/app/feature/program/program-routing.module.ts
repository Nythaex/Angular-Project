import { RouterModule, Routes } from "@angular/router";
import { ProgramComponent } from "./program.component";

const routes:Routes=[
    {
     path:'',
     component:ProgramComponent
    }
 ];
 
 export const ProgramRoutingModule=RouterModule.forChild(routes);