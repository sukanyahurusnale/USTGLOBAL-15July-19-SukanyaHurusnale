import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  reactiveform=new FormGroup({
    name:new FormControl('',[Validators.minLength(5),
                            Validators.required]),
    password:new FormControl('',[Validators.minLength(5),
                                 Validators.required])                        
  })

  constructor() { }

  get name()
  {
   return this.reactiveform.get('name');   
  }

  get password()
  {
    return this.reactiveform.get('password');
  }

  printForm(reactiveform)
  {
      console.log(this.reactiveform.value);
      reactiveform.reset();
  }

  ngOnInit() {
  }

}
