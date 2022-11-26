function secondMaximum(a, b, c) {
  // write code here
  if(a>b && a>c){
      if(b>c){
          console.log(b);
      }else{
          console.log(c);
      }
  }
  else if(b>a && b>c){
      if(a>c){
          console.log(a);
      }else{
          console.log(c);
      }
  }else if(a>b){
      console.log(a);
  }else{
      console.log(b);
  }
}
