import { RouterModule, Routes } from "@angular/router";
import { AuthGuard } from "src/app/shared/guards/auth.guard";
import { CreateActivityComponent } from "./create-activity/create-activity.component";


const routes:Routes=[
    {
     path:'program/create-activity',
     component:CreateActivityComponent,
     canActivate: [AuthGuard],
     data: {
     title: 'Login',
     loginRequired: true
     }
    }
 ];
 
 export const ActivityRoutingModule=RouterModule.forChild(routes);