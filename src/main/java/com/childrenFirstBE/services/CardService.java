package com.childrenFirstBE.services;

import com.childrenFirstBE.repositories.CardRepository;
import com.childrenFirstBE.models.Card;
import org.springframework.stereotype.Service;


@Service

public class CardService {
    private final CardRepository cardRepository;
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card create(Card model) {
        return cardRepository.save(model);
    }

}
