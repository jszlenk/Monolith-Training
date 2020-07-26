package twitter.users.adapters.primary.rabbitmq;

import twitter.users.primaryports.UpdateUserProfileUseCase;

public class RabbitEventListener {

    private final UpdateUserProfileUseCase userOperations;

    public RabbitEventListener(UpdateUserProfileUseCase userOperations) {
        this.userOperations = userOperations;
    }

    public void updateProfile() {
        throw new UnsupportedOperationException();
    }
}
