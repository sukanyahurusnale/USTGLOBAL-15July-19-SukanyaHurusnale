let empjson={

     name:'dinga',
     age:30,
     hobbies:['dancing','singing']
}

console.log(`my name is ${empjson.name}`);
console.log(empjson);
let b=JSON.stringify(empjson);
console.log(b);
let jsobj=JSON.parse(b);
console.log(jsobj);