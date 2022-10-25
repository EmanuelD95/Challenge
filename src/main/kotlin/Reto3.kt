
fun numerosPrimos() {
    println("Reto #3\n" +
            " * ES UN NUMERO PRIMO?\n" +
            " * Dificultad: MEDIA\n" +
            " *\n" +
            " * Enunciado: Escribe un programa que se encargue de comprobar si un numero es o no primo.\n" +
            " * Hecho esto, imprime los numeros primos entre 1 y 100.\n" +
            " *\n" +
            " */ \n")
    for (i in 1..100){
        if (i <= 2){
            println(i)
        } else {
            // Sólo impares
            if (i % 2 == 1){
                var contador: Int = 0
                // Comprueba si solo tiene 2 divisores (el 1 y el mismo)
                for (j in 1..i) {
                    if (i % j == 0){
                        contador++
                    }
                }
                if(contador == 2) println(i)
            }
        }
    }
}
