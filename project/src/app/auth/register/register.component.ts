import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ValidatorFn, Validators } from '@angular/forms';
import { Router } from '@angular/router';

import { EmailValidatorDirective } from 'src/app/shared/validators/email-validator/email-validator.directive';

import { matchPasswordValidator } from 'src/app/shared/validators/password-match-validator';
import { SecretKeyValidatorDirective } from 'src/app/shared/validators/secret-key-validator/secret-key-validator.directive';
import { AuthService } from '../auth-service.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent {
  
   emailExists:Boolean=false;
  constructor(private fb:FormBuilder,private authService:AuthService,private route:Router){
      
  }
 

    registerForm= this.fb.group({
  
    email: ['',[Validators.required,EmailValidatorDirective.validateEmail(),this.existing()]],
    passwordGroup:this.fb.group(
        { 
          password:['',[Validators.required,Validators.minLength(8)]],
          confirmPassword:['']
        }
      ,{validators: matchPasswordValidator('password','confirmPassword')}
    ),
    secretKey: ['',[Validators.required,SecretKeyValidatorDirective.validateKey()]],
  });

  register(){
    
      const {email,passwordGroup:{password,confirmPassword}={}}=this.registerForm.value;
      
    this.authService.register(email!,password!,confirmPassword!).subscribe({
      next:(user)=>{
        if(this.authService.isLoggedIn){
          this.route.navigate(["/"])
        }
      
      }
    });
  }

  existing():ValidatorFn{
    return (control)=>{
  
        this.authService.checkExists(control.value).subscribe({
        next:(inputEmail)=>{
          this.emailExists=inputEmail;
          
        }
        
      });
      
        
      return this.emailExists?{existingEmail:true}:null
     }

}

}
