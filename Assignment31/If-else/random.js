let arr = [];

function generateRandom(){
    for (let i = 0; i < 5; i++) {
        let randomValue = Math.floor(100+ Math.random()*900);
        arr.push(randomValue);
    }

    let min = Math.min(...arr);
    let max = Math.max(...arr);
    console.log(arr)
    console.log("Minimum value: " + min)
    console.log("Maximum value: "+ max)
}

generateRandom()