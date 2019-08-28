package com.fengshihao.radiogroupview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import com.fengshihao.ui.widget.RadioGroupView;

public class TestItemView2 extends RadioGroupView.ItemView {
  private static final String TAG = "TestItemView2";
  TextView mTextView;

  public TestItemView2(Context context) {
    super(context);
  }

  public TestItemView2(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public TestItemView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  public void bindViews() {
    mTextView = findViewById(R.id.text_view);
    Log.d(TAG, "bindViews: " + mTextView);
  }

  @Override
  public void updateView(@NonNull RadioGroupView.RadioModel uiModel, boolean selected) {
    Log.d(TAG, "updateView() called with:, selected = [" + selected + "]");
    TestModel2 m = (TestModel2) uiModel;
    mTextView.setText(m.mTestString);
  }

}
