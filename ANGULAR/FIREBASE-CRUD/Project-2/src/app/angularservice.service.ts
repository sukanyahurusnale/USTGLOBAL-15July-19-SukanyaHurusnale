import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AngularserviceService {

  usersArray:any[]=[];
  url:string='https://api.github.com/users';

  constructor(private http:HttpClient) {
    http.get<any>('https://api.github.com/users').subscribe( resData=>{  
      this.usersArray=resData;
      console.log(this.usersArray);
    }) 
  }
 
  deleteData() {
  return this.http.delete(`${this.url}/users`).pipe(map(resData=>{
      let stud=[];
      for(let key in resData)
      {
        stud.push({...resData[key],id:key})
      }
      return stud;
    })).subscribe(resData=>{
        this.usersArray=resData;
        console.log(resData);
      },err=>{
        console.log(err);
      });
}

}

