package com.example.mysoothecomposeui.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mysoothecomposeui.ui.home_screen.HomeScreen
import com.example.mysoothecomposeui.ui.login_screen.LoginScreen
import com.example.mysoothecomposeui.ui.welcome_screen.WelcomeScreen

/**
 * @author : Mingaleev D
 * @data : 22.10.2023
 */

@Composable
fun AppContentNav() {
   val navController = rememberNavController()

   NavHost(navController = navController, startDestination = "welcome") {
      composable("welcome") {
         WelcomeScreen(
             loginButtonClicked = {
                navController.navigate("login")
             }
         )
      }
      composable("login") {
         LoginScreen(
             loginButtonClicked = {
                navController.navigate("home")
             }
         )

      }
      composable("home") {
         HomeScreen()
      }
   }
}