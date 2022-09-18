/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

class Reto5() {

    fun calculoPoliginos(poligono:String, base:Double?, altura:Double?, lado:Double?): String {
        var respuesta: String = ""
        when(poligono){
            "Triángulo" -> {
                respuesta = "Área del Triángulo : (Base * Altura) / 2 = "+ (base!! * altura!!) /2
            }
            "Cuadrado" -> {
                respuesta = "Área del Cuadrado : Lado * Lado = " + (lado!! * lado)
            }
            "Rectángulo" -> respuesta = "Área del Rectángulo : Base * Altura = "+ (base!! * altura!!)
            else ->{
                respuesta = "Polígono incorrecto"
            }


        }
        return respuesta
    }

}