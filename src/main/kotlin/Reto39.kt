import kotlin.math.*

/*
 * Reto #38
 * BINARIO A DECIMAL
 * Fecha publicación enunciado: 19/09/22
 * Fecha publicación resolución: 27/09/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa se encargue de transformar un número binario a decimal sin utilizar
 * funciones propias del lenguaje que lo hagan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 *
 */

class Reto39() {

    fun binarioAdecimal(){
        var binario = 1110111
        var num: Int = 0
        var posicion:Int = 0
        var resultado:Int = 0

        for (i in 0 .. binario.toString().length -1){
            num = binario.toString().get(i).digitToInt()
            posicion = (binario.toString().length -1)-i
            resultado += num * (Math.pow(2.0, posicion.toDouble())).roundToInt()
        }

        println("Binario: $binario\nDecimal: $resultado")

    }

}