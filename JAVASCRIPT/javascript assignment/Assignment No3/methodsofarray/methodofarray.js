var hobbie=['singing','reading','dancing',''];
hobbie.forEach(function(value,index)
{
    console.log(value);
});
//+++++++++++++=push+++++++++++++++++++++++++++++
hobbie.push('writing','travling');
hobbie.forEach((value,index)=>

{
    console.log(value);
} );
//++++++++++++++++++++++++++++++++++++++++++++++++++
hobbie.push('swimming');
hobbie.forEach((value,index)=>

{
    console.log(value);
} );
//=====================pop=================================================
hobbie.pop();
console.log("after pop"+hobbie);
//+++++++++++

hobbie.pop();
console.log("after pop"+hobbie);

//===========================================

hobbie.shift();
console.log("after shift"+hobbie);
//=================================================
hobbie.unshift('sing');
console.log("after unshift"+hobbie);
//=============================================

console.log(hobbie.includes('writing',2));
//=======================================================

hobbie.splice(2,0,'sleeping','cooking');
console.log("after slice"+hobbie);

//========================================
hobbie.splice(2,2);
console.log("after splice"+hobbie);

//=====================================

hobbie.splice(2,0,'sleeping','cooking');
console.log("after splice"+hobbie);
//=============================================
var arr=hobbie.slice(0,3);
console.log("after slice"+arr);
//=====================================
var r=hobbie.join('**');
console.log("after join"+r);
//======================================
var q=hobbie.indexOf('writing');
console.log("index of"+q);
//===========================================