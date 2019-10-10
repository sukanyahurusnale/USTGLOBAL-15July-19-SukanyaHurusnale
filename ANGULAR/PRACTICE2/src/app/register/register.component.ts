import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidator } from './custom.validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html', 
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }
 get name()
 {
   return this.registerForm.get('name');
 }

 get phno()
 {
  return this.registerForm.get('phno');
 }
 get email()
 {
  return this.registerForm.get('email');
 }
 


  registerForm=new FormGroup({
    name:new FormControl('',[Validators.minLength(4),
                            Validators.required]),
    phno:new FormControl('',[Validators.minLength(10),
                            Validators.required]),
    email:new FormControl('',[Validators.minLength(4),
                              Validators.email,Validators.required,
                               CustomValidator.noSpace]),
                              
       
  })


  printForm(registerForm)
  {
      console.log(this.registerForm.value);
      registerForm.reset();
  }

  ngOnInit() {
  }

}
