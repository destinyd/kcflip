package com.github.destinyd.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.github.destinyd.FlipBriefLayout;
import com.github.destinyd.R;

public class FlipComplexActivity extends Activity {
    FlipBriefLayout flipBriefLayout;
    LinearLayout ly_brief;
    ScrollView sv_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_layout);
        flipBriefLayout = (FlipBriefLayout) findViewById(R.id.kcflip);
//        kcFlip = new KCFlip(this);
//
        ly_brief = (LinearLayout)getLayoutInflater().inflate(R.layout.brief, null);
        sv_detail = (ScrollView)getLayoutInflater().inflate(R.layout.detail, null);
        Button btn_to_brief = (Button)sv_detail.findViewById(R.id.to_brief);
        btn_to_brief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipBriefLayout.to_brief();
            }
        });
        flipBriefLayout.set_brief_view(ly_brief);
        flipBriefLayout.set_detail_view(sv_detail);
//        setContentView(kcFlip, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
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
