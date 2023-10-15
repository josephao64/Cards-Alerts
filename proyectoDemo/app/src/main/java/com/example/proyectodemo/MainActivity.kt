package com.example.proyectodemo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


data class Product(val name: String, val category: String, val price: Double)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackComposeExampleTheme {
                // Call your main Composable function here
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val products = listOf(
        Product("Dog Food", "Pet Food", 12.99),
        Product("Cat Toy", "Toys", 5.99),
        Product("Fish Tank", "Aquariums", 49.99),
        // Add more products here
    )

    // Call your ProductList Composable with the product list
    ProductList(products = products)
}
