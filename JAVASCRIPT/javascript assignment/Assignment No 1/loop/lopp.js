var hobi=['dance','sing','cricket'];
for(let i=0;i<hobi.length;i++)
{
    console.log("hobbie "+hobi[i]);
    
}
console.log("============================");

//=======================================

var fruits=['apple','banana','mango'];
fruits.forEach(function(value,index)
{

    console.log("fruits "+value);
    // console.log("============================");
});
console.log("============================");

//===================================================

var laptop=['dell','hp','lenovo'];
for(let value of laptop)
{
    console.log("laptop "+value);
    // console.log("============================");
}
console.log("============================");


var birds=['parrot','peacock','crow'];
for(let index in birds)
{
    console.log("birds "+birds[index]);
}

console.log("============================");


