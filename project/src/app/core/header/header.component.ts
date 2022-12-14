import { Component } from '@angular/core';
import { AuthService } from 'src/app/auth/auth-service.service';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {
  
  constructor(private authService:AuthService){
    
  }

  

  isLogedIn(){
    return this.authService.isLoggedIn
  }


}
