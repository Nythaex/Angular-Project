import { FormGroup, ValidatorFn } from "@angular/forms";

export function matchPasswordValidator(controlName1 :string,controlName2:string):ValidatorFn{
    return (control)=>{
        const formGroup=control as FormGroup;
        return formGroup.get(controlName1)?.value===formGroup.get(controlName2)?.value ? null :{matchPasswordValidator:true};
     }

}