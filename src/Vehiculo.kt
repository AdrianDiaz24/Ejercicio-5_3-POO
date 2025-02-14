interface Vehiculo {

    var motorEncendido: Boolean
    var kmHora: Int

    fun acelerar(x: Int){
        kmHora += x
    }

    fun frenar(x: Int){
        kmHora -= x
    }
}