import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent  {
  redColor=true;
      name='sukanya';
      ParagraphStyle=true;
      padding="50px";
      columnSpan=2;
      imgURL='https://cdn.pixabay.com/photo/2015/06/25/17/56/people-821624__340.jpg';
      textClasses="bg-success text-white";

  constructor() {

    setTimeout(()=>{
          this.redColor=false;
          this.ParagraphStyle=false;
    },5000)

    
   }

  
}
