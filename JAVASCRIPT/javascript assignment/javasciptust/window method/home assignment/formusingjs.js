

document.getElementById('div2').innerHTML=
      `
      <form action="#" method="GET">
      
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
<label for="email">email</label> <br/>
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
<label for="month">joining month</label>
<input type="month" name="month" id="month"> 
</div>
<div>
<label for="file">upload a document</label>
<input type="file" name="file" id="file">
</div>
<div>
<input type="checkbox">I agree  
      </div>
      <div>
          <button style="background: red; font-size: 25px">submit</button>
      </div> 

</form>`;