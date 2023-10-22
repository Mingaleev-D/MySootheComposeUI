package com.example.mysoothecomposeui.ui.home_screen.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
fun CollectionRow(
    collections: List<Collection>
) {

   LazyRow(
       modifier = Modifier.fillMaxWidth(),
       horizontalArrangement = Arrangement.spacedBy(8.dp),
       contentPadding = PaddingValues(horizontal = 16.dp),
   ) {
      items(collections) {
         CollectionRowItem(collection = it)
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
private fun FavoriteCollectionRowPreview() {
   MySootheComposeUITheme {
      CollectionRow(collections = alignYourBodyCollections)
   }
}