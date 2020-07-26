package twitter.users.secondaryports;

import twitter.users.domain.UserProfile;

import java.util.Optional;

public interface UserDb {
    void save(UserProfile profile);
    Optional<UserProfile> findById(String userId);
}
