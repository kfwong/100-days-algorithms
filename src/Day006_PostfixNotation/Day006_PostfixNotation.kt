package Day006_PostfixNotation

import java.util.*

fun main(args: Array<String>) {
    println(postfix("1 2 + 4 3 - + 10 5 / *"))
}

fun postfix(str: String): Int {

    var s: Stack<Int> = Stack()

    for (v in str.split(' ')) {
        if (v == "+") {
            val operandRight = s.pop()
            val operandLeft = s.pop()
            s.push(operandLeft + operandRight)
        } else if (v == "-") {
            val operandRight = s.pop()
            val operandLeft = s.pop()
            s.push(operandLeft - operandRight)
        } else if (v == "/") {
            val operandRight = s.pop()
            val operandLeft = s.pop()
            s.push(operandLeft / operandRight)
        } else if (v == "*") {
            val operandRight = s.pop()
            val operandLeft = s.pop()
            s.push(operandLeft * operandRight)
        } else s.push(v.toInt())
    }

    return s.pop()
}