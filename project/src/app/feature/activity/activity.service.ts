import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ActivityService {

  constructor(private http:HttpClient) {
   }

   addActivity(title:string ,description:string,location:string,image:string){


    
    return this.http.post<void>("/api/program/create-activity",{title,description,location,image});
   }
}
