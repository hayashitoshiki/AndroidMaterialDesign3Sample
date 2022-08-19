package com.myapp.androidmaterialdesign3sample.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.myapp.androidmaterialdesign3sample.ui.NavigationScreens
import com.myapp.androidmaterialdesign3sample.ui.component.UtilButton
import com.myapp.androidmaterialdesign3sample.ui.theme.ColorType

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(navController: NavHostController) {
    HomeContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun HomeContent(navController: NavHostController) {
    Column {
        UtilButton(
            text = "色について",
            colorType = ColorType.PRIMARY,
            onClick = { navController.navigate(NavigationScreens.COLOR_DETAILS_SCREEN.route) },
           )

        UtilButton(
            text = "文字について",
            colorType = ColorType.PRIMARY,
            onClick = { navController.navigate(NavigationScreens.FONT_DETAILS_SCREEN.route) }
        )
    }
}