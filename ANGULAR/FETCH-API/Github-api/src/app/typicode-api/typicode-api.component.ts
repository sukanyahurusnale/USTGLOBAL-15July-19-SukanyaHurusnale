import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-typicode-api',
  templateUrl: './typicode-api.component.html',
  styleUrls: ['./typicode-api.component.css']
})
export class TypicodeApiComponent implements OnInit {
  typicodet: any [] = [] ;
  constructor(private http: HttpClient){ 
       http.get<any>(`http://jsonplaceholder.typicode.com/posts`).subscribe(res => {
        this.typicodet = res;
        console.log(this.typicodet);

      } );
    }
  ngOnInit() {
  }

}
