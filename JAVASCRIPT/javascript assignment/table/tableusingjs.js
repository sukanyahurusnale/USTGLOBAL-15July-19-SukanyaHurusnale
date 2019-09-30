// let t=document.getElementById('tab1');
let t1 =document.createElement('table');
let tr1=document.createElement('tr');
t1.appendChild(tr1);

let th1=document.createElement('th');
th1.textContent="name";
  tr1.appendChild(th1);


  let th2=document.createElement('th');
  th2.textContent="age";
  tr1.appendChild(th2);

  let tr2=document.createElement('tr');
  t1.appendChild(tr2);

  let td1=document.createElement('td');
  td1.textContent="sukanya";
  tr2.appendChild(td1);

  let td2=document.createElement('td');
  td2.textContent="20";
  tr2.appendChild(td2);

  t1.style.border="1px solid blue";
  tr1.style.border="1px solid blue";
  tr2.style.border="1px solid blue";
  th1.style.border="1px solid blue";
  th2.style.border="1px solid blue";
  td1.style.border="1px solid blue";
  td2.style.border="1px solid blue";


document.body.appendChild(t1);

