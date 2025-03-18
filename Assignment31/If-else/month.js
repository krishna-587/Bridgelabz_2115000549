let day = parseInt(process.argv[2]);
let month = parseInt(process.argv[3]);

console.log(process.argv);

function Month(day , month){
        if(month < 3 || month > 6){
            return false;
        }
        if(month == 3 && day < 20){
            return false;
        }
        if(month == 6 && day > 20){
            return false;
        }
        return true;
}

console.log(Month(day,month));