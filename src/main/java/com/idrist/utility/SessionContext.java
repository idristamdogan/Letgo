package com.idrist.utility;

import com.idrist.entity.User;

public class SessionContext {

    private static User loggedInUser;

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(User loggedInUser) {
        SessionContext.loggedInUser = loggedInUser;
    }
}
