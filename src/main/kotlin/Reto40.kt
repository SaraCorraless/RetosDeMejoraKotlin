/*
 * Reto #39
 * TOP ALGORITMOS: QUICK SORT
 * Fecha publicación enunciado: 27/09/22
 * Fecha publicación resolución: 03/10/22
 * Dificultad: MEDIA
 *
 * Enunciado: Implementa uno de los algoritmos de ordenación más famosos: el "Quick Sort",
 * creado por C.A.R. Hoare.
 * - Entender el funcionamiento de los algoritmos más utilizados de la historia nos ayuda a
 *   mejorar nuestro conocimiento sobre ingeniería de software. Dedícale tiempo a entenderlo,
 *   no únicamente a copiar su implementación.
 * - Esta es una nueva serie de retos llamada "TOP ALGORITMOS", donde trabajaremos y entenderemos
 *   los más famosos de la historia.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

class Reto40() {
    var arrayNum = arrayOf(8, 3, 6, 4, 2, 5, 7, 1)

    fun quickSoft(){
        var newArray = fase1(arrayNum)
        /*despues de ordenar los mayores y los menores se divide
        la lista en dos y se repite el proceso con cada parte
        */
        var parte1A = newArray.copyOfRange(0, (newArray.size)/2)
        var parte2A = newArray.copyOfRange((newArray.size)/2, newArray.size)
        var part1 = fase1(parte1A)

    }


    fun fase1(listaNum:Array<Int>): Array<Int>{

        var cambio:Int

        var pivot = listaNum[(listaNum.size / 2)-1]
        var punte1 = 0
        var punte2 = listaNum.size-1
        for (it in 0 .. listaNum.size-1){

            if (listaNum.get(punte1) > pivot && listaNum.get(punte2) < pivot){

                cambio = listaNum[punte1]
                listaNum.set(punte1, (listaNum.get(punte2)))
                listaNum.set(punte2, cambio)
                cambio = 0

                punte1++
                punte2--
            } else{
                if (listaNum.get(punte1) < pivot ){
                    punte1++
                }

                if (listaNum.get(punte2) > pivot){
                    punte2--
                }
            }

        }

        //println(listaNum.sortedArray().contentToString())
        return listaNum

    }
}