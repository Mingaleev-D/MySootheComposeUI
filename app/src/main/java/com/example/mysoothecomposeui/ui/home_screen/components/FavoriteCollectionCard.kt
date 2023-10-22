package com.example.mysoothecomposeui.ui.home_screen.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothecomposeui.model.Collection
import com.example.mysoothecomposeui.model.favoriteCollectionsOne
import com.example.mysoothecomposeui.ui.theme.MySootheComposeUITheme

/**
 * @author : Mingaleev D
 * @data : 22.10.2023
 */

@Composable
fun FavoriteCollectionCard(
    collection: Collection
) {

   Card(
       modifier = Modifier.size(width = 192.dp, height = 56.dp),
   ) {
      Row(
          horizontalArrangement = Arrangement.spacedBy(16.dp),
          verticalAlignment = Alignment.CenterVertically
      ) {

         Image(
             painter = painterResource(id = collection.imageRes),
             contentDescription = null,
             modifier = Modifier.size(56.dp),
             contentScale = ContentScale.Crop
         )

         Text(
             text = collection.name,
             modifier = Modifier.weight(1f),
             style = MaterialTheme.typography.h3
         )
      }
   }

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
private fun FavoriteCollectionCardPreview() {

   val previewCollection = favoriteCollectionsOne.first()

   MySootheComposeUITheme {
      FavoriteCollectionCard(
          collection = previewCollection
      )
   }
}