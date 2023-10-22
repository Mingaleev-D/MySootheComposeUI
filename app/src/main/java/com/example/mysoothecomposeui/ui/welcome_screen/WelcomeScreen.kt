package com.example.mysoothecomposeui.ui.welcome_screen

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothecomposeui.R
import com.example.mysoothecomposeui.ui.theme.MySootheComposeUITheme
import com.example.mysoothecomposeui.ui.welcome_screen.components.MySootheButton

/**
 * @author : Mingaleev D
 * @data : 21.10.2023
 */

@Composable
fun WelcomeScreen(
    loginButtonClicked: () -> Unit
) {

   Box(
       modifier = Modifier
           .fillMaxSize()
           .background(color = MaterialTheme.colors.background)
   ) {
      WelcomeBackground()

      ButtonColumn(
          modifier = Modifier.align(Alignment.Center),
          loginButtonClicked = loginButtonClicked,
      )
   }

}

@Composable
private fun ButtonColumn(
    modifier: Modifier = Modifier,
    loginButtonClicked: () -> Unit
) {
   Column(
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier = modifier.padding(horizontal = 16.dp)
   ) {
      AppLogo()

      Spacer(modifier = Modifier.height(32.dp))

      MySootheButton(
          onClick = { /*TODO*/ },
          buttonText = "Sign up"
      )

      Spacer(modifier = Modifier.height(8.dp))

      MySootheButton(
          onClick = { loginButtonClicked() },
          buttonText = "Login in",
          backgroundColor = MaterialTheme.colors.secondary
      )
   }
}

@Composable
private fun AppLogo() {

   val isLigth = MaterialTheme.colors.isLight
   val appLogoRes = if (isLigth) {
      R.drawable.ic_light_logo
   } else {
      R.drawable.ic_dark_logo
   }

   Image(
       painter = painterResource(id = appLogoRes),
       contentDescription = null
   )
}

@Composable
private fun WelcomeBackground() {
   val isLigth = MaterialTheme.colors.isLight
   val backgResource = if (isLigth) {
      R.drawable.ic_light_welcome
   } else {
      R.drawable.ic_dark_welcome
   }

   Image(
       painter = painterResource(id = backgResource),
       contentDescription = null,
       modifier = Modifier.fillMaxSize(),
       contentScale = ContentScale.FillBounds
   )
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
private fun WelcomeScreenPreview() {
   MySootheComposeUITheme {
      WelcomeScreen(){

      }
   }
}