

class Telefono(val marca: String, val modelo: String, var encendido:Boolean = false):DispositivoElectronico, EncendidoApagado {

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

    override fun reiniciar():Boolean {
        if (encendido){
            this.apagar()
            this.encender()
            return true
        }
        return false
    }

    override fun toString(): String {
        return if (encendido){
            "El telefono $marca $modelo esta encendido"
        } else {
            "El telefono $marca $modelo esta apagado"
        }
    }
}