import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { from, map, observable, Observable, of, Subject } from 'rxjs';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent  {
  

  login(form:NgForm):void{
        const LoginProp: {email:string ,password:string}=form.value;
        console.log(LoginProp.email +"Loged");
        
  }

  
  
}
