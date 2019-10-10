import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private firebaseService:FirebaseService,private router:Router) { }
  postProduct(userForm)
  {
    this.firebaseService.postData(userForm.value)
    .subscribe(resData=>
      {
        console.log(resData);
        userForm.reset();
      },err=>
      {
        console.log(err);
      })
      
  }
  ngOnInit() {
  }

}
