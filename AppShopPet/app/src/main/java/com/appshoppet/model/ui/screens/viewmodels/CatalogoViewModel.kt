package com.appshoppet.model.ui.screens.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.appshoppet.model.ui.screens.Producto

class CatalogoViewModel : ViewModel() {
    private val _productos = MutableLiveData<List<Producto>>()
    val productos: LiveData<List<Producto>> get() = _productos

    // Implementa la lógica para cargar los productos del catálogo aquí
}
