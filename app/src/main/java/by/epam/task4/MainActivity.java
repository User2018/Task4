package by.epam.task4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements  View.OnLongClickListener {


    TextView textView ;
    int click=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView)findViewById(R.id.textView);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);

        Picasso.with(this)
                .load("https://java.sogeti.nl/JavaBlog/wp-content/uploads/2009/04/android_icon_256.png")
                .into(imageButton);
        imageButton.setOnLongClickListener(this);

    }

    @Override
    public boolean onLongClick(View v) {
        if (click==3){
            RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params3.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            textView.setLayoutParams(params3);
            click=-1;
        }

        if (click==2){
            RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            params2.addRule(RelativeLayout.ALIGN_LEFT);
            textView.setLayoutParams(params2);
        }

        if (click==1){
            RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params1.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            params1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            textView.setLayoutParams(params1);
        }
        if (click==0){
            RelativeLayout.LayoutParams params0 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params0.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            textView.setLayoutParams(params0);
        }
        click++;
        return false;
    }

}


/*
 x = (int) (4 * Math.random());
        if (x == 0) {
            RelativeLayout.LayoutParams params0 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params0.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            textView.setLayoutParams(params0);
        }

        if (x == 1) {
            RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params1.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            textView.setLayoutParams(params1);

        }
        if (x == 2) {
            RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            params2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            textView.setLayoutParams(params2);

        }
        if (x == 3) {
            RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params3.addRule(RelativeLayout.ALIGN_BOTTOM);
            textView.setLayoutParams(params3);


        }

*/






