import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { TempFormComponent } from './temp-form/temp-form.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { CatParentComponent } from './cat-parent/cat-parent.component';
import { CatChildComponent } from './cat-child/cat-child.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FetchapiComponent } from './fetchapi/fetchapi.component';
import { HttpClient } from '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';
import { OutputParentComponent } from './output-parent/output-parent.component';
import { OutputChildComponent } from './output-child/output-child.component';
import { StudentComponent } from './student/student.component';
import { StudentDetailsComponent } from './student-details/student-details.component';
import { BookComponent } from './book/book.component';
import { BookDetailsComponent } from './book-details/book-details.component';
import { DatabinidingComponent } from './databiniding/databiniding.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TempFormComponent,
    ReactiveFormComponent,
    CatParentComponent,
    CatChildComponent,
    FetchapiComponent,
    OutputParentComponent,
    OutputChildComponent,
    StudentComponent,
    StudentDetailsComponent,
    BookComponent,
    BookDetailsComponent,
    DatabinidingComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path:'',component:HeaderComponent},
      {path:'tempform',component:TempFormComponent},
      {path:'reactform',component:ReactiveFormComponent},
      {path:'catparent',component:CatParentComponent},
      {path:'fetchapi',component:FetchapiComponent},
      {path:'output',component:OutputParentComponent},
      {path:'fireservice',component:StudentComponent},
      {path:'display',component:StudentDetailsComponent},
      {path:'book',component:BookComponent},
      {path:'bookdetails',component:BookDetailsComponent},
      {path:'binding',component:DatabinidingComponent}
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
