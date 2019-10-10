import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PracticeService } from '../practice.service';
import { NgForm } from '@angular/forms';
import { RouterModule, Router } from '@angular/router';

@Component({
  selector: 'app-studententry',
  templateUrl: './studententry.component.html',
  styleUrls: ['./studententry.component.css']
})
export class StudententryComponent implements OnInit {

  constructor(private  router: Router, private service: PracticeService) { }

  postUser(student: NgForm) {

    if(student.value.id){
      this.service.updateData(student.value).subscribe(res=>{
        console.log(res);
        this.service.getData();
        this.router.navigateByUrl('/studentdetails');
      },err=>{
        console.log(err);
      })
    }
    else{

      this.service.postData(student.value).subscribe(res => {
        console.log(res);
     this.service.getData();
     this.router.navigateByUrl('/studentdetails');
        student.reset();
      }, err => {
        console.log(err);
      })
    }
   
  }

  ngOnInit() {
  }

}
