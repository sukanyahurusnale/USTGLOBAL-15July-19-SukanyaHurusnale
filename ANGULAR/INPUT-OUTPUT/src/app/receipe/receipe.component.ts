import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-receipe',
  templateUrl: './receipe.component.html',
  styleUrls: ['./receipe.component.css']
})
export class ReceipeComponent implements OnInit {
receipeData:any='';
  constructor() { }
  sendreceipe(receipe)
  {
      this.receipeData=receipe;
  }
  receipes:any=[
    {
       title:'Pancake',
       img:'https://cdn.pixabay.com/photo/2017/05/07/08/56/pancakes-2291908__340.jpg',
       description:'In a large mixing bowl, sift together flour, sugar baking powder, baking soda, and salt.Whisk in milk eggs and melted butter just until combined Preheat a flat griddle over medium-high heatScoop 1/4 cup of pancake batter onto griddle.Cook other side until golden brown.'
       
    },
    {
      title:'Pizza',
      img:'https://cdn.pixabay.com/photo/2017/12/10/14/47/piza-3010062__340.jpg',
      description:'is a savory dish of Italian origin, consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and various other ingredients (anchovies, olives, meat, etc.) baked at a high temperature, traditionally in a wood-fired oven.'
   },
   {
    title:'Berger',
    img:'https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246__340.jpg',
    description:'Take bottom base of bun and spread tomato ketchup over it. Place lettuce leaf followed by aloo tikki. Spread 1-tablespoon mayonnaise over it. Place 1-2 tomato slices and 3-4 onion slices in given order.'
 },
 {
  title:'Pasta',
  img:'https://cdn.pixabay.com/photo/2017/11/08/22/18/spaghetti-2931846__340.jpg',
  description:'Spaghetti alle vongole A basic aglio e olio (garlic and oil) sauce – with a bit of chilli if preferred – is cooked in a huge pan, before lots of clams are added and sautéed until they open and flavour the sauce. Vongole veraci (carpet shell clams) are the best variety for this dish.'
},
{
  title:'Cup Cake',
  img:'https://cdn.pixabay.com/photo/2015/03/26/09/39/cupcakes-690040__340.jpg',
  description:'Ingredients. 1/4 cup salted butter softened. 1/4 cup vegetable oil. 3/4 cup sugar. 3/4 cup buttermilk room temperature. 2 large eggs room temperature. 2 teaspoons vanilla extract. 1 3/4 cups all-purpose flour. 2 teaspoons of baking powder.'
},


  ]

  ngOnInit() {
  }

}
