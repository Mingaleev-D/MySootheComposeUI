package com.example.mysoothecomposeui.ui.login_screen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

/**
 * @author : Mingaleev D
 * @data : 21.10.2023
 */

@Composable
fun MySootheTextField(
    label: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
) {

   TextField(
       value = "",
       onValueChange = {

       },
       label = {
          Text(text = label)
       },
       modifier = Modifier
           .fillMaxWidth()
           .padding(horizontal = 16.dp),
       leadingIcon = {
          if (icon != null) {
             Icon(
                 imageVector = icon,
                 contentDescription = null
             )
          }
       }
   )

}