package com.example.thenewsapp.ui.fragments

import String
import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.thenewsapp.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class FavouritesFragmentDirections private constructor() {
  private data class ActionFavouritesFragmentToArticleFragment(
    public val article: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_favouritesFragment_to_articleFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(String::class.java)) {
          result.putParcelable("article", this.article as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(String::class.java)) {
          result.putSerializable("article", this.article as Serializable)
        } else {
          throw UnsupportedOperationException(String::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionFavouritesFragmentToArticleFragment(article: String): NavDirections =
        ActionFavouritesFragmentToArticleFragment(article)
  }
}
