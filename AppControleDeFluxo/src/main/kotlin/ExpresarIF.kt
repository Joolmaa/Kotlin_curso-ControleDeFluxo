/**
 * Expressão IF
 */
fun main() {

    var valorA = 10
    var lavorB = 20
    var i = 23

// Dicas para escerver IF

    if ((i == null) || (valorA <=8)) {

        processar()
    }

    if ((i != null)&&(lavorB > valorA)) {

        naoProcessar()
    }

    print("\nFim...")

}
fun processar() {

    print("\ntrue")
}

fun naoProcessar() {
print("\nFalse")
}