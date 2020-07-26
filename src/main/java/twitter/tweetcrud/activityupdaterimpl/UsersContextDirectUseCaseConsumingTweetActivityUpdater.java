package twitter.tweetcrud.activityupdaterimpl;

import twitter.tweetcrud.Tweet;
import twitter.tweetcrud.TweetActivityUpdater;
import twitter.users.domain.LastActivity;
import twitter.users.domain.Tags;
import twitter.users.primaryports.UpdateUserProfileUseCase;

import java.time.Instant;

public class UsersContextDirectUseCaseConsumingTweetActivityUpdater implements TweetActivityUpdater {

    private final UpdateUserProfileUseCase updateUserProfileUseCase;

    public UsersContextDirectUseCaseConsumingTweetActivityUpdater(UpdateUserProfileUseCase updateUserProfileUseCase) {
        this.updateUserProfileUseCase = updateUserProfileUseCase;
    }

    @Override
    public void updateTweetActivityForUser(String userId, Tweet tweet) {
        updateUserProfileUseCase.updateLastActivity(new LastActivity(
                new twitter.users.domain.Tweet(Instant.now(), "Title: " + tweet.getMsg()), new Tags()));
    }
}
