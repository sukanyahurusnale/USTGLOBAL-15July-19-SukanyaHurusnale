import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-temp-form',
  templateUrl: './temp-form.component.html',
  styleUrls: ['./temp-form.component.css']
})
export class TempFormComponent implements OnInit {

  constructor() { }

  users=[];
  ngOnInit() {
  }

  printForm(loginForm)
  {
    console.log(this.users);
    this.users.push(loginForm.value);
    loginForm.reset();
    
  }
}
