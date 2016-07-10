function fizzBuzz(num) {
    if(parseInt(num)!= num){
        return "Invalid Input Data"
    }
    if (num % 15 === 0) {
        return "FIZZBUZZ";
    } else {
        if (num % 3 === 0) {
            return "FIZZ";
        }
        if (num % 5 === 0) {
            return "BUZZ";
        }
    }

    return;
}

module.exports = fizzBuzz;