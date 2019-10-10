import { Component, OnInit } from '@angular/core';
import { SukanyaService } from '../sukanya.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  constructor(private suku:SukanyaService,private router:Router) { }
  postUser(studForm:NgForm)
   {
      if(studForm.value.id)
      {
        this.suku.updateData(studForm.value).subscribe(Data=>
          {
            console.log(Data);
            this.suku.getData();
            
            this.router.navigateByUrl('/display');
            studForm.reset();
          },err=> {
             console.log(err);
          });
      }
        else{
         this.suku.postData(studForm.value).subscribe(resData=>
          {
            console.log(resData);
            this.suku.getData();
            studForm.reset();
            this.router.navigateByUrl('/display');
          },err=>
          {
            console.log(err);
          });
        }
  }
  ngOnInit() {

   
  }

}
