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
    return SecretKeyValidatorDirective.validateKey(this.secretKeyValidator)
    
  }
  
  static validateKey(appSecretKeyValidator:String|undefined): ValidatorFn{
    return(control)=>{
      
      if(appSecretKeyValidator===undefined){return null};
      
      if(control.value!=="kP.2L~]3>Q~d5/A*u:GO[#XH_0%!Aa"){
        console.log(1);
        
        if(control.value===""){
          return {appSecretKeyValidator:false};
        }
        return {appSecretKeyValidator:true};

      }else{  
        
        return {appSecretKeyValidator:false};
      }  
    }    
  }
  
}

