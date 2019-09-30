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
var MathOperation;
(function (MathOperation) {
    var rectangle;
    (function (rectangle) {
        function area(length, width) {
            console.log("area of rectangle is " + length * width);
        }
        rectangle.area = area;
        function perimeter(radius) {
            console.log("primeter of rectangle is " + radius * radius * radius);
        }
        rectangle.perimeter = perimeter;
    })(rectangle = MathOperation.rectangle || (MathOperation.rectangle = {}));
})(MathOperation || (MathOperation = {}));
MathOperation.rectangle.area(12, 55);
MathOperation.rectangle.perimeter(12);
