var MathOperation1;
(function (MathOperation1) {
    var PI = 3.14;
    function circumOfCircle(radius) {
        console.log("circumference of circle is" + 2 * PI * radius);
    }
    MathOperation1.circumOfCircle = circumOfCircle;
    function areaOfCircle(radius) {
        console.log("Area of circle is" + PI * radius * radius);
    }
    MathOperation1.areaOfCircle = areaOfCircle;
})(MathOperation1 || (MathOperation1 = {}));
MathOperation1.circumOfCircle(2);
MathOperation1.areaOfCircle(4);
