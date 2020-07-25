package twitter.users.domain;

import lombok.Value;

@Value
public class LastActivity {

    Tweet tweet;
    Tags usedTags;
}
