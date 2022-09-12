/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21
 * Fecha publicación resolución: 03/01/22
 * Dificultad: FÁCIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

class Reto1(){

    fun prueba(): Unit {
        val rep = 100
        var result = ""
        for (i in 1..rep){
            if (i % 3 == 0){
                result = "El número $i es múltiplo de 3: fizz"
            }

            if (i % 5 == 0){
                result = "El número $i es múltiplo de 5: buzz"
            }

            if (i % 5 == 0 && i % 3 == 0){
                result = "El número $i es múltiplo de 5 y de 3: fizzbuzz"
            }

            if (result.isNotEmpty()){
                println(result)
                result = ""
            }

        }


    }

}