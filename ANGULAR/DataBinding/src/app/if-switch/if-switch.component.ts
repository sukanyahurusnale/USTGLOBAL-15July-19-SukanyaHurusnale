import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-if-switch',
  templateUrl: './if-switch.component.html',
  styleUrls: ['./if-switch.component.css']
})
export class IfSwitchComponent implements OnInit {

  condition=false ;
  person="omya";

  constructor() { }


  printInput(element)
  {
    console.log(element.value);
  }

  ngOnInit() {
  }

}
