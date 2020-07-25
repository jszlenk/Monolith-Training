package twitter.users.domain;

import lombok.Value;

import java.time.Instant;

@Value
public class UserProfileUpdated implements Fact {

    Instant timestamp;
    UserProfile updatedProfile;

    @Override
    public Instant timestamp() {
        return timestamp;
    }
}
