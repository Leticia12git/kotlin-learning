package com.leticia

class ControlFlow {
    val d: Int

    val check = true

    if (check)
    {
        d = 1
    } else
    {
        d = 2
    }
    println(d)


    val a = 1
    val b = 2

    println(if(a >= b ) a else b)

}

val obj = "Hello"

when (obj){
    "1" -> println("One")
    "Hello" -> println("Greeting")
    else -> println("Uknown")
}

val obj = "Hello"
val result = when (obj) {
    "1" -> "One"
    "Hello" -> "Greeting"

    else -> "Uknown"

    println(result)
}

fun main() {
    val trafficLightState = "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slown down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
}

for(number in 1..5){
    print(number)
}


val cakes = listOf("carrot", "cheese", "chocolate")
for(cake in cakes){
    println("Yumi, it's a ${cake cake}!"
})

}


var cakeEaten = 0
while = (cakeEaten < 3){
    println("Eat a cake")
    cakeEaten++


    var cakesEaten = 0
    var cakesBaked = 0
    while (cakeEaten < 3) {
        println("Eat a cake")
        cakeEaten++
    }
    do {
        println("Eat a cake")
        cakesBaked++

    } while (cakesBaked < cakeEaten)
}