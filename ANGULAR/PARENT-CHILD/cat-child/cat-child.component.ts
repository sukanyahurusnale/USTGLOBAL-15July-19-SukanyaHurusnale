import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-cat-child',
  templateUrl: './cat-child.component.html',
  styleUrls: ['./cat-child.component.css']
})
export class CatChildComponent implements OnInit {

  constructor() { }

  @Input() animaldetails:any='';

  ngOnInit() {
  }

}
