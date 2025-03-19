function primeFactors(n) {
    let factors = [];
    
    while (n % 2 === 0) {
        factors.push(2);
        n = n / 2;
    }
    
    for (let i = 3; i * i <= n; i += 2) {
        while (n % i === 0) {
            factors.push(i);
            n = n / i;
        }
    }
    
    if (n > 2) {
        factors.push(n);
    }
    
    return factors;
}

let n = 56; 
let result = primeFactors(n);
console.log("Prime Factors of " + n + ": " + result);
