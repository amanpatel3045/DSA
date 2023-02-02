Description

Given a sorted(increasing order) array of length n and is rotated by some value beforehand. Find the index of the target element  K in the rotated array in O(logn) time. If not found print -1.





In a sorted & rotated array,  we rotate an ascending order sorted array at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2.

Please note that the linear search approach with the time complexity of O(n) can easily be applied. But you are expected to solve it in O(log n) time complexity

Note: Array contains all distinct elements.


Input
Input Format

First line consists of n and k separated by space.

Second line consists of n integers separated by spaces

Constraints

1 <= n <= 50

k <= 50

Output
Print index of the target element


Sample Input 1 

5 1
3 4 5 1 2
Sample Output 1

3
Sample Input 2 

6 6
3 4 7 9 1 2
Sample Output 2

-1
