package twitter.users.secondaryports;

import twitter.users.domain.Fact;

public interface FactsPublisher {
    void publish(Fact fact);
}
