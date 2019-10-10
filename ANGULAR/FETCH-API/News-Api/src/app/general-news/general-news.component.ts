import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-general-news',
  templateUrl: './general-news.component.html',
  styleUrls: ['./general-news.component.css']
})
export class GeneralNewsComponent implements OnInit {

  General:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=general&apiKey=4fa36ccb647a45c0bb63e67806b5080f')
    .subscribe(resData=>
      {
        this.General=resData.articles;
        console.log(this.General);
      })
    }

  ngOnInit() {
  }

}
