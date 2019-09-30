
function sum(a,b)
{
    function addsum()
    {
        return a+b;

    }
    return addsum;
}
var addfun=sum(10,80);
var total=addfun();
console.log(total);
console.log(window);
console.log(this);
console.log(window===this);
var name="sukanya";
console.log(window.name);
console.log(this.name);
var person=
{
  name:"sukuu",
  age:10,
  getName:function()
  {
    console.log("getname"+this.name);
    console.log(window);
    getData();
    function getData()
    {
        console.log("get data"+this.name);
    }
      return this.name;
  }


}
var n=person.getName();
console.log(n);





//=========================================

for(var i=0;i<5;i++)
{
    console.log(i);
}
console.log("last"+i);

////////////////////////////////////

for(let  j=0;j<5;j++)
{
    console.log(j);
}
// console.log("last"+j);//let keyword have block scope it will print error msg 

//++++++++++++++++++++++++++++++++++++++++++++++++++++++

var hobi=['dance','sing','cricket'];
console.log("hobbie "+hobi);
var hobi=['numismatics'];
console.log("hobi "+hobi);
hobi=['writing'];
console.log("================================");
let fruits=['orange','banana'];
console.log("fruits"+fruits);
//let fruits=['apple']; //redeclration is not possible

 fruits=['apple']; //reinitialization is possible
console.log("fruits"+fruits);
 

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

const vehi=['bike','car','auto'];
console.log("vehicle"+vehi);
// const vehi=['tempo'];// not possible redeclaration not possible

// vehi=['v','b']; //not possible
vehi[0]=['g','t'];
console.log("vehi "+vehi);

///////////////////////////////////////////////////





