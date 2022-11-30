console.log(CheckPrime(7));

function CheckPrime(n){
    for(var i=2;i*i<=n;i++){
        if(n%i==0)return false;
    }
    return true;
}
