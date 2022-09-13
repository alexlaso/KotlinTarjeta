fun main() {
    val patron = """[0-9]{12}""".toRegex()
    // patron alternativo para la tarjeta """[0-9]{4}+[0-9]{4}+-[0-9]{4}+-[0-9]{4}"""
    do {
        println("Introduce tu número de tarjeta seguido")
        val prueba = readln()
        var tarjeta = prueba.matches(patron)
    }while(!tarjeta)
}