package myandroidtest.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

//    Button mbutton;
//    Button mbtn2;
//    Button mbtn3;
    LinearLayout mTitleIcon;
    LinearLayout mSubtitleIcon;

    boolean flag, down, exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mbutton = (Button) findViewById(R.id.button);
        mTitleIcon = (LinearLayout) findViewById(R.id.icona);
        mSubtitleIcon = (LinearLayout) findViewById(R.id.iconb);
//        mbtn2 = (Button) findViewById(R.id.button2);
//        mbtn3 = (Button) findViewById(R.id.button3);

        flag = false;
        down = false;
        exp = false;
//        mbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(flag){
//                    flag = false;
//                    mTitleIcon.setVisibility(View.GONE);
//                    mSubtitleIcon.setVisibility(View.VISIBLE);
//                } else{
//                    flag = true;
//                    mTitleIcon.setVisibility(View.VISIBLE);
//                    mSubtitleIcon.setVisibility(View.GONE);
//                }
//
//            }
//        });
//
//        mbtn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(down){
//                    down = false;
//                    ImageView img = (ImageView) mTitleIcon.getChildAt(0);
//                    hideImg(img);
//                    img = (ImageView) mSubtitleIcon.getChildAt(0);
//                    hideImg(img);
//
//                } else{
//
//                    down = true;
//                    ImageView img = (ImageView) mTitleIcon.getChildAt(0);
//                    showImg(img);
//                    img = (ImageView) mSubtitleIcon.getChildAt(0);
//                    showImg(img);
//
//                }
//            }
//        });
//
//        mbtn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(exp){
//                    exp = false;
//                    ImageView img = (ImageView) mTitleIcon.getChildAt(1);
//                    hideImg(img);
//                    img = (ImageView) mSubtitleIcon.getChildAt(1);
//                    hideImg(img);
//                } else{
//                    exp = true;
//                    ImageView img = (ImageView) mTitleIcon.getChildAt(1);
//                    showImg(img);
//                    img = (ImageView) mSubtitleIcon.getChildAt(1);
//                    showImg(img);
//                }
//            }
//        });
    }
    public void hideImg(ImageView img){
        img.setVisibility(View.GONE);
    }
    public void showImg(ImageView img){
        img.setVisibility(View.VISIBLE);
    }
}
