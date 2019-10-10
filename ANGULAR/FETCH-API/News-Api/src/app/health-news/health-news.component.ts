import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-health-news',
  templateUrl: './health-news.component.html',
  styleUrls: ['./health-news.component.css']
})
export class HealthNewsComponent implements OnInit {

  Health:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=health&apiKey=4fa36ccb647a45c0bb63e67806b5080f')
    .subscribe(resData=>
      {
        this.Health=resData.articles;
        console.log(this.Health);
      })
    }

  ngOnInit() {
  }

}
