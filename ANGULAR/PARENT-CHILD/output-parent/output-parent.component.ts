import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-output-parent',
  templateUrl: './output-parent.component.html',
  styleUrls: ['./output-parent.component.css']
})
export class OutputParentComponent implements OnInit {


  pData='data from parent';
 //dataFromParent='data from parent';
  constructor() { }

  ngOnInit() {
  }

}
