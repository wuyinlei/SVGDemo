package ruolan.com.svgdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }


    public void svgTest(View view){
        startActivity(new Intent(this,SvgActivity.class));
    }

    public void gitSvgTest(View view){
        startActivity(new Intent(this,GitSvgActivity.class));
    }
}
