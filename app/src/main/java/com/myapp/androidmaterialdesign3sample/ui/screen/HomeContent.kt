package com.myapp.androidmaterialdesign3sample.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.myapp.androidmaterialdesign3sample.ui.NavigationScreens

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(navController: NavHostController) {
    HomeContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun HomeContent(navController: NavHostController) {
    Column {
        Button(onClick = { navController.navigate(NavigationScreens.COLOR_DETAILS_SCREEN.route) }) {
            Text(text = "色について")
        }
    }
}