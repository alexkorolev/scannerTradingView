import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.Counters;
import utils.SendMessage;
import utils.TakePrices;
import static com.codeborne.selenide.Selenide.*;

public class ScannerTradingView {

@Tag("lesson")
@Test
    public void getMoney() {
        Configuration.browserSize = "1920x1280";
        Configuration.headless = false;

        Counters counters = new Counters();
        SendMessage signal = new SendMessage();
        signal.sendTelegram("Начинаю работу");

        int i = 60;
        while (0 < i && i <= 60) {

        open("https://ru.tradingview.com/symbols/XAUUSD/technicals/?exchange=FX");
            TakePrices.checkPrices(counters, signal, "GOLD");

        open("https://ru.tradingview.com/symbols/UKOIL/technicals/?exchange=FX");
            TakePrices.checkPrices(counters, signal, "BRENT");

        open("https://ru.tradingview.com/symbols/SILVER/technicals/?exchange=TVC");
            TakePrices.checkPrices(counters, signal, "SILVER");

        open("https://ru.tradingview.com/symbols/USDRUB/technicals/?exchange=FX_IDC");
            TakePrices.checkPrices(counters, signal, "DOLLAR");

        open("https://ru.tradingview.com/symbols/CNYRUB/technicals/?exchange=FX_IDC");
            TakePrices.checkPrices(counters, signal, "CNY");

        open("https://ru.tradingview.com/symbols/MOEX-RTSI/technicals/");
            TakePrices.checkPrices(counters, signal, "RTS");

        open("https://ru.tradingview.com/symbols/MOEX-IMOEX/technicals/");
            TakePrices.checkPrices(counters, signal, "MOEX");

        open("https://ru.tradingview.com/symbols/TVC-DXY/technicals/");
            TakePrices.checkPrices(counters, signal, "DXY");

        open("https://ru.tradingview.com/symbols/NASDAQ-QQQ/technicals/");
            TakePrices.checkPrices(counters, signal, "QQQ");

        System.out.println("Цикл номер: " + i);
        i--;
        sleep(60000);
        }
        signal.sendTelegram("Завершил работу!");
    }
}

