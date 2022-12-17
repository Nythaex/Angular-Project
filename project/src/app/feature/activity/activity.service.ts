import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IActivityIdAndTitle } from 'src/app/shared/model';

@Injectable({
  providedIn: 'root'
})
export class ActivityService {

  constructor(private http:HttpClient) {
   }

   addActivity(title:string ,description:string,location:string,image:string){
    return this.http.post<void>("/api/program/create-activity",{title,description,location,image});
   }
   getAllOnlyIdAndTitle(){
    return this.http.get<IActivityIdAndTitle[]>("/api/activities/getAll/onlyTitle");
   }
}
