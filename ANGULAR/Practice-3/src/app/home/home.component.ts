import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  news: any[] = [];
  constructor(private http: HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=entertainment&apiKey=4fa36ccb647a45c0bb63e67806b5080f').subscribe(resData => {
      this.news = resData.articles;
      console.log(this.news);
    })
  }

  ngOnInit() {
  }

}
