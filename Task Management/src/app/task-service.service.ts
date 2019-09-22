import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators'
import { Task } from './viewtask/task';

@Injectable({
  providedIn: 'root'
})
export class TaskServiceService {

  obj:Task={
   
    name:null,
    id:null
  }
  taskArray:any[]=[];
  url:String='https://product-e0814.firebaseio.com/';

  constructor(private http:HttpClient) { }

  getData() {
    return this.http.get(`${this.url}/task.json`).pipe(map(resData => {

      let b1 = [];
      for (let key in resData) {
        b1.push({ ...resData[key], id: key })
      }
      return b1;
    })).subscribe(resData => {
      this.taskArray = resData;
      console.log(resData);
    }, err => {
      console.log(err);
    });
  }

  postData(data){
    return this.http.post(`${this.url}/task.json`,data);
    }
  
    deleteData(data) {

      return this.http.delete(`${this.url}task/${data.id}.json`, data);
    }
    updateData(data) {
  
      return this.http.put(`${this.url}task/${data.id}.json`, data);
    }

  }

