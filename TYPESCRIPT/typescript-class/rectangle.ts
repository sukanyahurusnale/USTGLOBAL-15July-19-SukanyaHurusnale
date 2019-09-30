namespace MathOperation1{

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

MathOperation1.circumOfCircle(2);
MathOperation1.areaOfCircle(4); 
