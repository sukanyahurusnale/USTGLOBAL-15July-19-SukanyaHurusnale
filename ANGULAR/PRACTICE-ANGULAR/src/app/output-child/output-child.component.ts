import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-output-child',
  templateUrl: './output-child.component.html',
  styleUrls: ['./output-child.component.css']
})
export class OutputChildComponent implements OnInit {

  @Input() dataFromParent:'';
  @Output() childData=new EventEmitter();

  sendUrl(url)
  {
    this.childData.emit(url);
  }

  constructor() { }

  ngOnInit() {
    this.childData.emit("this is child component");
  }

}
