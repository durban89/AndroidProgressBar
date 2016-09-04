package com.gowhich.androidprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ProgressBar progressBar;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //如何设置窗口有刻度的效果
        requestWindowFeature(Window.FEATURE_PROGRESS);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        setContentView(R.layout.activity_main);

        button1 = (Button) this.findViewById(R.id.button1);
        button2 = (Button) this.findViewById(R.id.button2);
        progressBar = (ProgressBar) this.findViewById(R.id.progressBar);

        setProgressBarVisibility(true);
        setProgressBarIndeterminate(true);
        setProgress(350);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                progressBar.setProgress((int) (progressBar.getProgress() * 1.2));
                progressBar.setSecondaryProgress((int) (progressBar.getProgress() * 1.2));
                break;
            case R.id.button2:
                progressBar.setProgress((int) (progressBar.getProgress() * 0.8));
                progressBar.setSecondaryProgress((int) (progressBar.getProgress() * 0.8));
                break;
        }
    }
}
