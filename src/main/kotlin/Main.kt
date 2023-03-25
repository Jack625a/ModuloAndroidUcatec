fun main() {
   println("Hola bienvenidos al Modulo del Diplomado")
   var num:Int=20
   num=4
   println("El número es: $num")
   var num2:Double=3.1416
   println("El valor de pi es: $num2")
   var texto:String="Hola mundo"
   println(texto)
   var verdadero:Boolean=true
   println("La variable verdadero es: $verdadero")

   /*Condicionales*/
   if(num%2==0){
      println("El número es par")
   }else{
      println("El número es impar")
   }
   when(num){
      1-> println("Lunes")
      2-> println("Martes")
      3-> println("Miércoles")
      4-> println("Jueves")
      5-> println("Viernes")
      6-> println("Sábado")
      7-> println("Domingo")
      else-> println("Error, número inválido")
   }
   /*Ciclo repetitivo while*/
   var suma=0
   var numero:Int
   println("Ingrese un número o ingrese 0 para Salir")
   while(true){
      numero= readln()!!.toInt()
      if(numero==0){
         break
      }
      suma+=numero
      println("Ingrese otro número o ingrese 0 para Salir")
   }
   println("La suma de los números ingresados es: $suma")

   println("Tabla de multiplicar del 5")
   var x=1
   while(x<=10){
      println("5x$x = ${5*x}")
      x++
   }
   /*Ciclo for - tabla de multiplicación*/
   println()
   println("Ejemplos ciclo for")
   for(i in 1 ..10){
      println("Tabla del $i")
      for(j in 1 ..10){
         println("$i x $j = ${i*j}")
      }
      println()
   }
   /*Ciclo for - factorial de un número*/
   println("Ingrese un número: ")
   val n= readln()!!.toInt()
   var fac=1
   for(i in 1 ..n){
      fac*=i
   }
   println("El factorial del número $n es $fac")
   println()

   /*Ciclo for - serie de fibonaci
   a=0 b=1 c=0  a+b=c  a=b  b=c*/
   println("Los $n primeros números de la serie de Fibonacci son:")
   var a=0
   var b=1
   var c:Int
   for(i in 1 ..n){
      println(a)
      c=a+b
      a=b
      b=c
   }
   /*Ciclo for - números pares*/
   println()
   println("Números pares del 1 al 20")
   for (i in 2 ..20 step 2){
      println(i)
   }
   /*funcion sumar*/
   println()
   println("Funciones")
   val resultado=sumar(10,24)
   println("La suma es: $resultado")

   /*funcion sumarLista*/
   var listaNumeros= listOf(1,6,3,5,15,7,2,1)
   val sumLista=sumarLista(listaNumeros)
   println("La suma de la lista es: $sumLista")

    //clases
    println()
    println("Creación de clases")
    //creación del objeto de la clase
    val animalPerro=Animal("Dogy",3)
    val animalGato=Animal("Pepe",5)
    val animalCaballo=Animal("Noble",10)
    animalGato.caminar()
    animalPerro.comer()
    animalCaballo.dormir()

    //clase cuenta bancaria
    println("")
    println("Clase cuenta bancaria")
    val cuentas= listOf(
        CuentaBancaria("Daniela",2000,"123"),
        CuentaBancaria("Paola",5000,"456"),
        CuentaBancaria("Ximena",3000,"789")
    )
    println("Ingrese su contraseña:")
    val contrasenaIngresada= readLine()
    val cuenta=cuentas.find { it.contrasena==contrasenaIngresada }
    if(cuenta!=null){
        println("Bienvenido/a al cajero ${cuenta.titular}")
        var opcion:Int
        do {
            println("1. Depositar\n" +
                    "2. Retirar \n"+
                    "3. Ver saldo\n"+
                    "4. Salir".trimIndent()
            )
            opcion= readLine()?.toIntOrNull()?:0
            when(opcion){
                1->{
                    println("Ingrese la cantidad a depositar: ")
                    val cantidad= readLine()?.toIntOrNull()?:0
                    cuenta.depositar(cantidad)
                 }
                2->{
                    println("Ingrese la cantidad a retirar")
                    val cantidad= readLine()?.toIntOrNull()?:0
                    cuenta.retirar(cantidad)
                }
                3->{
                    cuenta.verSaldo()
                }
                4->{
                    println("Gracias, hasta luego")
                }else->{
                    println("Opción inválida, selecciona un opción correcta:"+"1. Depositar\n" +
                            "2. Retirar \n"+
                            "3. Ver saldo\n"+
                            "4. Salir")
                }
            }
        }while (opcion!=4)
    }else{
        println("Error, contraseña incorrecta. Inténtelo nuvamente")
    }
}
fun sumar(x:Int,y:Int):Int{
   return x+y
}
fun sumarLista(lista:List<Int>):Int{
   var suma=0
   for(numero in lista){
      suma+=numero
   }
   return suma
}
class Animal(val nombre:String,val edad:Int){
    fun comer(){
        println("$nombre está comiendo")
    }
    fun caminar(){
        println("$nombre está caminando")
    }
    fun dormir(){
        println("$nombre esta durmiendo")
    }
}
class CuentaBancaria(val titular:String,var saldo:Int, val contrasena:String){
    fun depositar(cantidad:Int){
        saldo+=cantidad
        println("Realizó el depósito de $cantidad Bs. El saldo actual es: $saldo")
    }
    fun retirar(cantidad:Int):Boolean{
        if(cantidad>saldo){
            println("Error, saldo insuficiente para completar esta acción. Saldo actual:$saldo")
            return false
        }else{
            saldo-=cantidad
            println("Retiro de $cantidad con éxito. Saldo actual: $saldo")
            return true
        }
    }
    fun verSaldo(){
        println("Saldo actual es: $saldo Bs.")
    }
}
