import java.math.BigDecimal

fun main() {
   println("Hola bienvenidos al Modulo del Diplomado")
/*
   var num: Int=25
   println("El numero es: $num")
   var num2: Double = 3.1416
   println("El valor de pi es: $num2")
   var texto: String = "david"
   println("Hola $texto")
   var valor: Boolean = true
   println("la variable es: $valor")

   if (num%2 == 0) {
      println("El número $num es PAR")
   } else {
      println("El número $num es IMPAR")
   }

   var dia = 5
   when (dia) {
       1 -> println("Lunes")
       2 -> println("Martes")
       3 -> println("Miércoles")
       4 -> println("Jueves")
       5 -> println("Viernes")
       6 -> println("Sábado")
       7 -> println("Domingo")
       else -> println("dia invalido.")
   }


   var cont = 1
   while (cont <= 10) {
       println(cont)
       cont++
   }

   var suma=0
   var numero: Int
   print("Ingrese un numero o ingrese 0 para salir: ")
   while (true) {
       numero = readLine()?.toInt() as Int
       if (numero == 0) {
           break
       }
       suma = suma + numero
       println("Ingrese un numero o 0 para salir: ")
   }
   println("La suma de los numeros ingresados es: $suma")

   println("Tabla de multiplicar del 8")
   var acumulador = 1
   while (acumulador<=10) {
       println("8x $acumulador = ${8*acumulador}")
       acumulador++
   }

   //ciclo for - tabla de multiplicar del 1 al 10
    for (i in 1 .. 10) {
        println("Tabla del $i")
        for (j in 1 .. 10)
            println(" $i x $j = ${j * i}")
        println()
    }

    // factorial
    print("Ingresar un numero para realizar el calculo del factorial ")
    num = readLine()?.toInt() as Int
    var factorial = BigDecimal("1")
    for (i in 1..num) {
        factorial *= BigDecimal.valueOf(i.toLong())
    }
    println("El factorial de $num = $factorial")

    // ejercicio serie de fibonaci de los 10 valores
    var a = 0
    var b = 1
    var c: Int
    for (i in 1..10) {
        println(a)
        c = a + b
        a = b
        b = c
    }
    println()

    // mostrra los numeros pares
    for (i in 2..50 step 2) {
        println(i)
    }

    print("La suma es: ")
    println(suma(4, 5))

    // funciones en kotli
    var lista = listOf(4, 5, 8, 17, 2, 63, 1)
    val sumarLista = sumaLista(lista)
    println("La suma de la lista es $sumarLista")
*/
    val animalPerro = Animal()
    val animalGato = Animal()
    val animalCaballo = Animal()
    animalPerro.crear("Chico", 3)
    animalGato.crear("Paco", 5)
    animalCaballo.crear("Perchero", 15)
    animalPerro.caminar()
    animalGato.comer()
    animalCaballo.comer()
    animalCaballo.caminar()

    println("Cuenta Bancaria")
    val cuentas = listOf(
        CuentaBancaria("KevinArroyo", "123"),
        CuentaBancaria("David Quispe", "456"),
        CuentaBancaria("Alex Sajama", "789")
    )
    println("Cuenta de ${cuentas.get(1).titular} con un saldo de ${cuentas.get(1).saldo}")

}

// funciones en kotli
fun suma(x:Int, y:Int): Int {
    return x + y
}

fun sumaLista(lista: List<Int>): Int {
    var suma: Int = 0
    for (numero in lista) {
        suma += numero
    }
    return suma
}