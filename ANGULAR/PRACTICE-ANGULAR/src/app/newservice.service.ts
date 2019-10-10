import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class NewserviceService {
  constructor(private http: HttpClient) { }
  bookarray = {
    name: null,
    cost: null,
    id: null
  }
  booksdata: any = []; //this array used to display

  url: string = 'https://angular-cars-afda7.firebaseio.com/';


  getData() {
    return this.http.get(`${this.url}/books.json`).pipe(map(resData => {

      let b1 = [];
      for (let key in b1) {
        b1.push({ ...b1[key], id: key })
      }
      return b1;
    })).subscribe(resData => {
      this.booksdata = resData;
      console.log(resData);
    }, err => {
      console.log(err);
    });
  }

  postData(data) {
    return this.http.post(`${this.url}/books.json`, data);
  }

  deleteData(data) {

    return this.http.delete(`${this.url}books/${data.id}.json`, data);
  }
  updateData(data) {

    return this.http.put(`${this.url}books/${data.id}.json`, data);
  }

}

