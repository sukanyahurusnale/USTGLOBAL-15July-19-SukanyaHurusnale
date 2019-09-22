import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-carchild',
  templateUrl: './carchild.component.html',
  styles: []
})
export class CarchildComponent implements OnInit {

  @Input() cardetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
