package com.example.kotlinnavigation.Navigation
import androidx.navigation.compose.rememberNavController

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.example.kotlinnaveagcion.Views.DetailView
import com.example.kotlinnaveagcion.Views.HomeView

@Composable
fun NavManager() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeView(navController)
        }
        composable(
            route = "Detail/{id}?opcional={opcional}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                },
                navArgument("opcional") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: 0
            val opcional = backStackEntry.arguments?.getString("opcional") ?: ""
            DetailView(navController, id, opcional)
        }
    }
}
