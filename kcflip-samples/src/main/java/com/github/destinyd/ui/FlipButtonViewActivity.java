package com.github.destinyd.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import com.github.destinyd.FlipBriefLayout;

public class FlipButtonViewActivity extends Activity {
    FlipBriefLayout flipBriefLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        flipBriefLayout = new FlipBriefLayout(this);
        Button btn_to_detail = new Button(this);
        btn_to_detail.setText("to_detail()");
        btn_to_detail.setGravity(Gravity.CENTER);
        btn_to_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipBriefLayout.to_detail();
            }
        });
        Button btn_to_brief = new Button(this);
        btn_to_brief.setText("to_brief()");
        btn_to_brief.setGravity(Gravity.CENTER);
        btn_to_brief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipBriefLayout.to_brief();
            }
        });
        flipBriefLayout.set_brief_view(btn_to_detail);
        flipBriefLayout.set_detail_view(btn_to_brief);

        setContentView(flipBriefLayout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        flipBriefLayout.onResume();
    }

    @Override
    protected void onPause() {
        flipBriefLayout.onPause();
        super.onPause();
    }
}
