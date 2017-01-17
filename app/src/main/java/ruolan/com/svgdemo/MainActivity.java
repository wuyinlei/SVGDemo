package ruolan.com.svgdemo;

import android.graphics.Typeface;
import android.support.annotation.MenuRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    boolean isSelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        //创建Typeface    给入第一步的字体路径
        Typeface typeface =Typeface.createFromAsset(getAssets(),"iconfont.ttf");

        mTextView.setTypeface(typeface);

        /**
         * 用于模拟收藏和未收藏  逻辑
         */
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isSelected) {  //未收藏
                    isSelected = true;
                    Toast.makeText(MainActivity.this, "我已经收藏了", Toast.LENGTH_SHORT).show();
                    mTextView.setText(getResources().getString(R.string.icon_like_selected));
                } else {
                    isSelected = false;
                    Toast.makeText(MainActivity.this, "我已经取消收藏了", Toast.LENGTH_SHORT).show();
                    mTextView.setText(getResources().getString(R.string.icon_like_normal));
                }
            }
        });
    }
}
