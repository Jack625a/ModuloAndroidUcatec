class Animal {

    var nombre = ""
    var edad = 0

    fun crear(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }
    fun comer() {
        println("$nombre esta comiendo")
    }

    fun caminar() {
        println("$nombre esta caminando")
    }
}