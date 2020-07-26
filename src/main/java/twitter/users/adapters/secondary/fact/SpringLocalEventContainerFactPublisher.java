package twitter.users.adapters.secondary.fact;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import twitter.users.domain.Fact;
import twitter.users.secondaryports.FactsPublisher;

@Component
public class SpringLocalEventContainerFactPublisher implements FactsPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public SpringLocalEventContainerFactPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void publish(Fact fact) {
        applicationEventPublisher.publishEvent(fact);
    }
}
