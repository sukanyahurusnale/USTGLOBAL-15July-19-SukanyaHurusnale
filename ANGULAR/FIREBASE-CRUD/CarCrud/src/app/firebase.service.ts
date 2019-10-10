import { Injectable, DoCheck } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';
import { Car } from './car-display/car';
// import { UserCars } from './user-cars';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService {
  url:string='https://angular-cars-afda7.firebaseio.com/';



  selectedUser: Car = {
    // data of user.ts clss
    brand: null,
    model : null,
    unitsold : null,
    yearofrelease : null,
    cost : null,
    id: null
    }
  constructor( private http:HttpClient){}

  /* postData(data)
  {
    return this.http.get<any>(`${this.url}/users.json`,data);
  } */
  

  cars:any=[];
  getData()
  {
    return this.http.get(`${this.url}/cars.json`).pipe(map(resData=>
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
        this.cars=data;
        console.log(data);
      },err=>
      {
        console.log(err);
      });
    }

  postData(data)
  {
    return this.http.post(`${this.url}/cars.json`,data);
  } 


// update data
updateData(data)
{
      return this.http.put(`${this.url}cars/${data.id}.json`,data);
}

// delete user
deleteData(data)
{
  return this.http.delete(`${this.url}cars/${data.id}.json`,data);
}

ngDoCheck()
  {
    this.getData();
  }
}


