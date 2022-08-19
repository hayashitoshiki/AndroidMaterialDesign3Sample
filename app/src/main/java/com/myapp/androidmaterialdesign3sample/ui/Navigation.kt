package com.myapp.androidmaterialdesign3sample.ui

import androidx.annotation.StringRes
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.myapp.androidmaterialdesign3sample.R
import com.myapp.androidmaterialdesign3sample.ui.screen.ColorDetailsScreen
import com.myapp.androidmaterialdesign3sample.ui.screen.FontDetailsScreen
import com.myapp.androidmaterialdesign3sample.ui.screen.HomeScreen

/**
 * 画面定義
 *
 * @property route 遷移パス
 * @property stringResId 画面タイトル
 */
enum class NavigationScreens(
    val route: String,
    @StringRes val stringResId: Int
) {
    HOME_SCREEN("home_route", R.string.navigation_title_home),
    COLOR_DETAILS_SCREEN("color_details_route", R.string.navigation_title_color_details),
    FONT_DETAILS_SCREEN("font_details_route", R.string.navigation_title_font_details)
}

/**
 * NavigationHost 画面遷移定義
 *
 * @param navController ナビゲーションAPI
 */
@ExperimentalMaterial3Api
@Composable
fun AppNavHost(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = NavigationScreens.HOME_SCREEN.route
    ) {
        composable(route = NavigationScreens.HOME_SCREEN.route) { HomeScreen(navController) }
        composable(route = NavigationScreens.COLOR_DETAILS_SCREEN.route) { ColorDetailsScreen(navController) }
        composable(route = NavigationScreens.FONT_DETAILS_SCREEN.route) { FontDetailsScreen(navController) }

    }
}