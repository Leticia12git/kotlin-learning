package com.leticia

class Collections {

    fun main() {

        // List
        // Sets
        // Maps

        val readOnlyShapes = listOf("triangule", " square", " circle")
        println(readOnlyShapes)

        val shapes: MutableList<String> = mutableListOf("triangule", " square", "circle")
        println(shapes)

        val shapes: MutableList<String> = mutableListOf("triangule", "circle", "square")
        val shapesLocked: List<String> = shapes


        val readOnlyShapes = listOf("triangule", "square", "circle")
        println("The first item in the list is: ${readOnlyShapes[0]}")


        val readOnlyShapes = listOf("triangule", "circle", "square")
        println("The firts item list is: ${readOnlyShapes.first()}")


        val readOnlyShapes = listOf("triangule", "square", " circle")
        println("This list has ${readOnlyShapes.count()} itens")

        val readOnlyShapes = listOf("triangule", "square", "circle")
        println("circle" in readOnlyShapes)

        val shapes: MutableList<String> = mutableListOf("triangule", "circle", "square")
        shapes.add("pentagon")
        println(shapes)

        val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
        println(readOnlyFruit)

        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
        val fruitLocked: Set<String> = fruit


        val readOnlyFruit = setOf("apple", "banana", "cherry")
        println("This set has ${readOnlyFruit.count()} itens")

        val readOnlyFruit = setOf("apple", "banana", "cherry")
        println("banana" in readOnlyFruit)


        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
        fruit.add("dragonfuit")
        println(fruit)

        fruit.remove("dragonfruit")
        println(fruit)

        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println(readOnlyJuiceMenu)

        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, " banana" to 190, " cherry " to 190)
        println(juiceMenu)


        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "banana" to 190, "cherry" to 190)
        println(juiceMenu)


        val readOnlyJuiceMenu = mapOf("apple" to 100, "banana" to 190, "cherry" to 190)
        println(" The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

        val readOnlyJuiceMenu = mapOf("apple " to 100, "banana " to 190)
        println("The value of pinaple juice is: ${readOnlyJuiceMenu["pinaple"]}")


        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple", to 100, "kiwi" to 190, "orange" to 190)
        juiceMenu["coconut"]
        println(juiceMenu)

        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190)
        juiceMenu.remove("orangeg")
        println(juiceMenu)

        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println("This map has ${readOnlyJuiceMenu.count()} key-value-pairs")


        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println(readOnlyJuiceMenu.containsKey("kiwi"))


        val readOnlyJuiceMenu = mapOf("apple " to 100, "kiwi" to 190, "orange" to 190)
        println(readOnlyJuiceMenu)
        println(readOnlyJuiceMenu.values)

        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 190)
        println("orange" in readOnlyJuiceMenu.keys)

        println("orange" in readOnlyJuiceMenu)

        println(200 in readOnlyJuiceMenu)
    }
}