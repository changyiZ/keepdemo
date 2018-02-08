package com.gotokeep.socialapi;

import com.gotokeep.common.Provider;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author Changyi Zhang
 * @version 1.0
 */

public class Social {

    private static final Map<String, Provider> serviceMap = new HashMap<>();

    static {
        serviceMap.put(ISocialService.class.getSimpleName(), new SocialProvider());
    }

    public static ISocialService getService() {
        return (ISocialService) serviceMap.get("ISocialService").get();
    }
}