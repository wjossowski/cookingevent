package it.avanscoperta.cookingevent.user.builders;

import it.avanscoperta.cookingevent.user.domain.User;
import it.avanscoperta.cookingevent.user.domain.UserId;

public class UserBuilder {
    UserId userId = UserId.generate();


    public User build() {
        return new User(userId);
    }
}
