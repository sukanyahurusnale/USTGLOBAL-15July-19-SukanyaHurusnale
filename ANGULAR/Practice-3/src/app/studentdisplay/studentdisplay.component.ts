import { Component, OnInit } from '@angular/core';
import { PracticeService } from '../practice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-studentdisplay',
  templateUrl: './studentdisplay.component.html',
  styleUrls: ['./studentdisplay.component.css']
})
export class StudentdisplayComponent implements OnInit {

  constructor(private service:PracticeService,private router:Router) { }

  updateUser(p2){
  this.service.exStudent=p2;
  this.router.navigateByUrl('/studententry');
  }
  deleteUser(p2){
    this.service.deleteData(p2).subscribe(res=>{
      console.log(res);
      this.service.getData();

    },err=>{
      console.log(err);
    })


  }
  ngOnInit() {
    this.service.getData();
  }

}
