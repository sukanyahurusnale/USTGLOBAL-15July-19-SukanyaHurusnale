function factorial(n)
{
    var fact=1;
    for(var i=1;i<=n;i++)
    {
        fact=fact*i;
        console.log(fact);
    }
}

factorial(5);
//++++++++++++++++++using Recursion++++++++++++++

function fact(num)
{
    if(num>=1)
    {
        return num*fact(num-1);
    }
    else
    {
        return false;
    }
}
let factorial1=fact(6);
console.log("factorial of num",factorial1);