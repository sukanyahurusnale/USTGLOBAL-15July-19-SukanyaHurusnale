import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-entertainment-news',
  templateUrl: './entertainment-news.component.html',
  styleUrls: ['./entertainment-news.component.css']
})
export class EntertainmentNewsComponent implements OnInit {

  Entertainment:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=entertainment&apiKey=4fa36ccb647a45c0bb63e67806b5080f')
    .subscribe(resData=>
      {
        this.Entertainment=resData.articles;
        console.log(this.Entertainment);
      })
    }
  ngOnInit() {
  }

}
