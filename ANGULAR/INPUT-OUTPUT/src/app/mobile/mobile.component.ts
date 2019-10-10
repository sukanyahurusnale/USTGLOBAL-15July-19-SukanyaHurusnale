import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {
 mobileData:any='';

  constructor() { }
 sendMobile(mobile)
 {
   this.mobileData=mobile;
 }

 mobiles:any=[
   {
      name:'Redmi',
      img:'https://cdn.pixabay.com/photo/2014/08/05/10/30/iphone-410324__340.jpg',
      description:'It has a polycarbonate body, dual-SIM support and runs on MIUI 8 based on Android 6.0.1 Marshmallow. The Redmi 4 has a 5-inch 720x1280 pixels display, is powered by a 1.4 GHz quad-core processor, and has 2GB of RAM.'

   },
   {
    name:'Honor 8x',
    img:'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
    description:'to regard or treat (someone) with respect and admiration : to show or give honor to (someone) : to show admiration for (someone or something) in a public way : to give a public honor to (someone or something) '

 },
 {
  name:'Real Me',
  img:'https://cdn.pixabay.com/photo/2016/12/19/08/39/mobile-phone-1917737__340.jpg',
  description:'The Realme C1, powered by the Snapdragon 450 1.8 GHz octa-core processor. The Realme C1 has a 6.2-inch HD+ 1520 X 720 pixel (19:9 aspect ratio) display with a screen-to-body ratio of 88.8 percent. '

},
 ]

  ngOnInit() {
  }

}
