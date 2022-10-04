package com.alexandrohlopes.morekotlinfundamentals

fun main() {

    println("Arrays")
    /*  Ways of declaring an array:
        val numbers : IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6) */
    val numbers = arrayOf(1, 2, 3, 4, 5, 6) // Kotlin detects automatically the type of the array.
    // println(numbers.contentToString()) -> We can't print the content of an array directly - we need to convert it to a string first
    println("Integer Array")
    for (element in numbers) {
        print("${element + 2} ") // Adds 2 to each element of the array then prints it. This new values won't be stored in the array, only shown.
    }
    println()
    println("The array is ${numbers.contentToString()}") // Here we can see that the values inside the array remain the same.
    // It is possible to specify which member of the array you want to access by specifying its position, from 0 to the length of the array minus 1.
    println("The 4th  element in the array is ${numbers[3]}") // Prints the element of the array in the 4th position.
    numbers[0] *= 2
    numbers[1] *= 2
    numbers[2] *= 2
    numbers[3] *= 2
    numbers[4] *= 2
    numbers[5] *= 2
    println("The updated array is ${numbers.contentToString()}")

    println("\nFloat Array")
    val floatNumbers = arrayOf(1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f)
    // The only difference of declaring a Float and a Double Array is the need of using a 'f' after each value for Float values.
    println("The float array is ${floatNumbers.contentToString()}")

    println("\nString Array")
    val week = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    println("The days of the week array is ${week.contentToString()}")

    println("\nData Class Array")
    val fruits = arrayOf(Fruit("Green apple", 10.0), Fruit("Grape", 5.0))
    println(fruits.contentToString())
    println("Names of the fruits in the Data Class Array")
    for (fruit in fruits) { // This is a simple way of printing the name of each element of the Data Class in a line.
        println("${fruit.name}")
    }
    println("Prints the name of each element followed by its index.")
    for (index in fruits.indices) { // Another way printing each element of the Data Class in a line. Here we're also mentioning the index.
        print("${fruits[index].name} is in index $index | ")
    }
    println()

    println("\nArrays of multiple types")
    val months = arrayOf(1, "January", 2, "February", 3, "March", 4, "April", 5, "May",6, "June",7, "July", 8, "August", 9, "September",10, "October", 11, "November",12, "December")
    for (month in months) {
        println(month)
    }
    println("The size of the months Arrays is ${months.size}")

}

data class Fruit(val name : String, val price : Double)