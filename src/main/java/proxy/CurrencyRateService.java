package proxy;

import java.util.Currency;

public interface CurrencyRateService {
    // получить курс валюты в рублях
    Money getCurrencyRate(Currency currency);
}
