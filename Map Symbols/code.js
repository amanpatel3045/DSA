function mapSymbols(N) {
    // Write code here
    var arr = ['!','@','#','$','%','^','&','*'];
    for(var i=0;i<arr.length;i++){
        console.log(arr[i] + "-" + N);
        N=N+2;
    }
}
