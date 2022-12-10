import { RouterModule, Routes } from "@angular/router";
import { NotFoundComponent } from "./not-found/not-found.component";



const routes:Routes=[
   {
    path:'**',
    pathMatch: 'full',
    component:NotFoundComponent
   }

];

export const ErrorRouringModule=RouterModule.forChild(routes);