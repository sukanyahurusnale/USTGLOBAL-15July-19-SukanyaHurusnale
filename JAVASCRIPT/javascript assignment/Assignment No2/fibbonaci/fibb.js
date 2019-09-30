//=================fat arrow fibb==================
var fibb=n=>
{
    var t0=0;
    var t1=1;
    var sum=0;
    for(var i=0;i<=n;i++)
    {
        sum=t0+t1;
        t0=t1;
        t1=sum;
        console.log(sum);
    }
}
fibb(5);
//++++++++++++++++++++++++++

function fibb(n)
{
    var t0=0;
    var t1=1;
    var sum=0;
    for(var i=0;i<=n;i++)
    {
        sum=t0+t1;
        t0=t1;
        t1=sum;
        console.log(sum);
    }
}
fibb(5);