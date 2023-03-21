fun main() {
   var num: Int=25
   num=45
   println("El numero es: $num")
   var num2: Double=3.1416
   println("El valor de pi es: $num2")
   var texto: String="Hola mundo"
   println(texto)
   var verdadero:Boolean=true
   println("La variable es verdadero: $verdadero")
   if(num%2==0){
      println("El numero $num es par")
   }else{
      println("El numero $num es impar")
   }

   when (num){
      1->println("Lunes")
      2->println("Martes")
      3->println("Miercoles")
      4->println("Jueves")
      5->println("Viernes")
      6->println("Sabado")
      7->println("Domingo")
      else->println("Error numero invalido")
   }

   var i=1
   while (i<=10){
      println(i)
      i++
   }

   var suma=0
   var numero:Int
   println("Ingrese un numero - o ingrese 0 para Salir")
   while(true){
      numero=readLine()!!.toInt()
      if(numero==0){
         break
      }
      suma +=numero
      println("Ingrese otro numero o 0 para salir")
   }
   println("La suma de los numeros ingresados es $suma")

   println("Tabla de multiplicar del 8")
   var x=1
   while(x<=10){
      println("8x $x = ${8*x}")
      x++
   }

    //Ciclo For - tabla de multiplicar del 1 al 10
    for (i in 1..10){
        println("Tabla del $i")
        for(j in 1..10){
            println("$i x $j = ${i*j}")
        }
        println()

    }
    // Ejercicio 2 - factorial de un numero
    println("Ingrese un numero para realizar el calculo del factorial")
    val n= readLine()!!.toInt()
    var factorial=1
    for(i in 1.. n){
        factorial*=i
    }
    println("El factorial de $n es: $factorial")
    //Ejercicio serie de fibonaci de los 10 valores
    //a=0 b=1 c=0 a+b=c a=b b=c
    var a=0
    var b=1
    var c:Int
    for(i in 1..14){
        println(a)
        c=a+b
        a=b
        b=c
    }
    //Ejercicio 4 - numeros pares del 1 al 50
    for(i in 2..50 step 2){
        println(i)
    }
    
}
