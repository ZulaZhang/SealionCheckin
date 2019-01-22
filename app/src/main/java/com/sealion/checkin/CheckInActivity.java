package com.sealion.checkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CheckInActivity extends AppCompatActivity {

    private TextView editGoal;
    private ImageView check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
        editGoal = (TextView) findViewById(R.id.edit_goal);
        check = (ImageView)findViewById(R.id.check);
        editGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckInActivity.this, SetGoalActivity.class);
                startActivity(intent);
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(CheckInActivity.this, SetGoalActivity.class);
                startActivity(intent);
            }
        });
    }
}
