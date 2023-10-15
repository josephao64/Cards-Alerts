package com.example.navegacionkotlin.Views

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavManager() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            HomeView(navController)
        }

        composable(
            route = "Detail/{id}/{opcional}",
            arguments = {
                // Define tus argumentos aquí si es necesario
            }
        ) { navBackStackEntry ->
            // Aquí puedes acceder a los argumentos a través de navBackStackEntry
            // y crear la vista correspondiente para "Detail"
        }
    }
}
