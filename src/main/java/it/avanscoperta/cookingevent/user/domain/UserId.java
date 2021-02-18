package it.avanscoperta.cookingevent.user.domain;

import java.util.UUID;

public class UserId {
    private final String id;

    public UserId(String id) {
        this.id = id;
    }

    public static UserId generate() {
        return new UserId(UUID.randomUUID().toString());
    }
}
