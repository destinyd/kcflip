package com.github.destinyd;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.github.destinyd.flip.FlipViewController;

/**
 * Created by dd on 14-6-5.
 */
public class KCFlip extends FlipViewController implements FlipViewController.ViewFlipListener {

    private static final String TAG = "KCFlip";
    View viewBrief = null;
    View viewDetail = null;

    public KCFlip(Context context) {
        this(context, null);
    }

    public KCFlip(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public KCFlip(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void init() {
        setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                int count = 0;
                if(viewBrief != null)
                    count = 1;
                if(viewDetail != null)
                    count = 2;
                Log.e(TAG, "count:" + count);
                return count;
            }

            @Override
            public Object getItem(int i) {
                return i;
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                switch (i){
                    case 0:
                        return viewBrief;
                    case 1:
                        return viewDetail;
                    default:
                        return null;
                }
            }
        });
        setOverFlipEnabled(false);
        setOnViewFlipListener(this);
    }

    public View getViewBrief() {
        return viewBrief;
    }

    public void setViewBrief(View viewBrief) {
        this.viewBrief = viewBrief;
        init();
    }

    public View getViewDetail() {
        return viewDetail;
    }

    public void setViewDetail(View viewDetail) {
        this.viewDetail = viewDetail;
        init();
    }

    public void to_brief(){
        setSelection(0);
        setFlipByTouchEnabled(true);
//        showFlipAnimation();
    };

    public void to_detail(){
        setSelection(1);
    };

    @Override
    public void onViewFlipped(View view, int position) {
        Log.e(TAG, "onViewFlipped");
        setFlipByTouchEnabled(false);
    }
}
