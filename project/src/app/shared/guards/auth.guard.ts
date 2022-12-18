import { Injectable } from "@angular/core";
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from "@angular/router";
import { map, Observable, take } from "rxjs";
import { AuthService } from "src/app/auth/auth-service.service";




@Injectable({
    providedIn: 'root'
  })
export class AuthGuard implements CanActivate {

    constructor(private authService:AuthService,private router:Router){}

    canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | UrlTree | Observable<boolean | UrlTree> | Promise<boolean | UrlTree> {
       

        if(!this.authService.isLoggedIn){
           this.router.navigate(["/auth/login"]);
        }
        return this.authService.isLoggedIn

        
            
        // return this.authService.isLoggedIn===route.data['loginRequired'];
      //  return this.authService.user$.pipe(
          
      //     map(user => {
      //       const loginRequired = route.data['loginRequired'];
      //       console.log(loginRequired);
            
      //       if (loginRequired === undefined || !!user === loginRequired) { return true; }
      //       const returnUrl = route.url.map(u => u.path).join('/');
      //       return !!user ?
      //         this.router.createUrlTree(['/'], { queryParams: { returnUrl } }) :
      //         this.router.createUrlTree(['/auth/login'], { queryParams: { returnUrl } });
      //     })
      //   );
   
}}
