function validate()
{
   let form2= document.forms['empform'];
   let empd=form2.pass.value;
   let empcpwd=form2.cpass.value;
  if(empd===''&& empcpwd==='')
   {
       return false;
   }

   else if(empd===empcpwd)
   {
       alert("success");
       return true;
   }
   else{
       alert('password not matching');
       return false;
   }

}