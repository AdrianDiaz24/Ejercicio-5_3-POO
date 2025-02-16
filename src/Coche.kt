class Coche(override var motorEncendido: Boolean = false, override var kmHora: Int = 0): Vehiculo, EncendidoApagado {

    init {
        if (motorEncendido == false) {
            kmHora = 0
        }
    }

    override fun encender(): Boolean {
        if (!motorEncendido){
            motorEncendido = true
        }
        return true
    }

    override fun apagar(): Boolean {
        if (motorEncendido){
            motorEncendido = false
        }
        return true
    }

    override fun acelerar(x: Int) {
        if (motorEncendido){
            kmHora += x
        }
    }

    override fun frenar(x: Int) {
        if (motorEncendido){
            if (x >= kmHora) {
                kmHora = 0
            } else {
                kmHora -= x
            }
        }
    }


    override fun toString(): String {
        return if (motorEncendido){
            "El coche tiene el motor encendido y viaja a $kmHora Km/h"
        } else {
            "El coche tiene el motor apagado"
        }
    }

}