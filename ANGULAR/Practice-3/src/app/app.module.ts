import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import{FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './login/login.component';
import { FirebaseComponent } from './firebase/firebase.component';
import { ContactComponent } from './contact/contact.component';
import { from } from 'rxjs';
import { StudententryComponent } from './studententry/studententry.component';
import { StudentdisplayComponent } from './studentdisplay/studentdisplay.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    UsersComponent,
    AboutComponent,
    LoginComponent,
    FirebaseComponent,
    ContactComponent,
    StudententryComponent,
    StudentdisplayComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(
      [
        {path:'',component:HeaderComponent},
        {
          path:'home',component:HomeComponent
        },
        {path:'users',component:UsersComponent},
        {path:'about',component:AboutComponent},
        {path:'login',component:LoginComponent},
        {path:'firbase',component:FirebaseComponent},
        {path:'contact',component:ContactComponent},
        {
          path:'studententry',component:StudententryComponent
        },
        {path:'studentdetails',component:StudentdisplayComponent}
      ]),
      FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
