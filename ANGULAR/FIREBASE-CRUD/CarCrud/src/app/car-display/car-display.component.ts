import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

  @Component({
  selector: 'app-car-display',
  templateUrl: './car-display.component.html',
  styleUrls: ['./car-display.component.css']
})
export class CarDisplayComponent implements OnInit {

  constructor( private firebaseService:FirebaseService,private router:Router) { }


  updateUser(cardisp)
   {
    this.firebaseService.selectedUser=cardisp; 
  this.router.navigateByUrl('/carentry');
    }

    deleteUser(cardisp)
    {
      this.firebaseService.deleteData(cardisp).subscribe(resData=>
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

  


