import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmailValidatorDirective } from './validators/email-validator/email-validator.directive';
import { HTTP_INTERCEPTORS } from '@angular/common/http'
import { RequestInterceptor } from './interceptors/request-interceptor';





@NgModule({
  declarations: [
    EmailValidatorDirective
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
