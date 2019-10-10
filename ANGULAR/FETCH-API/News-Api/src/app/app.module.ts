import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http'




import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NewsComponent } from './news/news.component';
import { HealthNewsComponent } from './health-news/health-news.component';
import { EntertainmentNewsComponent } from './entertainment-news/entertainment-news.component';
import { BussinessNewsComponent } from './bussiness-news/bussiness-news.component';
import { GeneralNewsComponent } from './general-news/general-news.component';
import { SportsComponent } from './sports/sports.component';
import { TechnologyNewsComponent } from './technology-news/technology-news.component';
import { HomeComponent } from './home/home.component';
import { EmployeeNewsComponent } from './employee-news/employee-news.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NewsComponent,
    HealthNewsComponent,
    EntertainmentNewsComponent,
    BussinessNewsComponent,
    GeneralNewsComponent,
    SportsComponent,
    TechnologyNewsComponent,
    HomeComponent,
    EmployeeNewsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(
      [
        {path:'',component:HeaderComponent},
        {path:'home',component:HomeComponent},
        {path:'news',component:NewsComponent},
        {path:'bussiness',component:BussinessNewsComponent},
        {path:'entertainment',component:EntertainmentNewsComponent},
        {path:'general',component:GeneralNewsComponent},
        {path:'sport',component:SportsComponent},
        {path:'health',component:HealthNewsComponent},
        {path:'technology',component:TechnologyNewsComponent},
        {path:'emp',component:EmployeeNewsComponent}
      ]),
      HttpClientModule
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
