// function sum(a, b, ...args){
//     let sum = 0;
//     for(let arg of args) sum+= arg;
//     return sum;
// }

// show(   sum(2,2,2)   );


function show(...params) {
    console.log(params);
}


const arr=['said', 20, 'JavaScript enthusiast', 'Hi', 'Said', 'How are you?'];
const arr2=[v1,v2,   ...rest]=arr

show( arr2 );
show( rest );

// added comment
