import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
 
  General:any[]=[];
  Technology:any[]=[];
  Sport:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=sports&apiKey=4fa36ccb647a45c0bb63e67806b5080f')
    .subscribe(resData=>
      {
        this.Sport=resData.articles;
        
        console.log(this.Sport);
        

      })
      http.get<any>('https://newsapi.org/v2/top-headlines?category=general&apiKey=4fa36ccb647a45c0bb63e67806b5080f')
      .subscribe(resData=>
        {
          this.General=resData.articles;
          
          console.log(this.General);
          
  
        })
        http.get<any>('https://newsapi.org/v2/top-headlines?category=technology&apiKey=4fa36ccb647a45c0bb63e67806b5080f')
    .subscribe(resData=>
      {
        this.Technology=resData.articles;
        console.log(this.Technology);
      })


    }

  ngOnInit() {
  }

}
