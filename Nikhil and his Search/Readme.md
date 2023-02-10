Description

Nikhil and his friend Sachin are on a quest to find the answer to Life.

In order to complete it, they need to answer Q queries on an array A having N integers. The queries can be of the following two types:

0 x: Find the number of numbers in A which are not less than x.

1 x: Find the number of numbers in A which are greater than x.

Help them complete the quest.


Input
Input Format

The first line consists of a single integer denoting N.

The second line consists of N space separated integers denoting the array A.

The third line consists of a single integer denoting Q.

Each of the following Q lines consists of a query of one of the given two types.

Constraints

1<= N <= 100000

1<=Q<=300000

1<= elements of array, x < 1000000000

Output
For each query print the required answer in a new line.


```
Sample Input 1 

4
1 2 3 4
3
0 5
1 3
0 3
Sample Output 1

0
1
2
```
