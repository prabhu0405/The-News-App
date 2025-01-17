// Generated by view binder compiler. Do not edit!
package com.example.thenewsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.thenewsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ItemErrorBinding itemSearchError;

  @NonNull
  public final ProgressBar paginationProgressBar;

  @NonNull
  public final RecyclerView recyclerSearch;

  @NonNull
  public final EditText searchEdit;

  private FragmentSearchBinding(@NonNull ConstraintLayout rootView,
      @NonNull ItemErrorBinding itemSearchError, @NonNull ProgressBar paginationProgressBar,
      @NonNull RecyclerView recyclerSearch, @NonNull EditText searchEdit) {
    this.rootView = rootView;
    this.itemSearchError = itemSearchError;
    this.paginationProgressBar = paginationProgressBar;
    this.recyclerSearch = recyclerSearch;
    this.searchEdit = searchEdit;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.itemSearchError;
      View itemSearchError = ViewBindings.findChildViewById(rootView, id);
      if (itemSearchError == null) {
        break missingId;
      }
      ItemErrorBinding binding_itemSearchError = ItemErrorBinding.bind(itemSearchError);

      id = R.id.paginationProgressBar;
      ProgressBar paginationProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (paginationProgressBar == null) {
        break missingId;
      }

      id = R.id.recyclerSearch;
      RecyclerView recyclerSearch = ViewBindings.findChildViewById(rootView, id);
      if (recyclerSearch == null) {
        break missingId;
      }

      id = R.id.searchEdit;
      EditText searchEdit = ViewBindings.findChildViewById(rootView, id);
      if (searchEdit == null) {
        break missingId;
      }

      return new FragmentSearchBinding((ConstraintLayout) rootView, binding_itemSearchError,
          paginationProgressBar, recyclerSearch, searchEdit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
