function runProgram(input){
    input = input.trim().split("\n")
    
       for(let i=0,line=1;i<+input[0];i++)
       {
       let size = +input[line++];
       let arr = input[line++].split(" ").map(Number);
       console.log(sumOfArray(size,arr))
       }
}
function sumOfArray(size,arr){
    for(let i=1; i<arr.length; i++){
    arr[i]=arr[i]+arr[i-1];
    }
    return arr.join(" ");
}
if (process.env.USER === "") {
runProgram(``);
} else {
process.stdin.resume();
process.stdin.setEncoding("ascii");
let read = "";
process.stdin.on("data", function (input) {
read += input;
});
process.stdin.on("end", function () {
read = read.replace(/\n$/, "");
read = read.replace(/\n$/, "");
runProgram(read);
});
process.on("SIGINT", function () {
read = read.replace(/\n$/, "");
runProgram(read);
process.exit(0);
});
}
