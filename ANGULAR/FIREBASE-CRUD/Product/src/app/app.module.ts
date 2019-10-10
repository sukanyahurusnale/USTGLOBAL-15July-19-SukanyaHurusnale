import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {Router, RouterModule} from '@angular/router';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';


import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { AddProductComponent } from './add-product/add-product.component';
import { ProductDetailsComponent } from './product-details/product-details.component';

@NgModule({
  declarations: [
    HeaderComponent,
    AppComponent,
    HomeComponent,
    AddProductComponent,
    ProductDetailsComponent,

  ],
    
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
  
    RouterModule.forRoot(
      [ {path:'',component:HeaderComponent},
        {path:'home',component:HomeComponent},
        {path:'addproduct',component:AddProductComponent},
        {path:'productdetails',component:ProductDetailsComponent}
      ]
    )
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
