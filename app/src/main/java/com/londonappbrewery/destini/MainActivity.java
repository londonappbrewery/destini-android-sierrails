package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView story;
    public Button topButton;
    public Button lowButton;
    public int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story = findViewById(R.id.story);
        topButton = findViewById(R.id.topButton);
        lowButton = findViewById(R.id.lowButton);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2)
                {
                    story.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    lowButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if (mStoryIndex == 3)
                {
                    story.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                }
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        lowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1)
                {
                    story.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    lowButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if (mStoryIndex == 2)
                {
                    story.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                }
                else if (mStoryIndex == 3)
                {
                    story.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                }
            }
        });

    }
}
