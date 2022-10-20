/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación resolución:18/10/22
 * Dificultad: FÁCIL
 */

import java.util.*

fun main() {
    reto2()
}

fun fizzbuzz() {
    println(
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

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 */

fun reto2() {
    //Ingrese el valor de la cadena
    print("Ingrese primera palabra : ")
    val str1: String = readLine()!!//sc.nextLine()

    print("Ingrese segunda palabra : ")
    val str2: String = readLine()!!//sc.next()

    //Llamar a la función para verificar la cadena de anagramas
    println(anagrama(str1, str2))
}
fun anagrama(str1: String, str2: String): Boolean {
    // Si las cadenas son iguales no son anagramas
    if (str1.lowercase() == str2.lowercase()) {
        return false
    }

    //Convertir cadenas en matriz de caracteres
    val strArray1 = str1.lowercase().toCharArray()
    val strArray2 = str2.lowercase().toCharArray()

    // Ordenar las matrices
    Arrays.sort(strArray1)
    Arrays.sort(strArray2)

    // Comparo cadenas
    return strArray1.contentEquals(strArray2)

    //return str1.lowercase().toCharArray().sortedArray().contentEquals(str2.lowercase().toCharArray().sortedArray())
}












