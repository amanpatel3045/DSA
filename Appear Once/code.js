function appearOnce(N, arr) {
  //write code here
//   3 5 3 3 8 5 6
  let obj ={};
  let sum = 0;
  for(let i of arr){
      if(obj[i]>0){
          
          obj[i]++;
         
      }else{
          obj[i]=1;
        //   console.log(obj[i]);
         
      }
  }
  for(let key in obj){
      
      if(obj[key]<2){
          sum += parseInt(key);
      }
  }
console.log(sum);
}
