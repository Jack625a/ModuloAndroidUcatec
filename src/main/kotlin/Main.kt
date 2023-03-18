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
}
