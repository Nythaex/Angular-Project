import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest, HTTP_INTERCEPTORS} from '@angular/common/http';
import { Injectable, Provider } from '@angular/core';
import { Observable } from 'rxjs';
const API_URL="http://localhost:8080"

@Injectable()
export class RequestInterceptor implements HttpInterceptor
{
    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {    
        if(req.url.startsWith('/api')){
            req=req.clone({
                url:req.url.replace('/api',API_URL), 
            }
            );
            
        }
        return next.handle(req);
    }

}

export const RequestInterceptorProvider:Provider=
    {
        provide:HTTP_INTERCEPTORS,
        useClass:RequestInterceptor,
        multi:true
      
}