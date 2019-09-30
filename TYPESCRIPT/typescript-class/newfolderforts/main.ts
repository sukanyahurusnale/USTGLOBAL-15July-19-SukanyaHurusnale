function PrintConstructor(cons:Function) 
{
     console.log(cons);
}
@PrintConstructor
class Sample
{
    constructor()
    {
        console.log("hello i m sample constructor");
    }
}

