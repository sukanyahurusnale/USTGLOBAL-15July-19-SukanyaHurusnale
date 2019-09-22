import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-carshow',
  templateUrl: './carshow.component.html',
  styles: []
})
export class CarshowComponent implements OnInit {

  carData: any = '';

  sendCar(car) {
    this.carData = car;
  }
  constructor() { }
  cars: any = [
    {
      brand: 'JAGUAR',
      img: 'https://cdn.pixabay.com/photo/2016/03/14/23/09/jaguar-1256562__340.jpg',
      description: 'Jaguar Cars is a brand of cars made by Jaguar Land Rover. This is a British car builder, owned by the Indian builder Cans Tata Motors since the beginning of 2008. It was established in 1922 by William Lyons. It was renamed Jaguar in 1935.'
    },
    {
      brand: 'BMW',
      img: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      description: 'Automobiles are marketed under the brands BMW, Mini and Rolls-Royce, and motorcycles are marketed under the brand BMW Motorrad. In 2015, BMW was the worlds twelfth largest producer of motor vehicles, with 2,279,503 vehicles produced. ... The registered company name is "Bayerische Motoren Werke AG".',
    },
    {
      brand: 'AUDI',
      img: 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      description: 'Audi is a member of the Volkswagen Group and has its roots at Ingolstadt, Bavaria, Germany. ... The four rings of the Audi logo each represent one of four car companies that banded together to create Audis predecessor company, Auto Union.'
    },
    {
      brand: 'MERCEDECE',
      img: 'https://cdn.pixabay.com/photo/2018/05/20/23/36/mercedes-3417100__340.jpg',
      description: 'is a German global automobile marque and a division of Daimler AG. The brand is known for luxury vehicles, buses, coaches, and trucks. The headquarters is in Stuttgart, Baden-Württemberg.'
    },
    {
      brand: 'FERARI',
      img: 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
      description: 'is an Italian luxury sports car manufacturer based in Maranello. Founded by Enzo Ferrari in 1939 out of Alfa Romeos race division as Auto Avio Costruzioni, the company built its first car in 1940.'
    },
    {
      brand: 'FORD',
      img: 'https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930__340.jpg',
      description: 'Ford Motor Company is an American multinational automaker that has its main headquarters in Dearborn, Michigan, a suburb of Detroit. It was founded by Henry Ford and incorporated on June 16, 1903. The company sells automobiles and commercial vehicles under the Ford brand and most luxury cars under the Lincoln brand.'
    },
  ]

  ngOnInit() {
  }

}
