/* // +++++++++++++++++++++++++++NAMESPACE++++++++++++++++++++++
namespace MathOperation{

    const PI=3.14;
    export function circumOfCircle(radius:number)
    {
        console.log("circumference of circle is"+2*PI*radius);
    }
 export   function areaOfCircle(radius:number)
    {
        console.log("Area of circle is"+PI*radius*radius);
    }
}

MathOperation.circumOfCircle(2);
MathOperation.areaOfCircle(4); */



//++++++++++++++++++++NESTED NAMESPACE+++++++++++++++++===
namespace MathOperation
{
    export namespace rectangle
    {
        export function area(length:number,width:number)
        {
            console.log("area of rectangle is "+ length*width);
        }
        export function perimeter(radius:number)
        {
            console.log("primeter of rectangle is "+radius*radius*radius);
        }
    }
}

MathOperation.rectangle.area(12,55);
MathOperation.rectangle.perimeter(12);

