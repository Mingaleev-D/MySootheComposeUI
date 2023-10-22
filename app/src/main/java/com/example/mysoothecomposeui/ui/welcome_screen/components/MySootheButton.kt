package com.example.mysoothecomposeui.ui.welcome_screen.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothecomposeui.ui.theme.MySootheComposeUITheme

/**
 * @author : Mingaleev D
 * @data : 21.10.2023
 */

@Composable
fun MySootheButton(
    onClick: () -> Unit,
    buttonText: String,
    backgroundColor: Color = MaterialTheme.colors.primary,
) {
   Button(
       onClick = onClick,
       modifier = Modifier
           .height(72.dp)
           .fillMaxWidth(),
       shape = RoundedCornerShape(16.dp),
       colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
   ) {
      Text(text = buttonText)
   }
}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true
)
@Composable
private fun MySootheButtonPreview() {
   MySootheComposeUITheme {
      MySootheButton(onClick = { /*TODO*/ }, buttonText = "Sign up")
   }
}