package br.com.digitalhouse.Exercício

fun main() {

    val contrato = Contrato()
    contrato.nome = "Contrato"
    contrato.tipoDocumento = ".pdf"


    val documento = Documento()
    documento.nome = "Carteira de motorista"
    documento.tipoDocumento = ".doc"


    val foto = Foto()
    foto.nome = "Dias felizes"
    foto.tipoDocumento = ".jpeg"


    val impressora = Impressora()
    
    impressora.pegaImprimivel(contrato)
    impressora.pegaImprimivel(documento)
    impressora.pegaImprimivel(foto)

    impressora.imprimeLista()


}