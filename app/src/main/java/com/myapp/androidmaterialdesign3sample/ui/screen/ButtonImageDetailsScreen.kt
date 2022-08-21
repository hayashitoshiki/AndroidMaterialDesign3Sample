package com.myapp.androidmaterialdesign3sample.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.flowlayout.FlowRow
import com.myapp.androidmaterialdesign3sample.ui.component.*

@ExperimentalMaterial3Api
@Composable
fun ButtonImageDetailsScreen(navController: NavHostController) {
    ButtonImageDetailsContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun ButtonImageDetailsContent(navController: NavHostController) {
    val selected = remember { mutableStateOf(0) }
    val item = listOf("One", "Two", "Three")

    Column(
        modifier = Modifier
            .padding(8.dp)
            .verticalScroll(rememberScrollState())
    ) {
        HeadLineTextM(text = "Button Sample")
        Spacer(modifier = Modifier.size(16.dp))

        TitleTextM(text = "Button list")
        Spacer(modifier = Modifier.size(16.dp))
        FlowRow {
            ElevatedButtonUtil(text = "ElevatedButton", onClick = {})
            FilledButtonUtil(text = "FilledButton", onClick = {})
            FilledTonalButtonUtil(text = "FilledTonalButton", onClick = {})
            OutlinedButtonUtil(text = "OutlinedButton", onClick = {})
            TextButtonUtil(text = "TextButton", onClick = {})
            IconButtonUtil(onClick = {}, icons = Icons.Filled.Favorite)
            FloatingActionButtonUtil(icons = Icons.Filled.Favorite, onClick = {})
            ExtendedFloatingActionButtonUtil(text = "Extended FAB", icons = Icons.Filled.Favorite, onClick = {})
            SegmentedControl(items = item, selectedIndex = selected)
        }
        Spacer(modifier = Modifier.size(16.dp))

        TitleTextM(text = "FAB")
        Row {
            FloatingActionButtonUtil(icons = Icons.Filled.Favorite, onClick = {}, size = FabSize.LARGE)
            Spacer(modifier = Modifier.size(8.dp))
            FloatingActionButtonUtil(icons = Icons.Filled.Favorite, onClick = {}, size = FabSize.MEDIUM)
            Spacer(modifier = Modifier.size(8.dp))
            FloatingActionButtonUtil(icons = Icons.Filled.Favorite, onClick = {}, size = FabSize.SMALL)
        }
        Spacer(modifier = Modifier.size(8.dp))
        Row{
            FloatingActionButtonUtil(icons = Icons.Filled.Favorite, onClick = {}, color = FabColor.SURFACE)
            Spacer(modifier = Modifier.size(8.dp))
            FloatingActionButtonUtil(icons = Icons.Filled.Favorite,  onClick = {}, color = FabColor.SECONDARY)
            Spacer(modifier = Modifier.size(8.dp))
            FloatingActionButtonUtil(icons = Icons.Filled.Favorite,  onClick = {}, color = FabColor.TERTIARY)
        }
        Spacer(modifier = Modifier.size(16.dp))

        TitleTextM(text = "Filter")
        FlowRow {
            UtilFilter(
                selected = true,
                label = "選択状態"
            ){}
            UtilFilter(
                selected = false,
                label = "非選択状態"
            ){}
            UtilFilter(
                enabled = false,
                selected = false,
                label = "非活性状態"
            ){}
        }
    }
}
