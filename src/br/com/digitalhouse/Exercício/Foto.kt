package br.com.digitalhouse.Exercício

class Foto : Imprimivel{


    override var nome: String = ""

    override var tipoDocumento: String = ""


    override fun imprimir() {
        println("Eu sou uma selfie, ${nome + tipoDocumento} .")
    }


}