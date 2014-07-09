package com.github.destinyd.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import com.github.destinyd.KCFlip;

public class FlipButtonViewActivity extends Activity {
    KCFlip kcFlip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        kcFlip = new KCFlip(this);
        Button btn_to_detail = new Button(this);
        btn_to_detail.setText("to_detail()");
        btn_to_detail.setGravity(Gravity.CENTER);
        btn_to_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kcFlip.to_detail();
            }
        });
        Button btn_to_brief = new Button(this);
        btn_to_brief.setText("to_brief()");
        btn_to_brief.setGravity(Gravity.CENTER);
        btn_to_brief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kcFlip.to_brief();
            }
        });
        kcFlip.set_brief_view(btn_to_detail);
        kcFlip.set_detail_view(btn_to_brief);

        setContentView(kcFlip);
    }

    @Override
    protected void onResume() {
        super.onResume();
        kcFlip.onResume();
    }

    @Override
    protected void onPause() {
        kcFlip.onPause();
        super.onPause();
    }
}
