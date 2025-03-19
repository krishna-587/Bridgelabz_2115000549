
function generateRandom(arr){
    for (let i = 0; i < 10; i++) {
        let randNum = Math.floor(100 + Math.random()*900);
        arr.push(randNum);
        
    }
    console.log(arr);
}

function operation(arr){
    generateRandom(arr);
    arr.sort((a,b)=> a-b);
    return [arr[arr.length-2], arr[1]]
}

let arr = []
let ans = operation(arr);
console.log("Second Largest : " + ans[0]);
console.log("Second Smallest : " + ans[1]);