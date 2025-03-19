function findRepeatedDigitsInRange(start, end) {
    let repeatedNumbers = [];

    for (let i = start; i <= end; i++) {
        let numStr = i.toString();
        
        if (numStr.length === 2 && numStr[0] === numStr[1]) {
            repeatedNumbers.push(i);
        }
    }

    return repeatedNumbers;
}

let start = 0;
let end = 100;
let result = findRepeatedDigitsInRange(start, end);
console.log("Numbers with repeated digits:", result);
