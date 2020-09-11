package br.com.digitalhouse.Exercício

class Contrato : Imprimivel {

    override var nome: String = ""

    override var tipoDocumento: String = ""

    override fun imprimir() {
        println("Sou um contato muito legal,${nome + tipoDocumento} .")
    }
}