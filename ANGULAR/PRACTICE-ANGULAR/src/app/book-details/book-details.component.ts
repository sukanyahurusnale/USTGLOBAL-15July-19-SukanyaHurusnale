import { Component, OnInit } from '@angular/core';
import { NewserviceService } from '../newservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.component.html',
  styleUrls: ['./book-details.component.css']
})
export class BookDetailsComponent implements OnInit {

  constructor(private newservice:NewserviceService,private router:Router) { }


  updateUser(b2){

    this.newservice.bookarray=b2;
    this.router.navigateByUrl('/book');

  }


  deleteUser(b2){
    this.newservice.deleteData(b2).subscribe(res=>{
      console.log(res);
      this.newservice.getData();
    },err=>{
      console.log(err);
    })

  }

  ngOnInit() {
    this.newservice.getData();
  }


}
