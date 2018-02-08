package com.gotokeep.socialui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gotokeep.training.TrainingService;

/**
 * Description:
 *
 * @author Changyi Zhang
 * @version 1.0
 */

public class PostingEntryActivity extends AppCompatActivity {

    public static void launch(Context context) {
        context.startActivity(new Intent(context, PostingEntryActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = new Button(this);
        button.setGravity(Gravity.CENTER);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TrainingService trainingService = new TrainingService();
                trainingService.start(true);
            }
        });
        button.setText("Start training!");
        setContentView(button);
        button.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
        button.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
    }
}
