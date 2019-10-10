import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  constructor() { }
   newsData:any='';
  sendNews(news){
    this.newsData=news;
  }


   newses:any=[
     {
        title:'Artical 370',
        img:'https://images.livemint.com/img/2019/08/06/600x338/P18_1565117730110.jpg',
        description:'Article 370 of the Indian constitution gave special status to the region of Jammu and Kashmir, allowing it to have a separate constitution, a state flag and autonomy over the internal administration of the state.'
     },
     {
      title:'Rainfall in goa,Andhra pradesh,banglore',
      img:'https://images.livemint.com/img/2019/08/07/600x338/PTI8_5_2019_000204A_1565171725094_1565171742423.jpg',
      description:'Heavy downpour will likely prevail over isolated parts of both Telangana and Andhra Pradesh for two dayFishermen were advised not to venture into sea along Northwest Bay of Bengal over the next 24 hours'
     },
     {
      title:'Shushma swaraj passed away',
      img:'https://images.livemint.com/img/2019/08/07/600x338/Sushmanew_1565173689473.jpg',
      description:'Former Union minister Sushma Swaraj passed away on Tuesday nightDelhi and Haryana governments have declared a two-day state mourning'
    },
    {
      title:'Mission Chandrayan',
      img:'https://images.livemint.com/img/2019/05/01/600x338/ISROMOON_1556727596499.jpg',
      description:'It would be launched from Satish Dhawan Space Centre in Sriharikota in Andhra PradeshElaborating on the mission, the agency stated that it would have three modules namely Orbiter, Lander named Vikram and Rover named Pragyan, all developed by India'
    }
     
   ]

  ngOnInit() {
  }

}
