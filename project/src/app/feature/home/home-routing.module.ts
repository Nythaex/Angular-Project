import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./home/home.component";


const routes:Routes=[
   {
    path:'',
    component:HomeComponent
   }

];

export const HomeRoutingModule=RouterModule.forChild(routes);