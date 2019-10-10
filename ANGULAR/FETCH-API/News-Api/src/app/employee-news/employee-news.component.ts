import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-employee-news',
  templateUrl: './employee-news.component.html',
  styleUrls: ['./employee-news.component.css']
})
export class EmployeeNewsComponent implements OnInit {
Employee:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('http://localhost:4041/employee/get-all').subscribe(resData=>
      {
        this.Employee=resData.employees;
        console.log(this.Employee);
      })
   }

 deleteEmployee(emp){
   let u=this.Employee.indexOf(emp);
   this.Employee.splice(u,1);
 }
   
 updateEmployee(emp){
  let u=this.Employee.indexOf(emp);
  this.Employee.splice(u,0,1);
}
  
  ngOnInit() {
  }

}
