package com.example.mysoothecomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mysoothecomposeui.ui.home_screen.HomeScreen
import com.example.mysoothecomposeui.ui.login_screen.LoginScreen
import com.example.mysoothecomposeui.ui.navigation.AppContentNav
import com.example.mysoothecomposeui.ui.theme.MySootheComposeUITheme
import com.example.mysoothecomposeui.ui.welcome_screen.WelcomeScreen

class MainActivity : ComponentActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {
         MySootheComposeUITheme {
            AppContentNav()
         }
      }
   }
}



