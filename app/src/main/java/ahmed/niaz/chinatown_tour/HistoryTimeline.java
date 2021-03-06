package ahmed.niaz.chinatown_tour;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HistoryTimeline extends AppCompatActivity {

    Context context;
    ViewPager mSlideViewPager;
    LinearLayout mDotLayout;

    TextView[] mDots;

    TimelineSliderAdapter sliderAdapter;

    int mCurrentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.timeline);

        mSlideViewPager = (ViewPager) findViewById( R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById( R.id.dotLayout);

        sliderAdapter = new TimelineSliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);
    }

    public void addDotsIndicator(int position){

        mDots = new TextView[3];
        mDotLayout.removeAllViews();

        for(int i=0; i<mDots.length; i++){

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor( R.color.colorTransparentWhite));

            mDotLayout.addView(mDots[i]);
        }

        if(position < mDots.length){

            mDots[position].setTextColor(getResources().getColor( R.color.colorPrimaryDark));

        }

    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);

            mCurrentPage = i;

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}