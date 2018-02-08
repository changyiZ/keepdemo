package com.gotokeep.social;

import android.util.Log;

import com.gotokeep.socialapi.ISocialService;

/**
 * Description:
 *
 * @author Changyi Zhang
 * @version 1.0
 */

public class SocialService implements ISocialService {

    @Override
    public void postEntry(String title, String content) {
        Log.d("SocialService", "Post a entry: " + title + " | " + content);
    }
}
