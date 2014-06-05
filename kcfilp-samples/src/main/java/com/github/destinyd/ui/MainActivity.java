package com.github.destinyd.ui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;

import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.destinyd.KCFlip;
import com.github.destinyd.R;

public class MainActivity extends Activity {
    KCFlip kcFlip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kcFlip = new KCFlip(this);
        TextView textView = new TextView(this);
        textView.setText("测试文字1");
        textView.setGravity(Gravity.CENTER);
        textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        TextView textView1 = new TextView(this);
        textView1.setText("测试文字2");
        textView1.setGravity(Gravity.CENTER);
        textView1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        kcFlip.setViewBrief(textView);
        kcFlip.setViewDetail(textView1);

        addContentView(kcFlip, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        if (item.getItemId() == R.id.action_to_brief) {
            kcFlip.to_brief();
        }
        return super.onContextItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        kcFlip.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        kcFlip.onPause();
    }
}
