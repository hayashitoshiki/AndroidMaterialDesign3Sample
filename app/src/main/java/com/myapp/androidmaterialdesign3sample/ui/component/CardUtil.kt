/*
 * material Design3用Cardの基底Component定義
 */

package com.myapp.androidmaterialdesign3sample.ui.component

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FilledCardUtil(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(modifier = modifier) {
        content()
    }
}


@Composable
fun ElevatedCardUtil(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    ElevatedCard(modifier = modifier) {
        content()
    }
}

@Composable
fun OutlinedCardUtil(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    OutlinedCard(modifier = modifier) {
        content()
    }
}