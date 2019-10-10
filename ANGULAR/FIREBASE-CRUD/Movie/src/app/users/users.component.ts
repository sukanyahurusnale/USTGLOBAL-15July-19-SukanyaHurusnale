import { Component, OnInit } from '@angular/core';
import { FirebaseComponent } from '../firebase/firebase.component';
import { FirebaseService } from '../firebase.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor( private firebaseService:FirebaseService,private router:Router) { }


  updateUser(user)
   {
    this.firebaseService.selectedUser=user; 
  this.router.navigateByUrl('/firebase');

  /*   this.firebaseservice.updateData(user).subscribe(resData=>
        
      {
        console.log(resData);
      },err=>
      
      {
          console.log(err);
      })    
 */
    }


    // delete method
       
    deleteUser(user)
    {
      this.firebaseService.deleteData(user).subscribe(resData=>
        {
          console.log(resData);
          this.firebaseService.getData();
        })
    }



       
  ngOnInit() {

    this.firebaseService.getData();
    // console.log(this.firebaseservice.users);
  }

}
