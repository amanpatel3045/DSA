Description

Given an array consisting of N space-separated repeated integers. You have to find the maximum distance between two occurrences of an integer. And if you do not found any repetitions of numbers then simply print 0.


Input
Input Format

First-line contains T, no of test cases.

First-line of each test case contains N, the size of the array.

Second-line of each test case contains N spaced repeated integers, elements of an array.

Constraints

1 <= T <= 10

1 <= N <= 10^6

1 <= A[i] <= 10^6


Output
For each test case print the maximum distance between two same elements in a new line.

```
Sample Input 1 

2
6
1 1 2 2 2 1
12
3 2 1 2 1 4 5 8 6 7 4 2
Sample Output 1

5
10
```

```
Hint

For the first test case,

arr[] = {1, 1, 2, 2, 2, 1}
Max Distance: 5
Distance for 1 is: 5-0 = 5
Distance for 2 is : 4-2 = 2
Max Distance 5
For the second test case,

arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
Max Distance 10
maximum distance for 2 is 11-1 = 10
maximum distance for 1 is 4-2 = 2
maximum distance for 4 is 10-5 = 5
```
