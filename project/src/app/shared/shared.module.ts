import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmailValidatorDirective } from './validators/email-validator/email-validator.directive';
import { SecretKeyValidatorDirective } from './validators/secret-key-validator/secret-key-validator.directive';







@NgModule({
  declarations: [
    EmailValidatorDirective,
    SecretKeyValidatorDirective,
  ],
  imports: [
    CommonModule
    
  ],exports:[
    EmailValidatorDirective
  ],providers:[
    
  ]
})
export class SharedModule { }
