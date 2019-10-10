import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import {NgForm} from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-car-entry',
  templateUrl: './car-entry.component.html',
  styleUrls: ['./car-entry.component.css']
})
export class CarEntryComponent implements OnInit {
  
  constructor(private firebaseService:FirebaseService,private router:Router) { }
  postUser(userForm: NgForm) {
    if ( userForm.value.id ){
        this.firebaseService.updateData(userForm.value).subscribe(resData =>{
            console.log(resData);
            this.firebaseService.getData();
            userForm.reset();
            this.router.navigateByUrl('/cardetails');
            
          },err=>
          {
            console.log(err);
          })
    }    
     else{
           this.firebaseService.postData(userForm.value).subscribe(resData=>
              {
                console.log(resData);
                this.firebaseService.getData();
                userForm.reset();
                this.router.navigateByUrl('/cardetails');
            
                
              },err=>
              {
                console.log(err);
              })
    }      
}
  ngOnInit() {
  }

}
