
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http:HttpClient) {

   }
   register(username:string,email:string,password:string,rePassword:string):Observable<any[]>{
    return this.http.post<any>("/api/auth/register",{username,email,password,rePassword})
   }
   login(email:string,password:string):Observable<any[]>{
      return this.http.post<any>("/api/auth/login",{email,password})
   }
}
