import { Directive, Input } from '@angular/core';
import { AbstractControl, NG_VALIDATORS, ValidationErrors, Validator, ValidatorFn } from '@angular/forms';
@Directive({
  selector: '[appSecretKeyValidator]',
  providers:[
     {
      provide: NG_VALIDATORS,
      useExisting: SecretKeyValidatorDirective,
      multi:true
     }
  ]
})
export class SecretKeyValidatorDirective implements Validator{
  

  
   
  @Input() secretKeyValidator: String | undefined;

  constructor() { }
  validate(control: AbstractControl<any, any>): ValidationErrors | null {
    return SecretKeyValidatorDirective.validateKey()
    
  }
  
  static validateKey(): ValidatorFn{
    return(control)=>{
      
      
      
      if(control.value!=="kP.2L~]3>Q~d5/A*u:GO[#XH_0%!Aa"){
        if(control.value===""){
          return null;
        }
        return {appSecretKeyValidator:true};

      }else{  
        
        return null;
      }  
    }    
  }
  
}

