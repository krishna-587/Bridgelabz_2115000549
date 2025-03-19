let arr = []

function generateRandom(arr){
    for (let i = 0; i < 10; i++) {
        let randNum = Math.floor(100 + Math.random()*900);
        arr.push(randNum);
        
    }
    console.log(arr);
}

function operation(arr){
    generateRandom(arr);
    for(let i = 0 ; i < arr.length ; i++){
        for (let j = i+1; j < arr.length; j++) {
            if(arr[i] > arr[j]){
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
       
    }
    return [arr[arr.length-2], arr[1]]
}

let ans = operation(arr);
console.log("Second Largest : " + ans[0]);
console.log("Second Smallest : " + ans[1]);