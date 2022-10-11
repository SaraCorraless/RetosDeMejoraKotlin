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
    //var arrayNum = arrayOf(-2, 3, 1, 4, 2, 6, 7, 9)
    fun quickSoft(){
        var newArray = quicksort(arrayNum)
        println(newArray.contentToString())
        /*despues de ordenar los mayores y los menores se divide
        la lista en dos y se repite el proceso con cada parte
        */
        //var parte1A = newArray.copyOfRange(0, (newArray.size)/2)
        //var parte2A = newArray.copyOfRange((newArray.size)/2, newArray.size)
        //parte1A = fase1(parte1A)
        //println(parte1A.contentToString())
        //parte2A = fase1(parte2A)
        //println(parte2A.contentToString())
    }

    fun quicksort(items:Array<Int>):Array<Int>{
        if (items.count() < 2){
            return items
        }
        val pivot = items[items.count()/2]

        val equal = items.filter { it == pivot }
        println("pivot value is : "+equal)

        val less = items.filter { it < pivot }
        println("Lesser values than pivot : "+less)

        val greater = items.filter { it > pivot }
        println("Greater values than pivot : "+greater)

        return quicksort(less.toTypedArray()) + equal + quicksort(greater.toTypedArray())
    }


    fun fase1(listaNum:Array<Int>): Array<Int>{

        var cambio:Int

        var pivot = listaNum[(listaNum.size / 2)-1]
        var punte1 = 0
        var punte2 = listaNum.size-1
        for (it in 0 .. (listaNum.size-1)/2){

            if (listaNum.get(punte1) >= pivot && listaNum.get(punte2) < pivot){

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