package ru.tinkoff.edu.java.scrapper.service.api;

import ru.tinkoff.edu.java.scrapper.model.entity.ChatEntity;
import ru.tinkoff.edu.java.scrapper.model.entity.LinkEntity;

import java.net.URI;
import java.util.List;

public interface SubscriptionService {
    LinkEntity subscribe(Long chatId, URI url);
    LinkEntity unsubscribe(Long chatId, URI url);
    List<LinkEntity> getChatSubscriptions(Long chatId);
    List<ChatEntity> getLinkSubscribers(Long linkId);
    default List<Long> getChatsIds(Long linkId) {
        return getLinkSubscribers(linkId)
                .stream()
                .map(ChatEntity::getId)
                .toList();
    }
}
