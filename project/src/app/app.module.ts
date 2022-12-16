import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { CoreModule } from './core/core.module';
import { ActivityModule } from './feature/activity/activity.module';
import { ErrorComponentModule } from './feature/error-component/error-component.module';
import { HomeModule } from './feature/home/home.module';
import { RequestInterceptorProvider } from './shared/interceptors/request-interceptor';










@NgModule({
  declarations: [
    AppComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CoreModule,
    HomeModule,
    ActivityModule,
    ErrorComponentModule,
    HttpClientModule
   
    
  ],
  providers: [
    RequestInterceptorProvider,
    
  ],
  bootstrap: [AppComponent]

})
export class AppModule { }
