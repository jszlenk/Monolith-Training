package twitter.users.domain;

import lombok.Value;

import java.time.Instant;

@Value
public class Tweet {
    Instant timestamp;
    String tweetTitle;
}
