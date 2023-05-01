Array is a container which can hold fix number of items and these items should be of same type. Most of the datastructure make use of array to implement their algorithms. Following are important terms to understand the concepts of Array
Element − Each item stored in an array is called an element.

Index − Each location of an element in an array has a numerical index which is used to identify the element.



Basic Operations


Following are the basic operations supported by an array.

Insertion − add an element at given index.

Deletion − delete an element at given index.

Search − search an element using given index or by value.

Update − update an element at given index.



GEEKSFORGEEKS
What is Array?
What is an Array?
An array is a collection of items of same data type stored at contiguous memory locations. 

This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array). The base value is index 0 and the difference between the two indexes is the offset.

For simplicity, we can think of an array as a flight of stairs where on each step is placed a value (let’s say one of your friends). Here, you can identify the location of any of your friends by simply knowing the count of the step they are on. 
Remember: “Location of next index depends on the data type we use”. 


arrayn

Is the array always of a fixed size?

In C language, the array has a fixed size meaning once the size is given to it, it cannot be changed i.e. you can’t shrink it nor can you expand it. The reason was that for expanding if we change the size we can’t be sure ( it’s not possible every time) that we get the next memory location to us for free. The shrinking will not work because the array, when declared, gets memory statically allocated, and thus compiler is the only one that can destroy it



Types of indexing in an array: . 
