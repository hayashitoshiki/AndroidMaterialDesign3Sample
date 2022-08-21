/*
 * material Design3用Textの基底Component定義
 */

package com.myapp.androidmaterialdesign3sample.ui.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun DisplayTextL(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.displayLarge,
        text = text
    )
}

@Composable
fun DisplayTextM(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.displayMedium,
        text = text
    )
}

@Composable
fun DisplayTextS(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.displaySmall,
        text = text
    )
}

@Composable
fun HeadLineTextL(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = Color.Unspecified
) {
    Text(
        modifier = modifier,
        color = color,
        style = MaterialTheme.typography.headlineLarge,
        text = text
    )
}

@Composable
fun HeadLineTextM(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.headlineMedium,
        text = text
    )
}

@Composable
fun HeadLineTextS(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall,
        text = text
    )
}

@Composable
fun TitleTextL(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.titleLarge,
        text = text
    )
}

@Composable
fun TitleTextM(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.titleMedium,
        text = text
    )
}

@Composable
fun TitleTextS(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.titleSmall,
        text = text
    )
}

@Composable
fun BodyTextL(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.bodyLarge,
        text = text
    )
}

@Composable
fun BodyTextM(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.bodyMedium,
        text = text
    )
}

@Composable
fun BodyTextS(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall,
        text = text
    )
}

@Composable
fun LabelTextL(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.labelLarge,
        text = text
    )
}

@Composable
fun LabelTextM(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.labelMedium,
        text = text
    )
}

@Composable
fun LabelTextS(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.labelSmall,
        text = text
    )
}
