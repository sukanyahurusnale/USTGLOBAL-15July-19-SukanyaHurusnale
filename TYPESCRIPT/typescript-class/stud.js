"use strict";
exports.__esModule = true;
var Person = /** @class */ (function () {
    function Person() {
        this.name = "abs";
        this.age = 12;
    }
    Person.prototype.print = function () {
        console.log(this.age);
        console.log(this.name);
    };
    return Person;
}());
exports.Person = Person;
