class Lavadora(marca: String, modelo: String, var encendido: Boolean = false): EncendidoApagado {

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
}