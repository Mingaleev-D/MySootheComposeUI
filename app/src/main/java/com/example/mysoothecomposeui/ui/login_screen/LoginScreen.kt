package com.example.mysoothecomposeui.ui.login_screen

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothecomposeui.R
import com.example.mysoothecomposeui.ui.login_screen.components.MySootheTextField
import com.example.mysoothecomposeui.ui.theme.MySootheComposeUITheme
import com.example.mysoothecomposeui.ui.welcome_screen.components.MySootheButton

/**
 * @author : Mingaleev D
 * @data : 21.10.2023
 */

@Composable
fun LoginScreen(
    loginButtonClicked: () -> Unit
) {

   Surface(
       modifier = Modifier
           .fillMaxSize(),
       color = MaterialTheme.colors.background
   ) {

      LoginBacground()

      Column(
          modifier = Modifier
              .fillMaxWidth()
              .padding(horizontal = 16.dp),
          horizontalAlignment = Alignment.CenterHorizontally
      ) {

         LoginHeader()

         Spacer(modifier = Modifier.height(32.dp))

         MySootheTextField(label = "Email address")

         Spacer(modifier = Modifier.height(8.dp))

         MySootheTextField(label = "Password")

         Spacer(modifier = Modifier.height(8.dp))

         MySootheButton(
             onClick = { loginButtonClicked() },
             buttonText = "Login in"
         )

         SignUpLabel()

      }

   }
}

@Composable
private fun SignUpLabel() {

   val labelText = buildAnnotatedString {
      append("Don`t have an account? ")
      withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
         append("Sign up")
      }
   }

   Text(
       text = labelText,
       modifier = Modifier.paddingFromBaseline(32.dp)
   )
}

@Composable
private fun LoginHeader() {
   Text(
       text = "LOGIN IN",
       style = MaterialTheme.typography.h1,
       modifier = Modifier.paddingFromBaseline(200.dp),
       color = MaterialTheme.colors.onBackground
   )
}

@Composable
private fun LoginBacground() {
   val isLight = MaterialTheme.colors.isLight

   val backgroundRes = if (isLight) {
      R.drawable.ic_light_login
   } else {
      R.drawable.ic_dark_login
   }

   Image(
       painter = painterResource(id = backgroundRes),
       contentDescription = null,
       modifier = Modifier.fillMaxSize(),
       contentScale = ContentScale.FillBounds
   )
}

@Preview(
    name = "Ночь-Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "День-Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true
)
@Composable
private fun LoginScreenPreview() {
   MySootheComposeUITheme {
      LoginScreen(){

      }
   }
}