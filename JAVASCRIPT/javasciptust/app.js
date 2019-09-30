var fruits=['mango','banana','pineapple'];
for(var i=0;i<fruits.length;i++)
{
    console.log(fruits[i]);
}
22
var  todaydt=new Date();
console.log('todays date is='+todaydt);

var  todaydt1=new Date(2018,11,24,10,44,33);
console.log('todays date is='+todaydt1);

var  todaydt2=new Date(33);
console.log(' date is='+todaydt2);

var  todaydt3=new Date("0");
console.log('todays date is='+todaydt3);
var  todaydt5=new Date();
var month=['jan','feb','mar','apr'];
var day=['sun','mon','tue','wed','thur','fri','sat'];
var  todaydt4=new Date();
var d1=todaydt4.getDate();
console.log('tt='+d1);

// var d2= todaydt4.getFullYear();
// console.log('tt='+d2);

console.log(month[todaydt5.getMonth(2)]);
console.log(day[todaydt5.getDay(3)]);


// var d4=todaydt4.getDay(5);
// console.log('tt='+d4);


console.log(Math.min(5,8,9,0));

console.log(Math.random()*10+Math.random());
console.log(Math.ceil(4.4));
console.log(Math.floor(4.6));
console.log(Math.PI);
console.log(Math.pow(2,3));

var name="suku";
console.log(name);
var name1=name;
console.log(name1);
name1="hurusnale";
console.log(name);
console.log(name1);


var person={
    name:'simran'
};
console.log(person.name);
var person1=person;
console.log(person1.name);
person1.name='goyal';
console.log(person.name);
console.log(person1.name);

var pesron=new Object();
person.name="sukku";
person.age="21";
person.height="5.6";
console.log(person.name);

console.log(person.age);
console.log(person.height);

var num1=10;
var nuame="my name";
var num2='10';
if(num1===num2){
 console.log('match');

 }
else{
    console.log('not match');
}

var n1=(num1===num2)?'true':'false';
console.log(n1);

var n1=(num1>num2)?'greater':(num1===10)?'equals':'lesser';
console.log(n1);

var myage=50;
console.log(typeof myage);

var myname='suku';
console.log(typeof myname);



var hobbies=['coding','singing','cricket','abusing']
//console.log(typeof hobbies);
var rr=Array.isArray(hobbies);
console.log(rr)

var library=[ 
    {author:'simran goyal',title:'abc',bookId:222},
    {author:'sukanya',title:'abcd',bookId:2223},
    {author:'shweta',title:'abcde',bookId:2222},
    {author:'jabeen',title:'abcef',bookId:2622}
];
for(var i=0;i<library.length;i++)
{
    console.log(library[i].author);
}

var simran={
    name:'abc',
    age:1
};


 var shweta=['pagal',22,'hai'];
 for(var ind of shweta)
 {
     console.log(ind);
 }
    
    shweta[3]='skipping';
    shweta['name']='sleeping';
    for(var ind of shweta)
 {
     console.log(ind);
 }

 for(var ind in shweta)
 {
     console.log(shweta[ind]);
 }

 console.log(shweta);

 //function example=======================================//

 function getSum(a,b)
 {
     var c=a+b;
     return c;
 }
 var d = getSum( 10,12);
 console.log(d);


//=================function expression=============================


var sumData=function(a,b)
{
    var c=a-b;
return c;
}
var ssd=(90,88);
console.log(ssd);
//===================================================================

(function(a,b)
{
    var sum=a+b;
    console.log(sum);
}( 10,80));

// var suku=(a,b)=>{
    // sum=a+b;
    // return sum;
    
// }(90+6);
var nameee;

var namee='gandhi';
console.log(namee);


namet='sps';
function fname()
{
    console.log(namet);
    var namet="dinga";

}
console.log(namet);


function fnme2(){
    var nn1;
    console.log(nn1);
    nn1="pingi";

}
fnme2();


    function first(callback){
        setTimeout(function()
        {
            console.log("first")
            callback();
        } );
    
    }
    function second(){
        console.log("second")
    }
    first(second);
    //second(); 





    