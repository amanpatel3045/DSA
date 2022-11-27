function subStrUnderCond(s){
//write code here
var count=0;
for(var i=0;i<s.length;i++){
    var bag="";
    for(var j=i;j<s.length;j++){
        bag += s[j];
        
      if(bag.length==1 || bag[0]==bag[bag.length-1]){
           count++;
       }
        
        
    }
      
}
console.log(count);

}
