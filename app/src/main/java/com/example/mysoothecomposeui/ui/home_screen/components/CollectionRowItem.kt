package com.example.mysoothecomposeui.ui.home_screen.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothecomposeui.model.Collection
import com.example.mysoothecomposeui.model.alignYourBodyCollections
import com.example.mysoothecomposeui.model.favoriteCollectionsOne
import com.example.mysoothecomposeui.ui.theme.MySootheComposeUITheme

/**
 * @author : Mingaleev D
 * @data : 22.10.2023
 */

@Composable
fun CollectionRowItem(
    collection: Collection
) {

   Column(
       horizontalAlignment = Alignment.CenterHorizontally
   ) {

      Image(
          painter = painterResource(id = collection.imageRes),
          contentDescription = null,
          modifier = Modifier
              .size(88.dp)
              .clip(CircleShape),
          contentScale = ContentScale.Crop

      )

      Text(
          text = collection.name,
          modifier = Modifier.paddingFromBaseline(24.dp),
          style = MaterialTheme.typography.h3
      )
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
private fun CollectionRowItemPreview() {
   MySootheComposeUITheme {
      CollectionRowItem(collection = alignYourBodyCollections.first())
   }
}