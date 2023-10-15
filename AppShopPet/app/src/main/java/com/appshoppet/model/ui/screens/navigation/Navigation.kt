package com.appshoppet.model.ui.screens.navigation

// Navigation.kt

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tuapp.ui.screens.*

object Destinations {
    const val CATALOGO_ROUTE = "catalogo"
    const val CARRITO_DE_COMPRAS_ROUTE = "carritoDeCompras"
    const val AUTENTICACION_ROUTE = "autenticacion"
}

class AppNavigation(navController: NavController) {
    init {
        navController.navigate(Destinations.CATALOGO_ROUTE)
    }
}

@Composable
fun SetupNavigation() {
    val navController = rememberNavController()
    val appNavigation = remember(navController) { AppNavigation(navController) }

    NavHost(
        navController = navController,
        startDestination = Destinations.CATALOGO_ROUTE
    ) {
        composable(Destinations.CATALOGO_ROUTE) {
            CatalogoScreen(appNavigation)
        }
        composable(Destinations.CARRITO_DE_COMPRAS_ROUTE) {
            CarritoDeComprasScreen(appNavigation)
        }
        composable(Destinations.AUTENTICACION_ROUTE) {
            AutenticacionScreen(appNavigation)
        }
    }
}
