# QUESTION EASY 1
Implement a method easy1 that given an integer array, which each element appears twice except for one. Find that one

Example #1<br>
Input: [1, 1, 2, 2, 3]<br>
Output: 3 <br>

Example #2<br>
Input: [-1, 2, 4, 2, -1]<br>
Output: 4<br>
## Solution
If we XOR all the elements in array, all the elements which are repeated twice will become 0 and remaining will the element which is appearing only once.
 
# QUESTION MODERATE 1
Implement a method moderate1 that given an array of integers nums, returns an array of integers output where output[i] = product of all elements in nums except nums[i]

Example<br>
Input: [1, 2, 3, 4]<br>
Output: [24, 12, 8, 6]<br>
From the example, output[1] = product of all elements in nums except nums[1] which is 1 * 3 * 4 = 12

## Solution
For every given index, i, we will make use of the product of all the numbers to the left of it and multiply it by the product of all the numbers to the right. This will give us the product of all the numbers except the one at the given index i. Let's look at a formal algorithm describing this idea more concretely.

#### Algorithm

  1. Initialize two empty arrays, L and R where for a given index i, L[i] would contain the product of all the numbers to the left of i and R[i] would contain the product of all the numbers to the right of i.<br>
  2. We would need two different loops to fill in values for the two arrays. For the array L, L[0] would be 1 since there are no elements to the left of the first element. For the rest of the elements, we simply use L[i] = L[i - 1] * arr[i - 1]. Remember that L[i] represents product of all the elements to the left of element at index i.<br>
  3. For the other array, we do the same thing but in reverse i.e. we start with the initial value of 1 in R[length - 1] where lengthlength is the number of elements in the array, and keep updating R[i] in reverse. Essentially, R[i] = R[i + 1] * arr[i + 1]. Remember that R[i] represents product of all the elements to the right of element at index i.<br>
  4. Once we have the two arrays set up properly, we simply iterate over the input array one element at a time, and for each element at index i, we find the product except self as L[i] * R[i].<br>


# INPUT FILE AND EXECUTION
## Input file
easy=-1, 2, 4, 2, -1<br>
moderate=1, 2, 3, 4
## Execution
Main <path_to_input_file><br>
For ex: Main C:\\input.txt
