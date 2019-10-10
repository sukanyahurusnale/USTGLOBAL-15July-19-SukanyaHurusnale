import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SukanyaService } from '../sukanya.service';

@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.css']
})
export class StudentDetailsComponent implements OnInit {
  

  constructor(private suku:SukanyaService,private router:Router) { }
  
  updateUser(stud1){

    this.suku.studentsData=stud1;
    this.router.navigateByUrl('/fireservice');    
  }

  deleteUser(stud1){
    this.suku.deleteData(stud1).subscribe(resData=>
      {
        console.log(resData);
        this.suku.getData();
      },err=>
      {
        console.log(err);
      })
  }

  ngOnInit() {
    this.suku.getData();
    
  }

}
