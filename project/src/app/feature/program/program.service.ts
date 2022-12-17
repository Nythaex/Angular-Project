import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IActivity } from 'src/app/shared/model/Activity';

@Injectable({
  providedIn: 'root'
})
export class ProgramService {

  constructor(private http:HttpClient) { 
  }

  changeProgram(activity1:number,activity2:number,activity3:number,activity4:number,activity5:number,activity6:number){ 
    return this.http.post<void>("/api/program/change",{activity1,activity2,activity3,activity4,activity5,activity6});
  }
    getProgram(){ 
      return this.http.get<IActivity[]>("/api/program");
    }

}

