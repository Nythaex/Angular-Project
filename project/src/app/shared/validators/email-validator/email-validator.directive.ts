import { Directive, Input } from '@angular/core';
import { AbstractControl, NG_VALIDATORS, ValidationErrors, Validator, ValidatorFn } from '@angular/forms';

@Directive({
  selector: '[appEmailValidator]',
  providers:[
     {
      provide: NG_VALIDATORS,
      useExisting: EmailValidatorDirective,
      multi:true
     }
  ]
})
export class EmailValidatorDirective implements Validator{
  

  
   
  @Input() appEmailValidator: String | undefined;

  constructor() { }
  validate(control: AbstractControl<any, any>): ValidationErrors | null {
    
    return EmailValidatorDirective.validateEmail()(control);
    
  }
  // registerOnValidatorChange?(fn: () => void): void {
  //   throw new Error('Method not implemented.');
  // }
  static validateEmail(): ValidatorFn{
    
    return(control)=>{
      
      const regex:RegExp=new RegExp(/^\w{5,}@\w+.\w+$/);
      if(!regex.test(control.value)){
        if(control.value===''){
          return null;
        }
        return {appEmailValidator:true};
      }else{  
        return null;
      }  
    }    
  }
  
}
