// Generated by view binder compiler. Do not edit!
package com.example.badgermapstask.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.badgermapstask.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView costumerName;

  @NonNull
  public final Button earliestCheckButton;

  @NonNull
  public final Button latestCheckButton;

  @NonNull
  public final Button orderJobsButton;

  @NonNull
  public final Button orderNamesButton;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final ConstraintLayout viewContainer;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull TextView costumerName,
      @NonNull Button earliestCheckButton, @NonNull Button latestCheckButton,
      @NonNull Button orderJobsButton, @NonNull Button orderNamesButton,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerView,
      @NonNull ConstraintLayout viewContainer) {
    this.rootView = rootView;
    this.costumerName = costumerName;
    this.earliestCheckButton = earliestCheckButton;
    this.latestCheckButton = latestCheckButton;
    this.orderJobsButton = orderJobsButton;
    this.orderNamesButton = orderNamesButton;
    this.progressBar = progressBar;
    this.recyclerView = recyclerView;
    this.viewContainer = viewContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.costumerName;
      TextView costumerName = ViewBindings.findChildViewById(rootView, id);
      if (costumerName == null) {
        break missingId;
      }

      id = R.id.earliestCheckButton;
      Button earliestCheckButton = ViewBindings.findChildViewById(rootView, id);
      if (earliestCheckButton == null) {
        break missingId;
      }

      id = R.id.latestCheckButton;
      Button latestCheckButton = ViewBindings.findChildViewById(rootView, id);
      if (latestCheckButton == null) {
        break missingId;
      }

      id = R.id.orderJobsButton;
      Button orderJobsButton = ViewBindings.findChildViewById(rootView, id);
      if (orderJobsButton == null) {
        break missingId;
      }

      id = R.id.orderNamesButton;
      Button orderNamesButton = ViewBindings.findChildViewById(rootView, id);
      if (orderNamesButton == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      ConstraintLayout viewContainer = (ConstraintLayout) rootView;

      return new ActivityMainBinding((ConstraintLayout) rootView, costumerName, earliestCheckButton,
          latestCheckButton, orderJobsButton, orderNamesButton, progressBar, recyclerView,
          viewContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
