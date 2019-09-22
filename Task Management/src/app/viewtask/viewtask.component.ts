import { Component, OnInit } from '@angular/core';
import { TaskServiceService } from '../task-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewtask',
  templateUrl: './viewtask.component.html',
  styleUrls: ['./viewtask.component.css']
})
export class ViewtaskComponent implements OnInit {

  constructor(private service:TaskServiceService,
    private router:Router) { }

  updatetask(b2){

    this.service.obj=b2;
   this.router.navigateByUrl('/addtask');
  }

  deletetask(b2){
    this.service.deleteData(b2).subscribe(res=>{
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
