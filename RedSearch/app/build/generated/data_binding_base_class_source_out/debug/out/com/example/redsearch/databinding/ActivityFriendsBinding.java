// Generated by view binder compiler. Do not edit!
package com.example.redsearch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.redsearch.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFriendsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ListView friendView;

  @NonNull
  public final ToolbarFriendsBinding toolbarFriends;

  private ActivityFriendsBinding(@NonNull ConstraintLayout rootView, @NonNull ListView friendView,
      @NonNull ToolbarFriendsBinding toolbarFriends) {
    this.rootView = rootView;
    this.friendView = friendView;
    this.toolbarFriends = toolbarFriends;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFriendsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFriendsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_friends, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFriendsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.friendView;
      ListView friendView = ViewBindings.findChildViewById(rootView, id);
      if (friendView == null) {
        break missingId;
      }

      id = R.id.toolbar_friends;
      View toolbarFriends = ViewBindings.findChildViewById(rootView, id);
      if (toolbarFriends == null) {
        break missingId;
      }
      ToolbarFriendsBinding binding_toolbarFriends = ToolbarFriendsBinding.bind(toolbarFriends);

      return new ActivityFriendsBinding((ConstraintLayout) rootView, friendView,
          binding_toolbarFriends);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
