function die(myMap) {

    let roll = Math.floor(1 + Math.random() * 6);

    if (myMap.has(roll)) {
        myMap.set(roll, myMap.get(roll) + 1);
    } else {
        myMap.set(roll, 1);
    }
}

function trackDieRolls() {
    let myMap = new Map();
    let rollCount = 0;

    while (true) {
        die(myMap);
        rollCount++;

        if ([...myMap.values()].some(count => count === 10)) {
            break;
        }
    }

    let maxNumber = [...myMap].reduce((max, current) => current[1] > max[1] ? current : max);
    let minNumber = [...myMap].reduce((min, current) => current[1] < min[1] ? current : min);

    console.log(`Total Rolls: ${rollCount}`);
    console.log("Roll Results: ", myMap);
    console.log(`Number with Maximum Occurrences: ${maxNumber[0]} with ${maxNumber[1]} times`);
    console.log(`Number with Minimum Occurrences: ${minNumber[0]} with ${minNumber[1]} times`);
}

trackDieRolls();
