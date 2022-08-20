/*
 * material Design3用Textの基底Component定義
 */

package com.myapp.androidmaterialdesign3sample.ui.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


@Composable
fun DisplayTextL(text: String) {
    Text(
        style = MaterialTheme.typography.displayLarge,
        text = text
    )
}

@Composable
fun DisplayTextM(text: String) {
    Text(
        style = MaterialTheme.typography.displayMedium,
        text = text
    )
}

@Composable
fun DisplayTextS(text: String) {
    Text(
        style = MaterialTheme.typography.displaySmall,
        text = text
    )
}

@Composable
fun HeadLineTextL(text: String, color: Color = Color.Unspecified) {
    Text(
        color = color,
        style = MaterialTheme.typography.headlineLarge,
        text = text
    )
}

@Composable
fun HeadLineTextM(text: String) {
    Text(
        style = MaterialTheme.typography.headlineMedium,
        text = text
    )
}

@Composable
fun HeadLineTextS(text: String) {
    Text(
        style = MaterialTheme.typography.headlineSmall,
        text = text
    )
}

@Composable
fun TitleTextL(text: String) {
    Text(
        style = MaterialTheme.typography.titleLarge,
        text = text
    )
}

@Composable
fun TitleTextM(text: String) {
    Text(
        style = MaterialTheme.typography.titleMedium,
        text = text
    )
}

@Composable
fun TitleTextS(text: String) {
    Text(
        style = MaterialTheme.typography.titleSmall,
        text = text
    )
}

@Composable
fun BodyTextL(text: String) {
    Text(
        style = MaterialTheme.typography.bodyLarge,
        text = text
    )
}

@Composable
fun BodyTextM(text: String) {
    Text(
        style = MaterialTheme.typography.bodyMedium,
        text = text
    )
}

@Composable
fun BodyTextS(text: String) {
    Text(
        style = MaterialTheme.typography.bodySmall,
        text = text
    )
}

@Composable
fun LabelTextL(text: String) {
    Text(
        style = MaterialTheme.typography.labelLarge,
        text = text
    )
}

@Composable
fun LabelTextM(text: String) {
    Text(
        style = MaterialTheme.typography.labelMedium,
        text = text
    )
}

@Composable
fun LabelTextS(text: String) {
    Text(
        style = MaterialTheme.typography.labelSmall,
        text = text
    )
}
