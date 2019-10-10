import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-bussiness-news',
  templateUrl: './bussiness-news.component.html',
  styleUrls: ['./bussiness-news.component.css']
})
export class BussinessNewsComponent implements OnInit {
Bussiness:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=business&apiKey=4fa36ccb647a45c0bb63e67806b5080f')
    .subscribe(resData=>
      {
        this.Bussiness=resData.articles;
        console.log(this.Bussiness);
      })
   }


  ngOnInit() {
  }

}
