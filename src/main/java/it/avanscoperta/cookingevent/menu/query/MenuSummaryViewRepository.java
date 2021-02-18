package it.avanscoperta.cookingevent.menu.query;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuSummaryViewRepository
extends MongoRepository<MenuSummaryView, String> {
}
