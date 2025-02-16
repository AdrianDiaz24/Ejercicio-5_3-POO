class Lavadora(val marca: String, val modelo: String, var encendido: Boolean = false): EncendidoApagado {

    override fun encender(): Boolean {
        if (!encendido){
            encendido = true
        }
        return true
    }

    override fun apagar(): Boolean {
        if (encendido){
            encendido = false
        }
        return true
    }

    override fun toString(): String {
        return if (encendido){
            "La lavadra $marca $modelo esta encendida"
        } else {
            "La lavadora $marca $modelo esta apagada"
        }
    }
}