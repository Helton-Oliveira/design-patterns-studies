package com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code;

import com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code.dto.ShoppingCartRequest;

public class ValidateShoppingCart {

   public void execute(ShoppingCartRequest request) {

       var validateItemAvailability = new ValidateItemAvailability();
       var validateDeliveryPossibility = new ValidateDeliveryPossibility();
       var validateCreditCard = new ValidateCreditCard();

        var baseValidator = new BaseValidator();
        baseValidator.setNext(validateItemAvailability);
        validateItemAvailability.setNext(validateDeliveryPossibility);
        validateDeliveryPossibility.setNext(validateCreditCard);

        baseValidator.valid(request);
    }
}
