/* let myname:string='sukanya';
//     alert(myname);
 let company;
 company='ust';
 company=22;
 console.log(company);
 console.log(myname); */

  /*  let sample:number | boolean;
   sample=10;
   sample=true;
   console.log(sample); */
//let tuple:[string,number,boolen]=['',22,true];

   /* let myarray:any[]=[1222,'gkfjg',111,'fdsg'];
t   enum colors
   {
       red='danger',
       green='fg',
       blue='et',
       black='tdh'
   }
console.log(colors.black); */

//classess and interfaces

/* class Person
{
          name:string;
          age:number;
          constructor(pname:string,page:number){

            this.name=pname;
            this.age=page;
          }
}

let person1=new Person('ss',33);

console.log(person1.name);
console.log(person1.age); */


/* class Student{
//   name:String="sukanyaaa";
//   static age:number=43; 
constructor(public name:string,public age:number)
{

}
}

let ss=new Student('sukuu',90);

console.log(ss.name);
console.log(ss.age);
// Student.age; //to access static member we have to use classname.member

let CarBenz: Student={
     name:'benz',
     age:679
}

console.log(CarBenz.age);
 */



/* 
 //+++++++++++++++++  INHERITANCE +++++++++++++++++++++++++++


 class Person
 {
    constructor(public name:string,public age:number)
    {

    }
 }

 class Student extends Person
 {
    constructor(public pname:string, public page:number,public usn:number)
    {
                super(pname,page);
    }
 }

 let person1=new Person('dinga',45);
console.log(person1.name);

let stud=new Student('dingi',97,98978767555);
console.log(stud.pname);
console.log(stud.page);
console.log(stud.usn);

 */


 //++++++++++++++++++++INTERFACE++++++++++++========


 /* interface Student
 {
    name:string;
    age:number;
     printDetails():void;

 }
 class Person implements Student
 {
     name="sarthak";
     age=10;
     printDetails()
     {
        console.log(this.name+"  nameeeeeee");
        console.log(this.age);
     }

 }
 let p1=new Person();
 p1.printDetails();

 
 let student1:Student={
    name:'xyz',
    age:23,
    printDetails:()=>
    {
       console.log("name is"+student1.name+"age is"+student1.age);
    }
 }
 student1.printDetails();
 */



 //+++++++++++++++++++++++++++++++++++++++++++GENERICS+++++++++++++++++++++++++++++++++++++++++++++++++++++=

/* function getArray<p>(items:p[]):p[]
{
   return new Array<p>().concat(items);

}
let strarrr=getArray<string>(['sukaaaa','shweeee','Aisshaa']);
let numarrr=getArray<number>([89,90,88]);
strarrr.push('hjhuh');
numarrr.push(900);

console.log(strarrr);
console.log(numarrr); */



///  <reference path="./circle.ts" />
///  <reference path="./rectangle.ts" />

MathOperation1.circumOfCircle(2);
MathOperation.rectangle.area(12,55);
