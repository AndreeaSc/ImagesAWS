package com.endava.awsimageupload.datastore;

import com.endava.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("22d3e4e5-9448-4eec-88fb-45aa88fdc353"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("d6e9dfd4-8d83-4daf-b16f-9b043d2396e6"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}