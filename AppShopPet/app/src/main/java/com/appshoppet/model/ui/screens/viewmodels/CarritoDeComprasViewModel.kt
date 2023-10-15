package com.appshoppet.model.ui.screens.viewmodels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.appshoppet.model.ui.screens.Producto

class CarritoDeComprasViewModel : ViewModel() {
    private val _productosEnCarrito = MutableLiveData<List<Producto>>()
    val productosEnCarrito: LiveData<List<Producto>> get() = _productosEnCarrito

    // Implementa la lógica para agregar productos al carrito y calcular el total aquí
}

