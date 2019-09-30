  function sayHello()
{
    alert("hello");
    confirm('are you mad');

}

let b=document.getElementById('t1');
t1.onclick=function()
{
    // alert("hello ust global i m coming be ready");
    let h=window.prompt('your name is');
    document.getElementById('g1').innerHTML=""+h;
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
function createnewelement()
{


let r= document.createElement('p');
r.textContent="this is p element";
document.body.appendChild(r);
}
//====================================================================
let c=document.getElementById('alerthi');
c.addEventListener('click',function(){
    alert("good evening ");
});

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

let ele=document.getElementById('showData');
ele.Value;

let u=document.createElement('h1');
function showText()
{
    let ip=document.getElementById('showData');
    console.log(ip.value);
     u.textContent=ip.value;
    document.body.appendChild(u);           
}
