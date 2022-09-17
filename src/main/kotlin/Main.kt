fun main(args: Array<String>) {
    //Reto1().prueba()
    //Reto2().anagrama("is","si")
    //Reto3().fibonacci()

    for (num in 1 .. 100){
        if(Reto4().primos(num)){
            println("$num es un número primo")
        }
    }

}