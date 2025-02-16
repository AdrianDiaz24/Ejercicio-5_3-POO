

fun main(){
    val telefono1 = Telefono("Xiaomi", "Redmi Note 13")
    println(telefono1)
    telefono1.reiniciar()
    println(telefono1)
    telefono1.encender()
    println(telefono1)
    telefono1.reiniciar()
    println(telefono1)
    telefono1.apagar()
    println(telefono1)

    val lavadora1 = Lavadora("Samsung", "X")
    println(lavadora1)
    lavadora1.encender()
    println(lavadora1)
    lavadora1.apagar()
    println(lavadora1)

    var coche1 = Coche()
    println(coche1)
    coche1.encender()
    println(coche1)
    coche1.acelerar(50)
    println(coche1)
    coche1.frenar(25)
    println(coche1)
}