package com.github.destinyd.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.github.destinyd.KCFlip;
import com.github.destinyd.R;

public class FlipComplexActivity extends Activity {
    KCFlip kcFlip;
    LinearLayout ly_brief;
    ScrollView sv_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_layout);
        kcFlip = (KCFlip) findViewById(R.id.kcflip);
//        kcFlip = new KCFlip(this);
//
        ly_brief = (LinearLayout)getLayoutInflater().inflate(R.layout.brief, null);
        sv_detail = (ScrollView)getLayoutInflater().inflate(R.layout.detail, null);
        Button btn_to_brief = (Button)sv_detail.findViewById(R.id.to_brief);
        btn_to_brief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kcFlip.to_brief();
            }
        });
        kcFlip.set_brief_view(ly_brief);
        kcFlip.set_detail_view(sv_detail);
//        setContentView(kcFlip, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
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
