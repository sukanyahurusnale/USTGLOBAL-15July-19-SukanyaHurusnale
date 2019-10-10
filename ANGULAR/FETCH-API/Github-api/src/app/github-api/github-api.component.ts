import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-github-api',
  templateUrl: './github-api.component.html',
  styleUrls: ['./github-api.component.css']
})
export class GithubApiComponent implements OnInit {


  github: any [] = [] ;
  constructor(private http: HttpClient){
    http.get<any>(`https://api.github.com/users`).subscribe(res => {
        this.github = res;
        console.log(this.github);

      } );

  }
  ngOnInit() {
  }

}
