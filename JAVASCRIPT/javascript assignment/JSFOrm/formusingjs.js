

let q=document.getElementById('ff');
let f1=document.createElement('form');
let l1=document.createElement('label');
f1.appendChild(l1);
l1.textContent="name";


let i1=document.createElement('input');
i1.setAttribute('type','text');
f1.appendChild(i1);

let l2=document.createElement('label');
f1.appendChild(l2);
l2.textContent="password";


let i2=document.createElement('input');
i2.setAttribute('type','password');
f1.appendChild(i2);

let b1=document.createElement('button');
b1.setAttribute('type','submit');
b1.textContent="submitbutton";
f1.appendChild(b1);

console.log(f1);
document.body.appendChild(f1);