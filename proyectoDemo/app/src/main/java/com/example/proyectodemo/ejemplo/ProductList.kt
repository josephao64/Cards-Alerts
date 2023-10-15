package com.example.proyectodemo.ejemplo
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.icons.Icons
import androidx.compose.material3.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

data class Product(val name: String, val category: String, val price: Double)

@Composable
fun ProductList(products: List<Product>) {
    var searchText by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Search bar
        Surface(
            color = MaterialTheme.colorScheme.primary,
            elevation = 4.dp
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                BasicTextField(
                    value = searchText,
                    onValueChange = { newValue ->
                        searchText = newValue
                    },
                    textStyle = MaterialTheme.typography.body1,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    keyboardOptions = TextFieldDefaults.keyboardOptions(
                        imeAction = ImeAction.Done
                    ),
                    placeholder = {
                        Text("Search products")
                    }
                )
            }
        }

        // Product list
        LazyColumn {
            items(products.filter {
                it.name.contains(searchText.text, ignoreCase = true)
                        || it.category.contains(searchText.text, ignoreCase = true)
            }) { product ->
                ProductListItem(product)
            }
        }
    }
}

@Composable
fun ProductListItem(product: Product) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = product.name, style = MaterialTheme.typography.h6)
        Text(text = product.category, style = MaterialTheme.typography.body2, color = Color.Gray)
        Text(text = "$${product.price}", style = MaterialTheme.typography.h6, color = MaterialTheme.colorScheme.primary)

        // Add a button to add the product to the cart
        // You can implement this functionality here
    }
}
