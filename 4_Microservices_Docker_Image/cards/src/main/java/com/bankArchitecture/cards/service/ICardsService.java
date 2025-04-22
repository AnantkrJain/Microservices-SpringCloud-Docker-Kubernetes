package com.bankArchitecture.cards.service;

import com.bankArchitecture.cards.dto.CardsDto;

public interface ICardsService {

    void createCard(String mobileNumber);

    CardsDto fetchCardDetails(String mobileNumber);

    boolean updateCardDetails(CardsDto cardsDto);

    boolean deleteCard(String mobileNumber);
}
