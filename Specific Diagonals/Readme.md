Given amatrixofRrows andCcolumns which contains distinct integers and you are given a integerKand you need to print both the diagonals crossing through the given elementK, you can always assume that the given element always exist in the matrix.

image.png

In this 4*4 Matrix, suppose we need to print the diagonals passing from11, So the output will be :

1 6 11 16

8 11 14

Note: You need to print the diagonal from top to bottom also make sure you print the diagonals going fromleft to rightfirst then diagonal goingright to left,on a new lines.

```
Sample Input 1 

3 3
1 2 3
4 5 6
7 8 9
6
```

```
Sample Output 1

2 6
6 8
```

```
In Sample 1:
R = 3, C = 3

we need to print the diagonals of 6, also we are printing diagonals from top to bottom and left to right first then right to left , So output will be

2 6 -> left to right diagonal and from top to bottom order

6 8 -> right to left diagonal and from top to bottom order



For Sample 2.

Top Left to Bottom Right diagonal elements are 1 5 6.

Top Right to Bottom Left diagonals elements are 3 5 7.

So we print

1 5 6

3 5 7 on new lines.
```
