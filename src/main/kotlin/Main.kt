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
}
