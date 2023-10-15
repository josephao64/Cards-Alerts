package com.example.navegacionkotlin

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navegacionkotlin.Components.MainIconButton
import com.example.navegacionkotlin.Components.TitleBar
import com.example.navegacionkotlin.Views.MainButton
import com.example.navegacionkotlin.Views.Space
import com.example.navegacionkotlin.Views.TitleView

@OptIn (ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")

@Composable
fun DetailView (navController: NavController, id: Int, opcional: String?){
    Scaffold (
        topBar = {
            TopAppBar(
                title = { TitleBar(name = "Detail View")},
                colors= TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Blue
                ),
                navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack){
                        navController.popBackStack()
                    }


                }
            )
        }
    ){
        ContentDetailView (navController, id, opcional)

    }

}

@Composable
fun ContentDetailView(navController: NavController, id: Int, opcional: String?) {
    Column {
        TitleView(name = "Detail View")
        Space()
        TitleView(name = id.toString())
        Space()

        if (opcional == ""){
            Spacer(modifier = Modifier.height(8.dp))

        }else {
            TitleView(name = opcional.orEmpty())
        }
        MainButton(name = "Retunr Hoome", backColor = Color.Blue, color = Color.White) {

            navController.popBackStack()
        }
    }

}