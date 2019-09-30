 
 
 document.getElementById('div1').innerHTML=
`<table border="1">
                 <tr>
                    <td> name</td>
                    <td> Age</td>
                    <td> Address</td>
                    <td> DOB</td>
                    <td> email</td>
                    <td> Gender</td>
                 </tr>

                 <tr>
                    <td> suku</td>
                    <td> 20</td>
                    <td> Pune</td>
                    <td> 18-04-1997</td>
                    <td> suka@gmail.com</td>
                    <td> Female</td>
                 </tr>
                 <tr>
                 <td> rohini</td>
                 <td> 18</td>
                 <td> Pune</td>
                 <td> 07-12-1999</td>
                 <td> rohi@gmail.com</td>
                 <td> Female</td>
              </tr>
                 </table>`; 
//++++++++++++++++++++++++++++++++++++++++++++++++++

let tb=document.createElement('table');
let tr1=document.createElement('tr');
tb.appendChild(tr1);

let trd1=document.createElement('td');
trd1.textContent="name";
tr1.appendChild(trd1);

let trd2=document.createElement('td');
trd2.textContent="Age";
tr1.appendChild(trd2);


let tr2=document.createElement('tr');
tb.appendChild(tr2);

let trd3=document.createElement('td');
trd3.textContent="sukanya";

tr2.appendChild(trd3);
let trd4=document.createElement('td');
trd4.textContent="21";
tr2.appendChild(trd4);
//=================================================
let tr3=document.createElement('tr');
tb.appendChild(tr3);

let trd31=document.createElement('td');
trd31.textContent="rohini";

tr3.appendChild(trd31);

let trd41=document.createElement('td');
trd41.textContent="19";
tr3.appendChild(trd41);

tb.style.border='1px solid black';
tr1.style.border='1px solid black';
trd1.style.border='1px solid black';
trd2.style.border='1px solid black';

tr2.style.border='1px solid black';
trd3.style.border='1px solid black';
trd4.style.border='1px solid black';

tr3.style.border='1px solid black';
trd31.style.border='1px solid black';
trd41.style.border='1px solid black';




console.log(tb);
document.body.appendChild(tb);