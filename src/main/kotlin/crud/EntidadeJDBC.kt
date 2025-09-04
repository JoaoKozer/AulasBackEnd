package org.example.crud

import java.sql.Connection
import java.sql.DriverManager

class EntidadeJDBC(
    val user : String,
    val url : String,
    val pass : String
) {
    fun conectarDB(): Connection? {
        try {
            val conecao: Connection =
                DriverManager.getConnection(
                    this.url, this.user, this.pass
                )
            println("Conexão bem sucedida")
            return conecao
        } catch (e: Exception) {
            println("Não Conectou")
            println(e.printStackTrace())
        }
        return null
    }
}