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
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.displayLarge,
        color = color,
        text = text
    )
}

@Composable
fun DisplayTextM(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.displayMedium,
        color = color,
        text = text
    )
}

@Composable
fun DisplayTextS(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.displaySmall,
        color = color,
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
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.headlineMedium,
        color = color,
        text = text
    )
}

@Composable
fun HeadLineTextS(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall,
        color = color,
        text = text
    )
}

@Composable
fun TitleTextL(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.titleLarge,
        color = color,
        text = text
    )
}

@Composable
fun TitleTextM(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.titleMedium,
        color = color,
        text = text
    )
}

@Composable
fun TitleTextS(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.titleSmall,
        color = color,
        text = text
    )
}

@Composable
fun BodyTextL(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.bodyLarge,
        color = color,
        text = text
    )
}

@Composable
fun BodyTextM(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.bodyMedium,
        color = color,
        text = text
    )
}

@Composable
fun BodyTextS(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall,
        color = color,
        text = text
    )
}

@Composable
fun LabelTextL(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.labelLarge,
        color = color,
        text = text
    )
}

@Composable
fun LabelTextM(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.labelMedium,
        color = color,
        text = text
    )
}

@Composable
fun LabelTextS(
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier = modifier,
        style = MaterialTheme.typography.labelSmall,
        color = color,
        text = text
    )
}
