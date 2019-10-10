import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  news:any[]=[];
  pdata:any='';
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=entertainment&apiKey=4fa36ccb647a45c0bb63e67806b5080f')
    .subscribe(resData=>{
      this.news=resData.articles;

    })
   }

   sendData(ne){
     this.pdata=ne;
   }

  ngOnInit() {
  }

}
