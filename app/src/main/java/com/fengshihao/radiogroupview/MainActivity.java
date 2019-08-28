package com.fengshihao.radiogroupview;

import java.util.LinkedList;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.fengshihao.ui.widget.RadioGroupView;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = "MainActivity";

  RadioGroupView groupView1;
  RadioGroupView groupView2;

  List<TestModel1> list1 = new LinkedList<>();
  List<TestModel2> list2 = new LinkedList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    for (int i = 0; i < 1000; i++) {
      list1.add(new TestModel1("test1 " + i));
      list2.add(new TestModel2("test2 " + i));
    }
  }

  @Override
  public void onStart() {
    super.onStart();

    groupView1 = findViewById(R.id.group1);
    groupView1.setModels(list1);

    groupView1.setListener(new RadioGroupView.Listener() {
      @Override
      public void onClickItem(int pos) {
        Log.d(TAG, "onClickItem: group1 click " + pos);
        // 实际代码中这里应该调用逻辑层, 逻辑层决定这个点击后是否要选择这个item
        groupView1.select(pos);
      }
    });

    groupView2 = findViewById(R.id.group2);
    groupView2.setModels(list2);
    groupView2.setListener(new RadioGroupView.Listener() {
      @Override
      public void onClickItem(int pos) {
        Log.d(TAG, "onClickItem: group2 click " + pos);
        // 实际代码中这里应该调用逻辑层, 逻辑层决定这个点击后是否要选择这个item
        groupView2.select(pos);
      }
    });
  }


}
