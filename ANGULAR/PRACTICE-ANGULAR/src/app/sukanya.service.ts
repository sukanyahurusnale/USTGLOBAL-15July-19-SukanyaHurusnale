import { Injectable,DoCheck } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators'
import { StudUser } from './student/studuser';

@Injectable({
  providedIn: 'root'
})
export class SukanyaService {

studentsData:StudUser={
  name:null,
  address:null,
  age:null,
  id:null
}  
  url:string='https://angular-try-30b78.firebaseio.com/';
  constructor(private http:HttpClient) { }

  studArray:any=[];
  getData()
  {
    return this.http.get(`${this.url}/student.json`).pipe(map(resData=>
      {
        let stud=[];
        for(let key in resData)
        {
          stud.push({...resData[key],id:key})
        }
        return stud;
      }))
      .subscribe(resData=>
        {
          this.studArray=resData;
          console.log(resData);
        },err=>
        {
          console.log(err);
        });
  }
  postData(data)
  {
    return this.http.post(`${this.url}/student.json`,data);
  }
  deleteData(data)
  {
    return this.http.delete(`${this.url}student/${data.id}.json`,data);
  }
  updateData(data)
  {
    return this.http.put(`${this.url}student/${data.id}.json`,data);
  }


ngDoCheck()
{
this.getData();
}
}