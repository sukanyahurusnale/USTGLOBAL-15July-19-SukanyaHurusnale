import { Injectable } from '@angular/core';
//import { HttpClientmodule } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Product } from './product-details/user';
import {map} from   'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService {

 url :string='https://product-e0814.firebaseio.com/';
 selectedUser: Product = {
  // data of user.ts clss
  image:null,
  brand: null,
  id:null
  
  }
  constructor( private http:HttpClient) { }

  postData(data)
  {
    return this.http.post(`${this.url}/product.json`,data);
  }
 

  products:any=[];
  getData()
  {
    return this.http.get(`${this.url}/product.json`).pipe(map(resData=>
      {
         let usersArray=[];
         for(let key in resData)
         {
           usersArray.push({...resData[key],id:key})
         }
         return usersArray;
      }))   //pipe
    .subscribe(data=> 
      {
        this.products=data;
        console.log(data);
      },err=>
      {
        console.log(err);
      });
    }
    updateData(data)
    {
          return this.http.put(`${this.url}product/${data.id}.json`,data);
    }
    
    // delete user
    deleteData(data)
    {
      return this.http.delete(`${this.url}product/${data.id}.json`,data);
    }
    
    ngDoCheck()
    {
      this.getData();
    }
}
