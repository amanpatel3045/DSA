Description

You are playing the Cows and Bulls game with your friend.

You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:

The number of "bulls", which are digits in the guess that are in the correct position.
The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
Given the secret number secret and your friend's guess guess, print the hint for your friend's guess.

The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.


Input
Input Format

The first line contains the number of testcases - t

For each testcase:

The first line contains the length of the string - n
The second line contains the secret
The third line contains the guess
Constraints

1<=t<=10

1<=n<=1000

The strings only consists of digits


Output
Print the hint for your friend's guess for each testcase


```
Sample Input 1 

1
4
1817
8710
Sample Output 1

1A2B
```
