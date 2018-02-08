package com.gotokeep.training;

import android.util.Log;

import com.gotokeep.socialapi.Social;

/**
 * Description:
 *
 * @author Changyi Zhang
 * @version 1.0
 */

public class TrainingService {

    public void start(boolean share) {
        Log.d("TrainingService", "Start training...");
        if (share) {
            Social.getService().postEntry("Training", "It feels good!");
        }
    }
}
