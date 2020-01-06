package com.example.myapplication

fun main(args: Array<String>) {
//    println(sum(5, 5))
//    printArgs(1, 2, 3, 4)
//    var a = 1
//// 模板中的简单名称：
//    val s1 = "a is $a"
//
//    a = 2
//// 模板中的任意表达式：
//    val s2 = "${s1.replace("is", "was")}, but now is $a"
//    print(s2)
    val i = 1
    val s = "i = $i"
    print(s)
}

var a: Int = 0
var b = 1

fun sum(a: Int, b: Int) = a + b

fun printArgs(vararg ints: Int) {
    for (i in ints) {
        println(i)
    }
}

fun getStringLength(str: Any): Int? {
    if (str is String && str.length > 0) {
        return str.length
    }
    return null
}