/*function error1()
{
    let er=document.forms[0];
    let err1=er.uname.value;
    let pelem=getElementsByClassName('uname');
    console.log('elem');

    pelem.textContent="enter valid username";
/}*/ 

function validateform()
{
    let formdata=document.forms[0];
    // console.log(formdata);
    // console.log(formdata.uname.value);
    let username=formdata.uname.value;
    if(username.length>4)
    {
        console.log('success');
        formdata.uname.style.border='1px solid green';
         formdata.loginsubmit.disabled=false;
         var t1=document.getElementById('b3');
t1.textContent="";
        

    }
    else{
        formdata.uname.style.border='3px solid red';
        formdata.loginsubmit.disabled=true;
    //    window.alert("please your username");
var t=document.getElementById('b3');
t.textContent="enter valid username";
        

    }
}
function validatepass()
{
    let formdata1=document.forms[0];
    let pwd=formdata1.password.value;
    if(pwd.length>8)
    {
        console.log("success");
        formdata1.password.style.border='1px solid green';
        formdata1.loginsubmit.disabled=false;
        var t4=document.getElementById('b2');
         t4.textContent="";
// return true;
        

    }
    else
    {
        formdata1.password.style.border='2px solid red'; 
        formdata1.loginsubmit.disabled=true;
        var t=document.getElementById('b2');
            // return false;
 t.textContent="invalid password";
    }
}

//++++++++++++++++++++++++++++++++++
