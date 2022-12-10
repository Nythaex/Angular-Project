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
    return EmailValidatorDirective.validateEmail(this.appEmailValidator)
    
  }
  // registerOnValidatorChange?(fn: () => void): void {
  //   throw new Error('Method not implemented.');
  // }
  static validateEmail(appEmailValidator:String|undefined): ValidatorFn{
    return(control)=>{
      
      if(appEmailValidator===undefined){return null};
      const regex:RegExp=new RegExp(/^\w{5,}@\w+$/);
      if(!regex.test(control.value)){
        return {appEmailValidator:true};
      }else{  
        return {appEmailValidator:false};
      }  
    }    
  }
  
}
