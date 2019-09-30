

document.getElementById('div2').innerHTML=
`<form action="#" method="GET">

    <div>
        <h1> Registration form</h1>
    </div>
<div>
<label for="name" >name</label>
<br/>
<input type="text" id="name" name="name" placeholder="enter your name" required>
</div>
<div>
<label for="password">password</label> <br/>
<input type="password" id="password" name="password" placeholder="enter password" required>
</div>
<div>
<label for="email" >email</label> <br/>
<input type="email" id="email" name="email" required>
</div>
<div>
<label for="phno">mobileno</label> <br/>
<input type="number" id="phno" name="phno" max="10" required>
</div>
<div>
<label for="gender">gender</label>
<br>
<input type="radio" id="geneder" name="gender">male
<input type="radio" id="gender" name="gender">female
</div>
<div>

<input type="checkbox">I agree  
</div>
<div>
    <button style="background: red; font-size: 25px">submit</button>
</div> 
</form>`;
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++

 var t=document.getElementById('div3');

let form1=document.createElement('form');

let label11=document.createElement('label');
form1.appendChild(label11);
label11.textContent="Name:";

var input1=document.createElement('input');
input1.setAttribute('type','text');
br1=document.createElement('br');
br2=document.createElement('br');
form1.appendChild(input1);
form1.appendChild(br1);
form1.appendChild(br2);

let label1=document.createElement('label');
form1.appendChild(label1);
label1.textContent="password";

var input2=document.createElement('input');
input2.setAttribute('type','password');
br11=document.createElement('br');
br21=document.createElement('br');
form1.appendChild(input2);
form1.appendChild(br11);
form1.appendChild(br21);

let label3=document.createElement('label');
form1.appendChild(label3);
label3.textContent="email";
var input3=document.createElement('input');
input3.setAttribute('type','email');
br11=document.createElement('br');
br21=document.createElement('br');
form1.appendChild(input3);
form1.appendChild(br11);
form1.appendChild(br21);


let label4=document.createElement('label');
form1.appendChild(label4);
label4.textContent="address";

var input4=document.createElement('textArea');
// input4.setAttribute('type','textArea');
// input4.setAttribute('row','5');
br111=document.createElement('br');
br211=document.createElement('br');
form1.appendChild(input4);
// form1.appendChild(input41);

form1.appendChild(br111);
form1.appendChild(br211);

 var label5=document.createElement('label');
form1.appendChild(label5);
label5.textContent="DOB";

var input5=document.createElement('input');
input5.setAttribute('type','date');

form1.appendChild(input5);

br111=document.createElement('br');
br211=document.createElement('br');
form1.appendChild(br111);
form1.appendChild(br211);
var label6=document.createElement('button');
label6.setAttribute('type','submit');
form1.appendChild(label6);
// form1.appendChild(input6);
label6.textContent="submit";
document.body.appendChild(form1);

