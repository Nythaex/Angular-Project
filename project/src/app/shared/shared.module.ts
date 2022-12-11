import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmailValidatorDirective } from './validators/email-validator/email-validator.directive';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http'
import { RequestInterceptor } from './interceptors/request-interceptor';
import { SecretKeyValidatorDirective } from './validators/secret-key-validator/secret-key-validator.directive';





@NgModule({
  declarations: [
    EmailValidatorDirective,
    SecretKeyValidatorDirective
  ],
  imports: [
    CommonModule,
    
  ],exports:[
    EmailValidatorDirective
  ],providers:[
    {
      provide:HTTP_INTERCEPTORS,
      useClass:RequestInterceptor,
      multi:true
    }
  ]
})
export class SharedModule { }
