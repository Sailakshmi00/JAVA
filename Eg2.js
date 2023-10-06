var numbers = [5, 8, 9, 1, 15, 20];
function compareDescending(a, b) {
    return b - a;
}
numbers.sort(compareDescending);
console.log(numbers);