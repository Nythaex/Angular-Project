import { RouterModule, Routes } from "@angular/router";
import { CreateActivityComponent } from "./create-activity/create-activity.component";


const routes:Routes=[
    {
     path:'program/create-activity',
     component:CreateActivityComponent
    }
 ];
 
 export const ActivityRoutingModule=RouterModule.forChild(routes);