# MonotonicArray
- write a function that take array integer and return the boolean to consider if the array is monotonic Array
- A monotonic Array is define as if the array is monotone increase or monotone decrease
- if an Array A is monotone increase then as each i <= j  A[i] <= A[j] 
- if an Array A is monotone decrease then as each  i<= j A[i]>= A[j]

# Solution;
- given to variable to check if is not decrease of is not increase;
- if there is any increasing/ decreasing in array in in the it will catch there is a change
- if there is both increaing and decreasing it should return false
