import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way',
  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css']
})
export class TwoWayComponent implements OnInit {

  backgroundColor='red';
 /*  colorChange()
  { if(this.backgroundColor==='red')
  {
    this.backgroundColor="blue";
  }
  else{
    this.backgroundColor="red";
  } */

    colorChange(data)
    {
      this.backgroundColor=data;
    }
  
  constructor() { }

 buttonEvent(data)
 {
   console.log(data);
 }


  ngOnInit() {
  }

}
