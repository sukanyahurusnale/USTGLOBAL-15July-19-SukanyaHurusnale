import { Component, OnInit ,OnDestroy} from '@angular/core';
import { UserService } from '../user.service';
//import { interval,Subscription} from 'rxjs';

@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css'],
  providers:[UserService]

})
export class ObservablesComponent implements OnInit,OnDestroy {
 // mysubscription:Subscription;
  constructor( private userService:UserService) { }

  ngOnInit() {

     this.userService.printdetails();
    
  }
  ngOnDestroy(){

  }
}
  /* ngOnInit() {

    this.mysubscription = interval(1000).subscribe(data=>{
       console.log(data); },
       err=>{
         console.log(err);
       } ,
       ()=>
       {
         console.log('complete');
       });
  }

  ngOnDestroy(){
    this.mysubscription.unsubscribe();
  
}
}
 */