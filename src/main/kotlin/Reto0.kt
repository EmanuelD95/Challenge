
fun fizzbuzz() {
    println("Reto #0\n" +
            "\nEnunciado: Escribe un programa que muestre por consola (con un print) los numeros de 1 a 100 (ambos incluidos y con un salto de linea entre cada impresion), sustituyendo los siguientes:\n" +
            "  - Multiplos de 3 por la palabra \"fizz\".\n" +
            "  - Multiplos de 5 por la palabra \"buzz\".\n" +
            "  - Multiplos de 3 y de 5 a la vez por la palabra \"fizzbuzz\".\n"
    )
    val numeros = mutableListOf<Int>()

    for (i in 1..100) {
        val multiploDe3: Boolean = i % 3 == 0
        val multiploDe5: Boolean = i % 5 == 0

        if (multiploDe3 && multiploDe5)
            println("fizzbuzz")
        else if (multiploDe3)
            println("fizz")
        else if (multiploDe5)
            println("buzz")
        else println(i)

    }
}
