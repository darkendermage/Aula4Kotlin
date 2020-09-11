package br.com.digitalhouse.Exercício

class Impressora() {

    var listaImprimivel = mutableListOf<Imprimivel>()


    fun pegaImprimivel(objeto: Imprimivel) {
        listaImprimivel.add(objeto)
    }

    fun imprimeLista() {
        for(Imprimivel in listaImprimivel) {
            Imprimivel.imprimir()
        }
    }

}