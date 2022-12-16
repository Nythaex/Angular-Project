import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/shared/services/auth-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent  {
  
  constructor(private authService:AuthService,private route:Router){

  }

  login(form:NgForm):void{
        const loginProp: {email:string ,password:string}=form.value;
        this.authService.login(loginProp.email,loginProp.password).subscribe({
          next:(user)=>{
            if(this.authService.isLoggedIn){
              this.route.navigate(["menu"])
            }
           
          }
        });
       
      
      
        
        
  }

  
  
}
