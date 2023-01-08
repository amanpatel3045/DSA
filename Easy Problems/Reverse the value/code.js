function reverseTheValue(num) {
    // Write code here
    var arr = String(num).split("");
var bag="";
    for(var i=arr.length-1;i>=0;i--){
     bag=bag+arr[i];
    }
    console.log(bag);
    
}
