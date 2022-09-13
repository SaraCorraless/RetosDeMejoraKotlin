/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

class Reto2() {
    fun anagrama(palabra1:String, palabra2: String): Unit{

        if(palabra1.length == palabra2.length){
            val rep = palabra1.length-1
            var flag: Boolean
            var count: Int = 0
            for (i in 0..rep){
                flag = false
                for (j in rep downTo 0){
                    if(palabra1[i].toChar() == palabra2[j].toChar() && !flag){
                        flag = true
                        count++
                        println("Letras iguales: $count")
                    }
                }
            }
            if (palabra1.length == count){
                println("Las palabras $palabra1 y $palabra2 son anagramas")
            } else {
                println("Las palabras $palabra1 y $palabra2 no son anagramas")
            }

        }

    }
}

