import { Component, OnInit } from '@angular/core';
import{HttpClient} from '@angular/common/http';
import { AngularserviceService } from '../angularservice.service';

@Component({
  selector: 'app-githubapi',
  templateUrl: './githubapi.component.html',
  styleUrls: ['./githubapi.component.css']
})
export class GithubapiComponent implements OnInit {

  
  constructor(private angular:AngularserviceService,private http:HttpClient){}

    deleteUser(user){
        let index=this.angular.usersArray.indexOf(user);
       this.angular.usersArray.splice(index,1);
    }


  ngOnInit() {
   
  }

}
