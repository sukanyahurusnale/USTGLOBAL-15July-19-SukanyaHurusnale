import { Component, OnInit } from '@angular/core';
import { splitClasses } from '@angular/compiler';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
condition=false;

users=[
   {
     id:1,
     name:'sukanya',
     age:12
   },

   {
    id:2,
    name:'rohini',
    age:18
  },
  {
    id:3,
    name:'balaji',
    age:16
  },
  {
    id:4,
    name:'pratik',
    age:22
  },
  {
    id:5,
    name:'shweta',
    age:20
  }


];

removeUser(i)
{
  let index=this.users.indexOf(i) ;

 /*  let v= confirm('are you sure');
   if(v===true)
   {
  this.users.splice(index, 1);
}  
else{
  this.users.splice(index, 0);
}
 */

this.users.splice(index, 1);
this.condition=true;



}
  constructor() { }

  ngOnInit() {
  }

}
