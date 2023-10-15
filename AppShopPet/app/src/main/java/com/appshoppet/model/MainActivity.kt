package com.appshoppet.model

data class Usuario(
    val idUsuario: Int,
    val nombre: String,
    val correoElectronico: String,
    val contrasena: String
) {
    fun registrarUsuario() {
        // Implementa el registro de usuario aquí
    }

    fun iniciarSesion() {
        // Implementa el inicio de sesión aquí
    }
}
