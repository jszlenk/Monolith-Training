package twitter.tweetcrud;

import java.util.Collection;

public class TweetCrudService {

    private TweetsRepository repository;
    private TweetActivityUpdater tweetActivityUpdater;

    public void postTweet(CreateTweetCommand command, String author) {
        repository.save(new Tweet(command.getMsg(), author));
    }

    public Collection<Tweet> findAllTweets() {
        return repository.findAll();
    }

    public Collection<Tweet> findRecentTweetsOf(String userId) {
        return null;
    }

    public void updateUserProfileBecauseOfNewTweet(CreateTweetCommand command, String author) {
        tweetActivityUpdater.updateTweetActivityForUser(author, new Tweet(command.getMsg(), author));
    }
}
