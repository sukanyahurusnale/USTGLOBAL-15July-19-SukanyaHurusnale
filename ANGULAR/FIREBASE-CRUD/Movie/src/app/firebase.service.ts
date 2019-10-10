import { Injectable, DoCheck } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';
// import { NumberSymbol } from '@angular/common';
import {User} from './users/user';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService implements DoCheck {

url: string = 'https://angular-http-55c01.firebaseio.com/';
// object
selectedUser: User = {
// data of user.ts clss
name: null,
email : null,
phno : null,
id: null
}



constructor( private http:HttpClient) { }
// get data
  users=[];
  getData()
  {
    return this.http.get(`${this.url}/users.json`).pipe(map(resData=>
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
          this.users=data;
          console.log(data);
        },err=>
        {
          console.log(err);
        });
  }
// post data
  postData(data)
  {
    return this.http.post(`${this.url}/users.json`,data);
  }


// update data
updateData(data)
{
      return this.http.put(`${this.url}users/${data.id}.json`,data);
}

// delete user
deleteData(data)
{
  return this.http.delete(`${this.url}users/${data.id}.json`);
}


  ngDoCheck()
  {
    this.getData();
  }
}
