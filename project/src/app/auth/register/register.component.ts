import { Component } from '@angular/core';
import { FormBuilder, NgForm, Validators } from '@angular/forms';
import { AuthService } from 'src/app/shared/services/auth-service.service';
import { EmailValidatorDirective } from 'src/app/shared/validators/email-validator/email-validator.directive';
import { matchPasswordValidator } from 'src/app/shared/validators/password-match-validator';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent  {
  
  
  constructor(private fb:FormBuilder,private authService:AuthService){

  }

    registerForm= this.fb.group({
    username: ['',[Validators.required,Validators.minLength(6)]],
    email: ['',[Validators.required,EmailValidatorDirective.validateEmail("")]],
    passwordGroup:this.fb.group(
        { 
          password:['',[Validators.required,Validators.minLength(8)]],
          confirmPassword:['']
        }
      ,{validators: matchPasswordValidator('password','confirmPassword')}
    )
  });

  register(){
      const {username,email,passwordGroup:{password,confirmPassword}={}}=this.registerForm.value;
      this.authService.register(username!,email!,password!,confirmPassword!);
      

  }

}
