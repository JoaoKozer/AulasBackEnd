package org.example.entidades

import java.math.BigDecimal

class Conta(
    val numAccount : Long,
    val titular : Pessoa,
    var saldo : BigDecimal,
    val receber : BigDecimal,
    val saque : Double,
    val agencia : Int
) {
}