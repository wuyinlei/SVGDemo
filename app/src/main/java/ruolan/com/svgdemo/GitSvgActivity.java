package ruolan.com.svgdemo;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.mikepenz.iconics.Iconics;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.context.IconicsLayoutInflater;
import com.mikepenz.ionicons_typeface_library.Ionicons;

public class GitSvgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconicsLayoutInflater(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_svg);

        Drawable drawable = new IconicsDrawable(this)
                .icon(Ionicons.Icon.ion_android_cart)
                .color(Color.RED)
                .sizeDp(40);
        ((ImageView)this.findViewById(R.id.image)).setImageDrawable(drawable);
    }
}
