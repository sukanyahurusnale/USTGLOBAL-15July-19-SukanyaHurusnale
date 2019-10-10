import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  registerForm(register:NgForm){
       console.log(register.value);
       register.reset();
  }

  ngOnInit() {
  }



  

}
