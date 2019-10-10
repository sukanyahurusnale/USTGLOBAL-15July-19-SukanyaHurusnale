import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }
user=[];
printForm(loginForm:NgForm){
  console.log(loginForm.value);
  this.user.push(loginForm.value);
  loginForm.reset();
}


deleteForm(users){
let index=this.user.indexOf(users);
this.user.splice(index,1);
}
  ngOnInit() {
  }

}
