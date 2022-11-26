function masaiSentenceReverse(s) {
  var a = s.split(" "); 
 //[ 'A', 'Transformation', 'in', 'education' ]

  var bag = ""
 for(var i=a.length-1; i>=0; i--){
     bag += a[i] + " ";
 }
 console.log(bag);
}
