package org.example.entidades

import org.example.enumeradores.Setor
import org.example.enumeradores.Sexo
import java.math.BigDecimal

class Profissional (
    nome : String,
    cpf : Long,
    sexo : Sexo,
    idade : Int,
    val salario : BigDecimal,
    val telefone : Long,
    val funcao : String,
    val experiencia : String,
    val setor : Setor
) : Pessoa(
    nome = nome,
    cpf = cpf,
    sexo = sexo,
    idade = idade
) {
    fun installCaixaDAgua(clt: Profissional) {
        if (clt.setor.equals(Setor.MONTAGEM)) {
            println("Profissional Qualificado! ")
        } else {
            println("Profissional não qualificado!! ")
        }
    }

    override fun receberConta(conta: Conta, aPagar: BigDecimal) {
        conta.saldo = conta.saldo.subtract(aPagar)
    }

}