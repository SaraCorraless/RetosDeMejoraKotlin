/*
 * Enunciado: Crea una función que transforme grados Celsius en Fahrenheit
 * y viceversa.
 *
 * - Para que un dato de entrada sea correcto debe poseer un símbolo "°"
 *   y su unidad ("C" o "F").
 * - En caso contrario retornará un error.
 * - ¿Quieres emplear lo aprendido en este reto?
 *   Revisa el reto mensual y crea una App:
 *   https://retosdeprogramacion.com/mensuales2022
 */

class Reto43() {

    fun gradosFahrenheit(temperatura:String){
        if (temperatura.contains("º")){
            if (temperatura.contains("C")){
                val temp = (temperatura.replace("ºC", "").toDouble()  * 9 / 5) + 32
                println(temp.toString()+"ºF")
            }else if (temperatura.contains("F")){
                val temp = (temperatura.replace("ºF", "").toDouble() - 32) * 5 / 9
                println(temp.toString() + "ºC")
            }

        }else{
            println("Introduce un valor en grados")
        }
    }
}