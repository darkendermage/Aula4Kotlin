package br.com.digitalhouse.Exercício

class Documento: Imprimivel {

    override var nome: String = ""

    override var tipoDocumento: String = ""

    override fun imprimir() {
        println("Eu sou um documento do Word, ${nome + tipoDocumento} .")
    }
}