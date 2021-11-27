// Generated by view binder compiler. Do not edit!
package com.example.redsearch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.redsearch.MapViewInScroll;
import com.example.redsearch.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MapViewInScrollBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MapViewInScroll mapscroll;

  private MapViewInScrollBinding(@NonNull LinearLayout rootView,
      @NonNull MapViewInScroll mapscroll) {
    this.rootView = rootView;
    this.mapscroll = mapscroll;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MapViewInScrollBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MapViewInScrollBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.map_view_in_scroll, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MapViewInScrollBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mapscroll;
      MapViewInScroll mapscroll = ViewBindings.findChildViewById(rootView, id);
      if (mapscroll == null) {
        break missingId;
      }

      return new MapViewInScrollBinding((LinearLayout) rootView, mapscroll);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}