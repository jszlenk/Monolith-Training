package twitter.tweetcrud;

import java.util.Collection;

public interface TweetsRepository {

    void save(Tweet tweet);

    Collection<Tweet> findAll();
}
