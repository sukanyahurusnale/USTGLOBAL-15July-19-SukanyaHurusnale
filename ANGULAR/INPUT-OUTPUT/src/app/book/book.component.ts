import { Component, OnInit } from '@angular/core';
import { NewserviceService } from '../newservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',                              
  styleUrls: ['./book.component.css']                   
})                                       
export class BookComponent implements OnInit {

  constructor(private newservice: NewserviceService, private router: Router) { }
  postUser(bookform: NgForm) {
    if (bookform.value.id) {
      this.newservice.updateData(bookform.value).subscribe(res => {
        console.log(res);
        this.newservice.getData();
        bookform.reset();
        this.router.navigateByUrl('/bookdetails');
      }, err => {
        console.log(err);
      });
    }
    else {
      this.newservice.postData(bookform.value).subscribe(res => {
        console.log(res);
        this.newservice.getData();
        bookform.reset();
        this.router.navigateByUrl('/bookdetails');
      }, err => {
        console.log(err);
      })
    }

  }



  ngOnInit() {

  }
}