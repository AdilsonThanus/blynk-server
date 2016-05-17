package cc.blynk.server.core.dao;

import cc.blynk.server.core.model.AppName;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 17.05.16.
 */
public class UserKey {

    public final String name;

    public final String appName;

    public UserKey(String name, String appName) {
        this.name = name;
        if (appName == null) {
            this.appName = AppName.BLYNK;
        } else {
            this.appName = appName;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserKey userKey = (UserKey) o;

        if (name != null ? !name.equals(userKey.name) : userKey.name != null) return false;
        return !(appName != null ? !appName.equals(userKey.appName) : userKey.appName != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        return result;
    }
}
