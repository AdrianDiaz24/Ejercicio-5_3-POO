interface Vehiculo {

    var motorEncendido: Boolean
    var kmHora: Int

    fun acelerar(x: Int)

    fun frenar(x: Int)
}