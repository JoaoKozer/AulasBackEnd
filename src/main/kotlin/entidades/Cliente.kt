package org.example.entidades

import org.example.enumeradores.Sexo
import sun.jvmstat.monitor.StringMonitor
import java.math.BigDecimal

class Cliente(
    nome : String,
    cpf : Long,
    sexo: Sexo,
    idade : Int,
    val logradouro : String,
    val telefone : Long,
    val formaPagamento : String,
    val valorServico : BigDecimal
) : Pessoa (
    nome = nome,
    cpf = cpf,
    sexo = sexo,
    idade = idade
)