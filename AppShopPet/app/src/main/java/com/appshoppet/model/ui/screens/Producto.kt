package com.appshoppet.model.ui.screens

data class Producto(
    val idProducto: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Float,
    val categoria: String
) {
    fun obtenerDetalles() {
        // Implementa la obtención de detalles del producto aquí
    }

    fun agregarAlCarrito() {
        // Implementa la lógica para agregar el producto al carrito de compras aquí
    }
}
