import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
 

  constructor( private firebaseService:FirebaseService,private router:Router) { }


  updateUser(prod)
   {
    this.firebaseService.selectedUser=prod; 
  this.router.navigateByUrl('/addproduct');
    }

    deleteUser(prod)
    {
      this.firebaseService.deleteData(prod).subscribe(resData=>
        {
          console.log(resData);
          this.firebaseService.getData();
        },err=>
        {
          console.log(err);
        })
    }
    ngOnInit() {
      this.firebaseService.getData();
    }
  

}
