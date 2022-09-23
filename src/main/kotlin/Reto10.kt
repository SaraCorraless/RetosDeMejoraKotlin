import java.util.*

/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

class Reto10() {
    private val alfabetoMorse =
        mapOf("A" to ".-", "B" to "-...", "C" to "-.-.",
            "D" to "-..", "E" to ".", "F" to "..-.",
            "G" to "--.", "H" to "....", "I" to "..",
            "J" to ".---", "K" to "-.-", "L" to ".-..",
            "M" to "--", "N" to "-.", "O" to "---",
            "P" to ".--.", "Q" to "--.-", "R" to ".-.",
            "S" to "...", "T" to "-", "U" to "..-",
            "V" to "...-", "W" to ".--", "X" to "-..-",
            "Y" to "-.--", "Z" to "--..", "1" to ".----",
            "2" to "..---", "3" to "...--", "4" to "....-",
            "5" to ".....", "6" to "-....", "7" to "--...",
            "8" to "---..", "9" to "----.", "0" to "-----")



    fun conversion(palabra:String){
        when{
            Regex("[0-9]|[A-z]").containsMatchIn(palabra) -> alfabetoMorse(palabra)
            Regex("[.]|[-]|[ ]|[  ]").containsMatchIn(palabra) -> morseAlfabeto(palabra)
        }

    }

    fun morseAlfabeto(palabra:String){
        println("convertir a alfabeto")

    }

    fun alfabetoMorse(palabra:String){
        println("Convertir a morse")

        var uperPalabra =  palabra.uppercase(Locale.getDefault())

        for (i in 0..uperPalabra.length-1){
            if (uperPalabra.get(i).toString() == " "){
                print("  ")
            }else {
                print(" "+alfabetoMorse[uperPalabra.get(i).toString()])
            }

        }
    }


}