import java.util.*

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 *
 */

class Reto8() {
    fun recuento() : Unit{
        var frase: List<String> = "Es por una prueba de una de Reto prueba De".lowercase(Locale.getDefault()).split(" ")
        var repeticiones : Int = 0
        var respuesta:String = ""
        var it:Int = 0
        println(frase)
        for (i in 0 .. frase.size-1){
            while (frase.contains(frase.get(i)) && it < frase.size ){
                if (frase.get(i) == frase.get(it)){
                    repeticiones++
                }
                it++
            }
            if (!respuesta.contains(frase.get(i))){
                respuesta += "\n ${frase.get(i)} : $repeticiones"
            }

            it = 0
            repeticiones = 0
        }

        println(respuesta)



    }

}