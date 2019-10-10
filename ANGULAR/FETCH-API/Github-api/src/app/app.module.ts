import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GithubApiComponent } from './github-api/github-api.component';
import { TypicodeApiComponent } from './typicode-api/typicode-api.component';
import { HeaderComponent } from './header/header.component';
//  import { HttpClient } from  '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    GithubApiComponent,
    TypicodeApiComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule.forRoot ([
        {path: '', component: HeaderComponent},
        {path: 'github', component: GithubApiComponent},
        {path: 'typicode', component: TypicodeApiComponent}
       ])
],
   providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
