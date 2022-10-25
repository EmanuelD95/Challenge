
fun areaDeUnPoligono() {
    println("Reto #4\n" +
                "* ÁREA DE UN POLÍGONO\n" +
                "* Dificultad: FÁCIL\n" +
                "*\n" +
                "* Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.\n" +
                "* - La función recibirá por parámetro sólo UN polígono a la vez.\n" +
                "* - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.\n" +
                "* - Imprime el cálculo del área de un polígono de cada tipo.\n" +
                "*\n" +
                "*/\n"
    )
    areaDe(Triangulo(5.0,6.0))
    areaDe(Rectangulo(3.0,4.0))
    areaDe(Cuadrado(2.0))

}
private fun areaDe(poligono: Poligono) {
    poligono.imprimirArea()
}


interface Poligono {
    fun area(): Double
    fun imprimirArea()
}
data class Triangulo(val base: Double, val altura: Double): Poligono {
    override fun area(): Double {
        return (base * altura)/2
    }

    override fun imprimirArea() {
        println("El area del triangulo es: ${area()}")
    }
}
data class Rectangulo(val largo: Double, val ancho: Double): Poligono {
    override fun area(): Double {
        return largo * ancho
    }

    override fun imprimirArea() {
        println("El area del rectangulo es: ${area()}")
    }
}
data class Cuadrado(val lado: Double): Poligono {
    override fun area(): Double {
        return lado * lado
    }

    override fun imprimirArea() {
        println("El area del cuadrado es: ${area()}")
    }
}

