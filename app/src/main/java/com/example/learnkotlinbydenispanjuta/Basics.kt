package com.example.learnkotlinbydenispanjuta

fun main() {

//    val is a constant variable, so we can't reassignment the value (like const in javascript)
    val num1 = 10
//    num1 = 15

//    var is a variable that we can reassignment the value (like let in javascript)
    var num2 = 10
    num2 = 15

//    Byte, Int, and Long is datatype for numbers
    val num3: Byte = -100
//    var num3: Int = 100
//    var num3: Long = 100

//    Float and Double is a datatype for numbers that have coma, like 3.14
    val num4: Float = 3.14f
//    val num4: Double = 3.14

//    Unsigned integer types is mean the value is must be positive
    val age: UShort = 35u

//    Boolean data type
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val myNullableBool: Boolean? = null

//    Strings
    var name = "Danuartha"
    name = "Ida Danuartha"
    println(name.uppercase())

//    Conditional Statements
    if(age in 18u..49u) {
        println("You can go into club")
    } else if(age >= 50u) {
        println("You are too old")
    } else {
        println("You are too young to go into the club")
    }

//    readln method for get user input
    var enteredValue = readln()

    name = enteredValue.toString()

    println("Your name is ${name}")

    println("Hello World!")
}
