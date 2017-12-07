package arjunweb.com.explictiintent2demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtTopic;
    private TextView mTVResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtTopic = findViewById(R.id.main_topic_bt);
        mBtTopic.setOnClickListener(this);
        mTVResult = findViewById(R.id.main_result_tv);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_topic_bt:                    // Button
                Intent  mGetTopicResultIntent  = new Intent(MainActivity.this,TopicsActivity.class);
                startActivityForResult(mGetTopicResultIntent,10);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
     /*   Toast.makeText(this, "OnAcivity Executed.", Toast.LENGTH_SHORT).show();*/
        if (data != null) {
            int mTopicIndex=0;
            if(data.hasExtra("topic_index"))
                mTopicIndex =  data.getIntExtra("topic_index",0);
       String mTopicName =   data.getStringExtra("topic_key");
            mTVResult.setText("Topic index :"+mTopicIndex+ " "+"Topic Name :"+mTopicName);
        }
    }
}
