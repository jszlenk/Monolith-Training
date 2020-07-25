package twitter.suggestions;

import twitter.followers.Followers;
import twitter.followers.FollowersService;
import twitter.tweetcrud.Tweet;
import twitter.tweetcrud.TweetCrudService;

import java.util.Collection;

public class SuggestionService {

    private final FollowersService followersService;
    private final TweetCrudService tweetCrudService;

    public SuggestionService(FollowersService followersService, TweetCrudService tweetCrudService) {
        this.followersService = followersService;
        this.tweetCrudService = tweetCrudService;
    }

    public Suggestions suggestionsFor(String userId) {
        Followers followers = followersService.followersOf(userId);
        Suggestions suggestions = new Suggestions();
        followers.forEach(follower -> {
            Collection<Tweet> tweets = tweetCrudService.findRecentTweetsOf(follower.getId());
            suggestions.addTweets(tweets);
        });
        return suggestions;
    }
}
