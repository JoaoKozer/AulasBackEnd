package org.example.ui

fun menu() {
    var opcao: Int
    do {
        println("1 - Cadastrar Caixa D'Água")
        println("2 - Editar Caixa D'Água")
        println("3 - Listar Caixa D'Água")
        println("4 - Excluir Caixa D'Água")
        println("0 - Sair...")

        opcao = readln().toInt()

        when (opcao) {
            1 -> println("Cadastrando Caixa...")
            2 -> println("Editando Caixa...")
            3 -> println("Listando Caixas...")
            4 -> println("Excluindo Caixa...")
            0 -> println("Saindo...")
            else -> println("Opção inválida")
        }
    } while (opcao != 0)
}