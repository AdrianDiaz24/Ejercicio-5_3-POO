class Coche(override var motorEncendido: Boolean = false, override var kmHora: Int): Vehiculo, EncendidoApagado {
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

}