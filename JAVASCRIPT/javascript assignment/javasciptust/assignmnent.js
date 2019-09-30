function factorial(n)
{
    var fact=1;
    for(var i=1;i<=n;i++)
    {
        fact=fact*i;
        console.log(fact);
    }
}

factorial(5);

//======================fibbonacii===========

function fibb(n)
{
    var t0=0;
    var t1=1;
    var sum=0;
    for(var i=0;i<=n;i++)
    {
        sum=t0+t1;
        t0=t1;
        t1=sum;
        console.log(sum);
    }
}
fibb(5);
//arrray add==============


var arr1=[1,2,10,20];
var sum=0;
for(var i=0;i<arr1.length;i++)
{
    sum=sum+arr1[i];
}

console.log(sum);

//=====circum=============


function cir(r)
{
   value=2*Math.PI*r;
   console.log(value);

}
cir(3);


//============prime=============
function prime(n)
{
    
    for(var i=2;i<=n;i++)
    {
        if(n%i===0)
        {
            flag=1;
            break;
        }
    }
    if(n===1)
    {
        console.log("number");

    }
        else{
            if(flag==0)
            console.log("primeno");
            else
            console.log("notprime")
        }
    
}
prime(9);


//======circum using anonymus==
(function(r){
    var cir=2*Math.PI*r;
    console.log(cir)
})(2);


//===========primme using function expression===
var prime=function(n)
{
    for(var i=2;i<=n;i++)
    {
        if(n%i===0)
        {
            flag=1;
            break;
        }
    }
    if(n===1)
    {
        console.log("number");

    }
        else{
            if(flag==0)
            console.log("primeno");
            else
            console.log("notprime")
        }
    
}
prime(9);

//=================fat arrow fibb==================
var fibb=n=>
{
    var t0=0;
    var t1=1;
    var sum=0;
    for(var i=0;i<=n;i++)
    {
        sum=t0+t1;
        t0=t1;
        t1=sum;
        console.log(sum);
    }
}
fibb(5);


//factorail of numer using recusion


function fact(num)
{
    if(num>=1)
    {
        return num*fact(num-1);
    }
    else
    {
        return false;
    }
}
let factorial1=fact(6);
console.log("factorial of num",factorial1);
