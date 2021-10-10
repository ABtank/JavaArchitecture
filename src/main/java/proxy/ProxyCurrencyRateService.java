package proxy;

import java.util.Currency;
import java.util.HashMap;

public class ProxyCurrencyRateService implements CurrencyRateService{
    // ссылка на реальный сервис
    private final CbrCurrencyRateService currencyRateService = new CbrCurrencyRateService();

    // кэш курсов
    private final HashMap<Currency, Money> rates = new HashMap<>();

    @Override
    public Money getCurrencyRate(Currency currency) {
        // если курс уже имеется в кэше, выдать из кэша
        if (rates.containsKey(currency)) {
            return rates.get(currency);
        }
        // если еще нет, то запросить реальный (долгий) сервис, получающий курс через интернет
        else {
            Money rate = currencyRateService.getCurrencyRate(currency);
            rates.put(currency, rate);
            return rate;
        }
    }
}