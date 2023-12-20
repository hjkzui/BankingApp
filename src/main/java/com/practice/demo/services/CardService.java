package com.practice.demo.services;

import com.practice.demo.models.Card;
import org.springframework.stereotype.Service;

@Service
public interface CardService {
    public Card saveCard(Card card);
}
