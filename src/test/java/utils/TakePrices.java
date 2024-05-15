package utils;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class TakePrices {
    public static void checkPrices(Counters counters, SendMessage signal, String ticker) {
        double price;
        String name = ticker;
        double priceSMA100H;
        double priceEMA100H;
        double priceSMA200H;
        double priceEMA200H;

        double priceSMA1004H;
        double priceEMA1004H;
        double priceSMA2004H;
        double priceEMA2004H;

        double RSI4H;
        double RSIH;
        double RSI15M;
        double RSI5M;
        double RSI1M;

        float stochRSI4H;
        float stochRSIH;
        float stochRSI15M;
        float stochRSI5M;
        float stochRSI1M;

        String s = "0.000";

        $x("//*[contains(@class,'tab-content')]//*[contains(text(),'4 часа')]").click();
        sleep(1000);
        priceSMA1004H = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[2]//tr[11]/td[2]").getText());
        priceEMA1004H = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[2]//tr[10]/td[2]").getText());
        priceSMA2004H = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[2]//tr[13]/td[2]").getText());
        priceEMA2004H = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[2]//tr[12]/td[2]").getText());
        RSI4H = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[2]/td[2]").getText());
        stochRSI4H = Float.parseFloat($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[9]/td[2]").getText().replace("−", ""));


        $x("//*[contains(@class,'tab-content')]//*[contains(text(),'1 час')]").click();
        sleep(1000);
        priceSMA100H = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[2]//tr[11]/td[2]").getText());
        priceEMA100H = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[2]//tr[10]/td[2]").getText());
        priceSMA200H = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[2]//tr[13]/td[2]").getText());
        priceEMA200H = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[2]//tr[12]/td[2]").getText());
        RSIH = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[2]/td[2]").getText());
        stochRSIH = Float.parseFloat($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[9]/td[2]").getText().replace("−", ""));


        $x("//*[contains(@class,'tab-content')]//*[contains(text(),'15 минут')]").click();
        sleep(1000);
        RSI15M = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[2]/td[2]").getText());
        stochRSI15M = Float.parseFloat($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[9]/td[2]").getText().replace("−", ""));

        $x("//*[contains(@class,'tab-content')]//*[contains(text(),'5 минут')]").click();
        sleep(1000);
        price = Double.parseDouble($x("//div[@class='js-symbol-header-ticker quote-ticker-inited']//div[contains(@class,'last')]//span[contains(@class, 'last')]").getText());
        RSI5M = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[2]/td[2]").getText());
        stochRSI5M = Float.parseFloat($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[9]/td[2]").getText().replace("−", ""));

        $x("//*[contains(@class,'tab-content')]//*[contains(text(),'1 минут')]").click();
        sleep(1000);
        RSI1M = Double.parseDouble($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[2]/td[2]").getText());
        stochRSI1M = Float.parseFloat($x("//div[contains(@class,'tablesWrapper')]/div[1]//tr[9]/td[2]").getText().replace("−", ""));

        ComparePrices.comparePrice(price, ticker,
                priceEMA100H, priceSMA100H, priceEMA200H, priceSMA200H,
                priceEMA1004H, priceSMA1004H, priceEMA2004H, priceSMA2004H,
                RSI1M, RSI5M, RSI15M, RSIH, RSI4H,
                stochRSI1M, stochRSI5M, stochRSI15M, stochRSIH, stochRSI4H,
                counters, signal);
    }
}
