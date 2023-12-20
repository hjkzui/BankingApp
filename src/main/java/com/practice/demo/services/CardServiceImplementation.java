package com.practice.demo.services;
import com.practice.demo.models.Card;
import com.practice.demo.repositories.CardRepository;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImplementation implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImplementation(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card saveCard(Card card) {
        return  cardRepository.save(card);
    }
}
