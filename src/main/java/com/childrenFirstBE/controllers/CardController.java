package com.childrenFirstBE.controllers;

import com.childrenFirstBE.services.CardService;
import com.childrenFirstBE.models.Card;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/card")

public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @CrossOrigin
    @PostMapping
    public Card createCard(@RequestBody Card card) {
        return cardService.create(card);
    }
}
