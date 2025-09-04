package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Cores
import org.example.enumeradores.Material

val conectar = EntidadeJDBC(
    url = "jdbc:postgresql://localhost:5432/postgres",
    user = "postgres",
    pass = "5432"
)

fun createTableBox() {
    val sql = "CREATE TABLE IF NOT EXISTS CaixaDAgua " +
            " (id serial NOT NULL PRIMARY KEY," +
            " material varchar(255)," +
            " capacidade float," +
            " altura float," +
            " profundidade float," +
            " largura float," +
            " marca varchar(255)" +
            ")"
    val banco = conectar.conectarDB()
    val sendBanco = banco!!.createStatement().execute(sql)

    print(sendBanco)

    banco.close()

}

fun cadastrarCaixa() {
    println("Digite o material do qual a caixa é composta!")
    println("1 - Plástico")
    println("2 - PVC")
    println("3 - Metal")
    println("4 - Argamassa")

    val opcao = readln().toInt()
    var material : Material
    when(opcao) {
        1 -> material = Material.PLASTICO
        2 -> material = Material.PVC
        3 -> material = Material.METAL
        4 -> material = Material.ARGAMASSA
         else -> material = Material.PLASTICO

    }

    println("Digite a capacidade da Caixa")
    val capacidade = readln().toDouble()

    println("Digite a cor da Caixa")
    val opcaoCor = readln().toInt()
    var cor : Cores
    when (opcaoCor) {
        1 -> cor = Cores.AZUL
        2 -> cor = Cores.VERDE
        3 -> cor = Cores.MARROM
        4 -> cor = Cores.PRETA
        else -> cor = Cores.AZUL
    }

    println("Digite o peso da caixa")
    val peso =  readln().toDouble()

    println("Digite o preço da caixa")
    val preco = readln().toBigDecimal()

    println("Digite a altura da caixa")
    val altura = readln().toDouble()

    println("Digite a profundidade da caixa")
    val profundidade = readln().toDouble()

    println("Digite a largura da caixa")
    val largura = readln().toDouble()

    println("Digite a marca da caixa")
    val marca = readln().toString()


    val c  = CaixaDAgua(
        material = material,
        capacidade = capacidade,
        cor = cor,
        peso = peso,
        preco = preco,
        altura = altura,
        profundidade = profundidade,
        largura = largura,
        marca = marca
    )
    val banco = conectar.conectarDB()!!.prepareStatement(
        "INSERT INTO CaixaDAgua" +
        " (material, capacidade, cor, peso, preco, altura, profundidade, largura, marca)" +
        " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
    )
    banco.setString(1, c.material.name)
    banco.setDouble(2, c.capacidade)
    banco.setString(3, c.cor.name)
    banco.setDouble(4, c.peso)
    banco.setString(5, c.preco.toString())
    banco.setDouble(6, c.altura)
    banco.setDouble(7, c.profundidade)
    banco.setDouble(8, c.largura)
    banco.setString(9, c.marca)

        banco.executeUpdate()

    banco.close()
}
