import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from '@angular/common/http';
import { Observable } from 'rxjs';
const API_URL="http://localhost:4200/"

export class RequestInterceptor implements HttpInterceptor
{
    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        if(req.url.startsWith('/api')){
            req=req.clone({
                url:req.url.replace('/api',API_URL),withCredentials:true
            }
            );
            
        }
        throw new Error('Method not implemented.');
    }

}