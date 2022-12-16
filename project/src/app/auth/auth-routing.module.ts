import { RouterModule, Routes } from "@angular/router";
import { AuthGuard } from "../shared/guards/auth.guard";
import { LoginComponent } from "./login/login.component";
import { LogoutComponent } from "./logout/logout.component";
import { RegisterComponent } from "./register/register.component";

const routes:Routes=[
   {
    path:'',
    children:[
        {
            path:'login',
            component:LoginComponent,
            canActivate: [AuthGuard],
            data: {
            title: 'Login',
            loginRequired: false
            }
        },
        {
            path:'register',
            component:RegisterComponent,
            canActivate: [AuthGuard],
            data: {
            title: 'Register',
            loginRequired: false
            }
        },
        {
            path:'logout',
            component:LogoutComponent,
            canActivate: [AuthGuard],
            data: {
            title: 'Logout',
            loginRequired: true
            }
        }

    ]
   }

];

export const AuthRoutingModule=RouterModule.forChild(routes);