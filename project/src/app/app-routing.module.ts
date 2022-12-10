import { NgModule } from '@angular/core';
import { RouterModule, Routes ,PreloadAllModules } from '@angular/router';
import { HomeComponent } from './feature/home/home/home.component';

const routes: Routes = [
  {
    path:'',
    component :HomeComponent
  },
  {
    path:'auth',
    loadChildren: ()=>import('../app/auth/auth.module').then(m=>m.AuthModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{preloadingStrategy:PreloadAllModules})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
