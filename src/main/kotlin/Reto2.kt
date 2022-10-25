/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 */
fun fibonacci(anterior: Int = 0,actual : Int = 1) {
    if(anterior < 50) {
        if (anterior == 0){
            println(anterior)
        }
        println(actual)
        fibonacci(actual, anterior + actual)
    }
}