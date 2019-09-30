function validatename()
{
    let f1=document.forms[0];
    let n=f1.uname.value;
    if(n.length>=5)
    {
       
        f1.uname.style.border='1px solid green';
        let t=document.getElementById('p1');
        t.textContent="";
        return true;
    }
    else
    {
       
        f1.uname.style.border='1px solid red';
       
        let t=document.getElementById('p1');
        t.textContent=" it requires atleast 5 character";
        return false;
    }
}

// ++++++++++++++++++++++++++++++++++++++++++++++++++++


function validatepass1()
{
    let form1=document.forms[0];
    let pass1=form1.pass.value;
    let pass2=form1.cpass.value;

    if(pass1==='' && pass2==='')
    {
        return false;
    }
    else if(pass1.length>4 && pass1.length>4){
        form1.pass.style.border='1px solid green';
        let t1=document.getElementById('p2');
        t1.textContent="";
        
        
    }
    else{

        // form1.cpass.style.border='1px solid red';
        form1.pass.style.border='1px solid red';
        // let t1=document.getElementById('p2');
        // t1.textContent="enter valid password";
        let t2=document.getElementById('p3');
        t2.textContent=" enter valid password";
    }
}



function validatefull()
{
    let form11=document.forms[0];
    let pass11=form11.pass.value;
    let pass21=form11.cpass.value;
    if(pass11==='' && pass21==='')
     {
         return false;
     }
    else if(pass11===pass21)
    {
        alert("success");
        return true;
    }
    else{
          alert("pwd not matching");
        //   form1.sub.disabled=true;
          return false;
    }
}