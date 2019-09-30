// window.alert("hello");
// alert("hello world");
// let t=confirm("are you childrem");
// console.log(t);

// let name=prompt('enter your name');
// console.log("your name"+name)


let pelement=document.getElementById('tt');
console.log(pelement);

// pelement.textContent="this is me";

let s=document.getElementsByClassName('s');
console.log(s);

let s1=document.getElementsByTagName('p');
console.log(s1);

let hh=document.getElementsByName('helement');
console.log(hh);

let demo=document.querySelector('.s');
console.log(demo);

let demo1=document.querySelectorAll('#tt');
console.log(demo1);

let btn=document.createElement('button');
btn.textContent="click here";
console.log(btn);

document.body.appendChild(btn);

//+++++++++++++++table++++++++++++++++++++++++

let tb=document.createElement('table');

let tb1=document.createElement('tr');
let tb2=document.createElement('td');
let tb3=document.createElement('td');
console.log(tb);
tb1.textContent="Name";
console.log(tb1);
tb2.textContent="sukanya";
console.log(tb2);
tb3.textContent="shweta";
console.log(tb3);

let tb11=document.createElement('tr');
let tb21=document.createElement('td');
let tb31=document.createElement('td');
// tb1.textContent="Age";
// console.log(tb1);
tb11.textContent="age";
console.log(tb11);
tb21.textContent="10";
console.log(tb21);
tb31.textContent="20";
console.log(tb31);

let b=document.getElementById('sub');
b.classList='add add1';



document.getElementById('div1').innerHTML=
                 `<table>
                 <tr>
                    <td> name</td>
                    <td> Age</td>
                 </tr>

                 <tr>
                    <td> suku</td>
                    <td> 20</td>
                 </tr>
                 <tr>
                    <td> shweta</td>
                    <td> 12</td>
                 </tr>
                 </table>`;
//==============================================================================================

               //   let d=document.getElementById('div1');
               //   d.style.backgroundColor="red";

let m=document.getElementsByClassName('ss');
m.classList='ss blue'