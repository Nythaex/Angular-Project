
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, filter, Observable, Subscription, tap } from 'rxjs';
import { IUser } from '../shared/model';


@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private user$$ = new BehaviorSubject<undefined | null | IUser>(undefined);
  user$ = this.user$$.asObservable().pipe(
    filter((val): val is IUser | null => val !== undefined)
  );

  user: IUser | null = null;

  get isLoggedIn() {
    return this.user !== null;
  }
  get getUser() {
  
    return this.user ;
  }


  subscription: Subscription;
  constructor(private http:HttpClient) {
    this.subscription = this.user$.subscribe(user => {
      this.user = user;
   })}
   checkExists(email:String){
    
    return this.http.post<Boolean>("/api/auth/email-exists",{email});
   }

   register(email:string,password:string,rePassword:string):Observable<IUser>{
    return this.http.post<IUser>("/api/auth/register",{email,password,rePassword}).pipe(tap(user => this.user$$.next(user)));
    
   }
   login(email:string,password:string):Observable<IUser>{
      return this.http.post<IUser>("/api/auth/login",{email,password}).pipe(tap(user => this.user$$.next(user)));
      
   }
   logout() {
    return this.http.post<void>('/api/auth/logout', {})
      .pipe(tap(() => this.user$$.next(null)));;
      
  }
  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }
}
