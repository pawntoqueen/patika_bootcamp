import java.lang.IndexOutOfBoundsException

// the intArray object I will run as an example
var inputArray : IntArray = intArrayOf(1,2,3,4,5,6,7,8)

//Reverse function that we will add to Class to affect IntArray objects
//This function takes as a parameter the index of the element to start reversing
fun IntArray.reverse(index:Int = 0) : IntArray {
    //size of intArray object used
    var s :Int = this.size

    ///out of dimension index check
    if (index > s-1 || index < 0){
        throw IndexOutOfBoundsException("index cannot be greater than " + (s-1) + " or index cannot be lower than 0")
    }
    //array that will hold the desired output
    var returnArray : IntArray = IntArray(s)

    //dont replace before the index's items
    for (i in 0..index)
        returnArray.set(i, this[i])

    //replace after the index's items
    for (i in s-1 downTo index){
        returnArray.set(i, this[s-i-1+index])
    }

    return returnArray
}

fun main(args: Array<String>) {

    print("1. test: ")     // expected value: 87654321
    var reversedArray : IntArray = inputArray.reverse()
    for (i in reversedArray.iterator())
        print(i)
    println()


    print("2. test: ")    // expected value: 12876543
    var reversedArray2 : IntArray = inputArray.reverse(2)
    for (i in reversedArray2.iterator())
        print(i)
    println()
    println("3. test: ") // expected value: index cannot be greater than 7 or index cannot be lower than 0
    var reversedArray9 : IntArray = inputArray.reverse(9)
    for (i in reversedArray9.iterator())
        print(i)
}