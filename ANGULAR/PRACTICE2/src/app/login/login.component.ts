import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

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
