import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databiniding',
  templateUrl: './databiniding.component.html',
  styleUrls: ['./databiniding.component.css']
})
export class DatabinidingComponent implements OnInit {

  imageUrl="https://cdn.pixabay.com/photo/2019/09/01/12/59/traffic-4445171__340.jpg";
 
  isApplicable=false;
  colorname="red";
  name="this is img";
  search=" ";
  bgcolor="green";
  constructor() {
    
  setInterval(()=>{
    this.isApplicable=!this.isApplicable;

  },2000);

  }
  printAlert(){
    alert("hello sukanya");
  }

 
  ngOnInit() {
  }

}
