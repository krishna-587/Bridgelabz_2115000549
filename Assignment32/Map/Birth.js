function generateBirthMonths(numIndividuals) {
    let birthMonths = new Map();
    
    for (let i = 0; i < numIndividuals; i++) {
        let month = Math.floor(Math.random() * 12) + 1;  
        
        if (!birthMonths.has(month)) {
            birthMonths.set(month, []);
        }
        
        birthMonths.get(month).push(`Individual ${i + 1}`);
    }

    return birthMonths;
}

function printIndividualsWithSameBirthMonth() {
    let numIndividuals = 50;
    let birthMonths = generateBirthMonths(numIndividuals);
    
    console.log("Individuals having birthdays in the same month:\n");
    
    for (let [month, individuals] of birthMonths) {
        if (individuals.length > 1) {
            console.log(`Month ${month}:`);
            console.log(individuals.join(', '));
        }
    }
}

printIndividualsWithSameBirthMonth();
