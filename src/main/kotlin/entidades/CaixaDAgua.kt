package org.example.entidades

import org.example.enumeradores.Cores
import org.example.enumeradores.Material
import java.math.BigDecimal

class CaixaDAgua(
    val material: Material,
    val capacidade: Double,
    val cor: Cores,
    val peso: Double,
    val preco : BigDecimal,
    val altura: Double,
    val profundidade: Double,
    val largura: Double,
    val marca: String
) {

}