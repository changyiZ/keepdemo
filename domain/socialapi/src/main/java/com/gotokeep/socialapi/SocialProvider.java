package com.gotokeep.socialapi;

import com.gotokeep.common.Provider;
import com.gotokeep.social.SocialService;

/**
 * Description:
 *
 * @author Changyi Zhang
 * @version 1.0
 */

public class SocialProvider implements Provider<ISocialService> {

    @Override
    public ISocialService get() {
        return new SocialService();
    }
}
