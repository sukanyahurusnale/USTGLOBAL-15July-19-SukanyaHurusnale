//26-07-2019 for each

var hobbie=['sing','read','dancing',''];
hobbie.forEach(function(value,index)
{
    console.log(value);
});


//fat arrow==========================

var hobbie=['sing','read','dancing'];
hobbie.forEach((value,index)=>

{
    console.log(value);
} );

//=============add element ===============================

hobbie.push('write','travling');
hobbie.forEach((value,index)=>

{
    console.log(value);
} );
//=======================pop===========

hobbie.pop();
console.log(hobbie);
hobbie.shift();
console.log(hobbie);
hobbie.unshift('sing');
console.log(hobbie);
console.log(hobbie.includes('write',2));
hobbie.splice(2,0,'sleeping','cooking');
console.log(hobbie);
hobbie.splice(2,2);
console.log(hobbie);
hobbie.splice(2,0,'sleeping','cooking');
console.log(hobbie);

var arr=hobbie.slice(0,3);
console.log(arr);

var r=hobbie.join('**');
console.log(r);

var q=hobbie.indexOf('write');
console.log(q);

//=======

var num=[10,20,30,40,50];
var num1=[];
for(var i=0;i<num.length;i++)
{
    num2=num[i]+10;
    num1.push(num2);
    console.log(num1)
}
///using map function

newnum=num.map(function(val,index)
    {
        val=val+10;
        return val;
        


    });
    console.log("=="+newnum);

    //++++++++++++++++++++filter+++++++++++++++++++++
    
var nn=num.filter((val,index)=>{
 
    return val>20;
});
console.log(nn);
//====================complex array===========================================

var item=[
    {
        item:'pen',
        price:10
    },
    {
        item:'bag',
        price:200
    },
    {
        item:'laptop',
        price:50000
    },
    {
        item:'mouse11',
        price:500
    }
];

newitem=item.map((val,index)=>
{
    for(var i=0;i<item.length;i++)
    {
        return val.price+10;
    }
    
});

console.log(newitem);

var nn=item.filter((val,index)=>{
  
    return val.price>100 && val.item.length>2;
});

console.log(nn);

//==================string method=============

var str="simran";
var a=str.toLowerCase(str);
console.log(a);

var str="simrain";
var b=str.toUpperCase(str);
console.log(b);

var c=str.charAt(4);
//var b=str.toUpperCase(str);
console.log(c);

var d=str.indexOf('r',2);
console.log(d);

var e=str.concat('tt','apple');
console.log(e);

var f=str.includes('m',2);
console.log(f);

var g=str.replace('m','p');
console.log(g);

var h=str.split('i',2);
console.log(h);

var j=str.substr(1,4);
console.log(j);

var k=str.search('m');
console.log(k);

var l=str.trim();
console.log(l);