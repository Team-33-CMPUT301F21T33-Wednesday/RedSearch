// Generated by view binder compiler. Do not edit!
package com.example.redsearch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.redsearch.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HabitcontentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView HabitTitle;

  @NonNull
  public final Button ProgressButton;

  private HabitcontentBinding(@NonNull LinearLayout rootView, @NonNull TextView HabitTitle,
      @NonNull Button ProgressButton) {
    this.rootView = rootView;
    this.HabitTitle = HabitTitle;
    this.ProgressButton = ProgressButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HabitcontentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HabitcontentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.habitcontent, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HabitcontentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.HabitTitle;
      TextView HabitTitle = ViewBindings.findChildViewById(rootView, id);
      if (HabitTitle == null) {
        break missingId;
      }

      id = R.id.ProgressButton;
      Button ProgressButton = ViewBindings.findChildViewById(rootView, id);
      if (ProgressButton == null) {
        break missingId;
      }

      return new HabitcontentBinding((LinearLayout) rootView, HabitTitle, ProgressButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
