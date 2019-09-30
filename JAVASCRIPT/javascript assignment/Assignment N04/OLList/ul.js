document.getElementById('div2').innerHTML=
    `
    <ul> courses
     <li>java</li>
     <li>c++</li>
     <li>python</li>
     <li>nodejs</li>
     <li>html</li>
    </ul> 
    <ol> subject
     <li>a</li>
     <li>b </li>
     <li>c</li>
     <li>d</li>
     <li>e </li>
    </ol>
    `;

    //++++++++++++++++++++++++++++++++++


    var ollist=document.createElement('ol');
    ollist.textContent="listofItems";
    var ol=document.createElement('li');
    ollist.appendChild(ol);
    ol.textContent='item1';

    var ol1=document.createElement('li');
    ollist.appendChild(ol1);
    ol1.textContent='item2';

    var ol3=document.createElement('li');
    ollist.appendChild(ol3);
    ol3.textContent='item3';

    var ol4=document.createElement('li');
    ollist.appendChild(ol4);
    ol4.textContent='item4';


    document.body.appendChild(ollist);