package com.myapp.androidmaterialdesign3sample.ui

import androidx.annotation.StringRes
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.myapp.androidmaterialdesign3sample.R
import com.myapp.androidmaterialdesign3sample.ui.screen.*

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
    FONT_DETAILS_SCREEN("font_details_route", R.string.navigation_title_font_details),
    CARD_DETAILS_SCREEN("card_details_route", R.string.navigation_title_card_details),
    BUTTON_DETAILS_SCREEN("button_details_route", R.string.navigation_title_button_details),
    BUTTON_OVERVIEW_SCREEN("button_overview_route", R.string.navigation_title_button_overview_details),
    BUTTON_IMAGE_DETAILS_SCREEN("button_image_details_route", R.string.navigation_title_button_image_details),
    TEXT_BUTTON_DETAILS_SCREEN("text_button_details_route", R.string.navigation_title_text_button_details)
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
        composable(route = NavigationScreens.CARD_DETAILS_SCREEN.route) { CardDetailsScreen(navController) }
        composable(route = NavigationScreens.BUTTON_DETAILS_SCREEN.route) { ButtonDetailsScreen(navController) }
        composable(route = NavigationScreens.BUTTON_OVERVIEW_SCREEN.route) { ButtonOverviewScreen(navController) }
        composable(route = NavigationScreens.BUTTON_IMAGE_DETAILS_SCREEN.route) { ButtonImageDetailsScreen(navController) }
        composable(route = NavigationScreens.TEXT_BUTTON_DETAILS_SCREEN.route) { TextButtonDetailsScreen(navController) }
    }
}