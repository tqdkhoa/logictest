package demo.kotlin

fun easy1(nums: List<Int>?): Int {
    require(!nums.isNullOrEmpty()) { "Array nums must not be empty" }
    /* We XOR all the elements in array, all the elements which are
	 * repeated twice will become 0 and remaining will the element
     * which is appearing only once*/
    var element = nums[0]
    for (i in 1 until nums.size) {
        element = element.xor(nums[i])
    }
    return element
}

fun moderate1(nums: List<Int>?): IntArray {
    require(!nums.isNullOrEmpty()) { "Array nums must not be empty" }

    val length = nums.size

    /* Initialize three empty arrays with length of given array including
     * leftArr (left) array will contain product of all elements to the left
     * rightArr (right) array will contain product of all elements to the right
     * productArr array will contain final product of all elements
     * */
    val leftArray = IntArray(length)
    val rightArr = IntArray(length)
    val productArr = IntArray(length)

    /* Initiate first element of leftArr to 1 because there is no element to the left*/
    leftArray[0] = 1
    /* Determine value of rest elements,leftArr[i] represents product of
	 * all the elements to the left of element at index i */
    for (i in 1 until nums.size) {
        leftArray[i] = nums[i - 1] * leftArray[i - 1]
    }

    /* Initiate first element of rightArr to 1 because there is no element to the right*/
    rightArr[length - 1] = 1
    /* Determine value of rest elements,rightArr[i] represents product of
     * all the elements to the right of element at index i */
    for (j in (length - 2) downTo 0) {
        rightArr[j] = nums[j + 1] * rightArr[j + 1]
    }

    /* Find the productArr except self as leftArr[i] * rightArr[i] */
    for (i in 0 until length) {
        productArr[i] = leftArray[i] * rightArr[i]
    }
    return productArr
}

fun main(args: Array<String>) {
    println("Easy1")
    val nums = listOf(-1, 2, 4, 2, -1)
    println(easy1(nums))

    println("Moderate1")
    val moderateNums = listOf(1, 2, 3, 4)
    val products = moderate1(moderateNums)
    println(products.joinToString())


}