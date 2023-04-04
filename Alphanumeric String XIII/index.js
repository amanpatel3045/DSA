var alpha = "abcdefghijklmnopqrstuvwxyz";
var num = "0123456789";
var str1 = "";
var str2 = "";
for (i = 0; i < N; i++) 
{
    for (j = 0; j < alpha.length; j++) 
    {
        if (A[i] == alpha[j]) 
        {
            str1 += A[i];
        }
    }
    for (k = 0; k < num.length; k++) 
    {
        if (A[i] == num[k]) 
        {
            str2 += A[i];
        }
    }
}
console.log(str2 + str1);
