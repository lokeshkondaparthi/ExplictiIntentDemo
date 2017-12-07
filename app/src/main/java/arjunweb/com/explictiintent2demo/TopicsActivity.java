package arjunweb.com.explictiintent2demo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TopicsActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtIntent,mBtHW,mBtSpinners,mBtProgressBar,mBtServices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        mBtIntent = findViewById(R.id.topics_intent_bt);
        mBtIntent.setOnClickListener(this);
        mBtHW = findViewById(R.id.topics_hw_bt);
        mBtHW.setOnClickListener(this);
        mBtSpinners= findViewById(R.id.topics_spinner_bt);
        mBtSpinners.setOnClickListener(this);
        mBtProgressBar = findViewById(R.id.topics_pb_bt);
        mBtProgressBar.setOnClickListener(this);
        mBtServices = findViewById(R.id.topics_services_bt);
        mBtServices.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent mResultBackIntent  = new Intent();
        switch (view.getId()) {
            case R.id.topics_intent_bt:             //  intent
                mResultBackIntent.putExtra("topic_key", "Intent");
                setResult(Activity.RESULT_OK, mResultBackIntent);
                finish();
                break;
            case R.id.topics_hw_bt:                 // HW
                mResultBackIntent.putExtra("topic_key", "Hello world");
                setResult(Activity.RESULT_OK, mResultBackIntent);
                finish();
                break;
            case R.id.topics_spinner_bt:
                mResultBackIntent.putExtra("topic_key", "Spinner");
                setResult(Activity.RESULT_OK, mResultBackIntent);
                finish();
                break;
            case R.id.topics_pb_bt:
                mResultBackIntent.putExtra("topic_key", "Progress bar");
                setResult(Activity.RESULT_OK, mResultBackIntent);
                finish();
                break;
            case R.id.topics_services_bt:
                mResultBackIntent.putExtra("topic_key", "Progress bar");
                mResultBackIntent.putExtra("topic_index", 5);
                setResult(Activity.RESULT_OK, mResultBackIntent);
                finish();
                break;

        }
    }
}
