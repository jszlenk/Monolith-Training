package twitter.users.primaryports;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class UpdateProfileCommand {

    String firstName;
    String id;
}
