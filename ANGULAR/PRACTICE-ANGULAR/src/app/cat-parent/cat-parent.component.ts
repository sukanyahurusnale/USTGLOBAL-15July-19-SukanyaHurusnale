import { Component, OnInit } from '@angular/core';
//import { triggerAsyncId } from 'async_hooks';

@Component({
  selector: 'app-cat-parent',
  templateUrl: './cat-parent.component.html',
  styleUrls: ['./cat-parent.component.css']
})
export class CatParentComponent implements OnInit {

  constructor() { }

 animaldata:any='';
 sendAnimal(animal)
{
  this.animaldata=animal;
  //console.log(this.animaldata);
}

  Animal:any=[
    {
      name:'tiger',
      img:'https://image.shutterstock.com/image-photo/bengal-tiger-forest-show-head-260nw-268586531.jpg',
      description:'this is tiger'
    },
    {
      name:'lion',
      img:'https://image.shutterstock.com/image-photo/roaringyawing-lion-260nw-696622699.jpg',
      description:'this is lion'
    },
    {
      name:'dog',
      img:'https://cdn.pixabay.com/photo/2016/01/05/17/51/dog-1123016__340.jpg',
      description:'this is dog'
    }
  ];
  ngOnInit() {
  }

}
