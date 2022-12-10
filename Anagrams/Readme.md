# Two strings are said to be anagram if we can form one string by arranging the characters of another string. For example, Race and Care. Here, we can form Race by arranging the characters of Care.

## In Java, we have two strings named str1 and str2. We are checking if str1 and str2 are anagrams.

## We first convert the strings to lowercase. It is because Java is case sensitive and R and r are two difference characters in Java.

## Here,

```
str1.toCharArray() - converts the string into a char array
Arrays.sort() - sorts both the char arrays
Arrays.equal() - checks if the sorted char array are equal
If sorted arrays are equal, then the strings are anagram.
```
