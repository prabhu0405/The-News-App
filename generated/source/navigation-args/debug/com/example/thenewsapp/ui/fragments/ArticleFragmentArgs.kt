package com.example.thenewsapp.ui.fragments

import String
import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ArticleFragmentArgs(
  public val article: String,
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(String::class.java)) {
      result.set("article", this.article as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(String::class.java)) {
      result.set("article", this.article as Serializable)
    } else {
      throw UnsupportedOperationException(String::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): ArticleFragmentArgs {
      bundle.setClassLoader(ArticleFragmentArgs::class.java.classLoader)
      val __article : String?
      if (bundle.containsKey("article")) {
        if (Parcelable::class.java.isAssignableFrom(String::class.java) ||
            Serializable::class.java.isAssignableFrom(String::class.java)) {
          __article = bundle.get("article") as String?
        } else {
          throw UnsupportedOperationException(String::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__article == null) {
          throw IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"article\" is missing and does not have an android:defaultValue")
      }
      return ArticleFragmentArgs(__article)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ArticleFragmentArgs {
      val __article : String?
      if (savedStateHandle.contains("article")) {
        if (Parcelable::class.java.isAssignableFrom(String::class.java) ||
            Serializable::class.java.isAssignableFrom(String::class.java)) {
          __article = savedStateHandle.get<String?>("article")
        } else {
          throw UnsupportedOperationException(String::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__article == null) {
          throw IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"article\" is missing and does not have an android:defaultValue")
      }
      return ArticleFragmentArgs(__article)
    }
  }
}
