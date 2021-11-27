// Generated by view binder compiler. Do not edit!
package com.example.redsearch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.redsearch.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomFollowListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView listCheck;

  @NonNull
  public final ImageView listClose;

  @NonNull
  public final TextView listTxt;

  private CustomFollowListBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView listCheck,
      @NonNull ImageView listClose, @NonNull TextView listTxt) {
    this.rootView = rootView;
    this.listCheck = listCheck;
    this.listClose = listClose;
    this.listTxt = listTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomFollowListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomFollowListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_follow_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomFollowListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.list_check;
      ImageView listCheck = ViewBindings.findChildViewById(rootView, id);
      if (listCheck == null) {
        break missingId;
      }

      id = R.id.list_close;
      ImageView listClose = ViewBindings.findChildViewById(rootView, id);
      if (listClose == null) {
        break missingId;
      }

      id = R.id.list_txt;
      TextView listTxt = ViewBindings.findChildViewById(rootView, id);
      if (listTxt == null) {
        break missingId;
      }

      return new CustomFollowListBinding((ConstraintLayout) rootView, listCheck, listClose,
          listTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}