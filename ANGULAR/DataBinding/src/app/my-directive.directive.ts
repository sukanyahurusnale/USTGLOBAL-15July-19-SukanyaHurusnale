import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private elementRef:ElementRef) 
  { 
        elementRef.nativeElement.style.background='purple';
        elementRef.nativeElement.style.color='white';
        elementRef.nativeElement.style.padding='80px';
   
  }


  @HostBinding('style.background') background: string;


        @HostListener('mouseenter')
        mouseEnter()
        {

             /* this.elementRef.nativeElement.style.background='red';
             this.elementRef.nativeElement.style.color='white';
             this.elementRef.nativeElement.style.fontSize='90px';
             */

             this.background= "skyblue";

        }


 @HostListener('mouseleave')
  mouseLeave()
  {
    /* this.elementRef.nativeElement.style.background='green';
             this.elementRef.nativeElement.style.color='red';

             this.elementRef.nativeElement.style.fontSize='110px';        
 */

this.background= "purple";

  }


  }


