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

            val temp = temperatura.replace("º", "")
            println((temp.toDouble() * 9 / 5) + 32+"º")
        }else{
            println("Introduce un valor en grados")
        }
    }
}