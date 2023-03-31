var flag = true;
for (var i = 2; i < num; i++) {
    if (num % i == 0) {
        flag = false;
        break;
    }
}
if (flag) {
    console.log("Yes");
}
else {
    console.log("No");
}
