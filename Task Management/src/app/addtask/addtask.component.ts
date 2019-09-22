import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { TaskServiceService } from '../task-service.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  constructor(private service: TaskServiceService, private router: Router) { }
  postTask(taskform: NgForm) {
    if (taskform.value.id) {
      this.service.updateData(taskform.value).subscribe(res => {
        console.log(res);
        this.service.getData();
        
        this.router.navigateByUrl('/viewtask');
        taskform.reset();
      }, err => {
        console.log(err);
      });
    }
    else {
      this.service.postData(taskform.value).subscribe(res => {
        console.log(res);
        this.service.getData();
        this.router.navigateByUrl('/viewtask');
        taskform.reset();
      }, err => {
        console.log(err);
      })
    }

  }


  ngOnInit() {
    
  }

}
