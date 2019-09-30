//===========primme using function expression===
var prime=function(n)
{
    for(var i=2;i<=n;i++)
    {
        if(n%i===0)
        {
            flag=1;
            break;
        }
    }
    if(n===1)
    {
        console.log("number");

    }
        else{
            if(flag==0)
            console.log("primeno");
            else
            console.log("notprime")
        }
    
}
prime(9);

//============prime=============
function prime(n)
{
    
    for(var i=2;i<=n;i++)
    {
        if(n%i===0)
        {
            flag=1;
            break;
        }
    }
    if(n===1)
    {
        console.log("number");

    }
        else{
            if(flag==0)
            console.log("primeno");
            else
            console.log("notprime")
        }
    
}
prime(9);