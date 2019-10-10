import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators'
import { externalStudent } from './studententry/externalstudent';

@Injectable({
  providedIn: 'root'
})
export class PracticeService {
  
  student1: any = [];
  url: String = 'https://angular-try-30b78.firebaseio.com/';

  constructor(private http: HttpClient) { }


  exStudent:externalStudent={
    name:null,
    age:null,
    id:null
  
  }
  getData(){
    return this.http.get(`${this.url}/studentdata.json`).pipe(map(resData=>{
      let stud=[];
      for(let key in resData){
        stud.push({...resData[key],id:key})
      }
      return stud;
    }))
    .subscribe(res=>{
       this.student1=res;
       console.log(res);
    },err=>{
      console.log(err);
    });
  }

  postData(data) {
    return this.http.post(`${this.url}/studentdata.json`, data);
  }
  deleteData(data) {
    return this.http.delete(`${this.url}studentdata/${data.id}json`, data);
  }
  updateData(data) {
    return this.http.put(`${this.url}studentdata/${data.id}.json`, data);
  }

}
