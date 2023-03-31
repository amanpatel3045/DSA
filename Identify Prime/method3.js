var flag = true;
for (var i = 2; i <= Math.floor(Math.sqrt(num)); i++) {
    if (num % i == 0) {
        flag = false;
        break;
    }
}
if (flag) {
    console.log("Prime Number");
}
else {
    console.log("Not Prime Number");
}
