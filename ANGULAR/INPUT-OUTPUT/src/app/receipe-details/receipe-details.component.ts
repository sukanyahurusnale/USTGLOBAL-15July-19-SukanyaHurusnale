import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-receipe-details',
  templateUrl: './receipe-details.component.html',
  styleUrls: ['./receipe-details.component.css']
})
export class ReceipeDetailsComponent implements OnInit {
  @Input() receipedetails='';
  constructor() { }

  ngOnInit() {
  }

}
