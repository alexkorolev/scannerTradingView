package utils;

public class ComparePrices extends Counters{

    public static void comparePrice (double price,String ticker,
                                     double priceEMA100H,double priceSMA100H,double priceEMA200H,double priceSMA200H,
                                     double priceEMA1004H,double priceSMA1004H,double priceEMA2004H,double priceSMA2004H,
                                     double RSI1M,double RSI5M,double RSI15M,double RSIH,double RSI4H,
                                     float stochRSIM, float stochRSI5M, float stochRSI15M, float stochRSIH, float stochRSI4H,
                                     Counters counters, SendMessage signal)
    {
        // Compare prices EMA100 or EMA200 H time
        if (counters.getCountEMAH(ticker) == 0) {
            if (priceEMA100H >= price && priceSMA100H <= price || priceEMA100H <= price && priceSMA100H >= price) {
                signal.sendTelegram("Check " + ticker + " price H1 near 100");
                counters.incrementEMAH(ticker);
            }

            if (priceEMA200H >= price & priceSMA200H <= price || priceEMA200H <= price & priceSMA200H >= price) {
                signal.sendTelegram("Check " + ticker + " price H1 near 200");
                counters.incrementEMAH(ticker);
            }
        }


        // Compare prices EMA100 or EMA200 4H time
        if (counters.getCountEMA4H(ticker) == 0) {
            if (priceEMA1004H >= price & priceSMA1004H <= price || priceEMA1004H <= price & priceSMA1004H >= price) {
                signal.sendTelegram("Check " + ticker + " price H4 near 100");
                counters.incrementEMA4H(ticker);
            }

            if (priceEMA2004H >= price & priceSMA200H <= price || priceEMA2004H <= price & priceSMA2004H >= price) {
                signal.sendTelegram("Check " + ticker + " price H4 near 200");
                counters.incrementEMA4H(ticker);
            }
        }

        //Check H Stoch RSI signals
        if (stochRSIH > 85 && stochRSI15M > 85 && stochRSI5M > 85) {
            if (counters.getLastMessageStochMain(ticker).equals("↑ ↑ ↑ ATTENTION ↑ ↑ ↑ \n" + "\t" + ticker + "\n STOCH RSI 1H OVERBOUGHT!!!")) {
            } else {
                signal.sendTelegram("↑ ↑ ↑ ATTENTION ↑ ↑ ↑ \n" + "\t" + ticker + "\n STOCH RSI 1H OVERBOUGHT!!!");
                counters.changeLastMessageStochMain(ticker, "↑ ↑ ↑ ATTENTION ↑ ↑ ↑ \n" + "\t" + ticker + "\n STOCH RSI 1H OVERBOUGHT!!!");
            }
        }

        if (stochRSIH < 18 && stochRSI15M < 18 && stochRSI5M < 18) {
            if (counters.getLastMessageStochMain(ticker).equals("↓ ↓ ↓ ATTENTION ↓ ↓ ↓ \n" + "\t" + ticker + "\n STOCH RSI 1H OVERSOLD!!!")) {
            } else {
                signal.sendTelegram("↓ ↓ ↓ ATTENTION ↓ ↓ ↓ \n" + "\t" + ticker + "\n STOCH RSI 1H OVERSOLD!!!");
                counters.changeLastMessageStochMain(ticker, "↓ ↓ ↓ ATTENTION ↓ ↓ ↓ \n" + "\t" + ticker + "\n STOCH RSI 1H OVERSOLD!!!");
            }
        }

        //Check 15M Stoch+RSI signals
        if (RSI5M > 65 && RSI15M > 65 && stochRSI5M > 90 && stochRSI15M > 90) {

            if (counters.getLastMessageRSI15M(ticker).equals("↑ ↑ ATTENTION ↑ ↑ \n" + "\t" + ticker + "\n RSI+stochRSI 15M OVERBOUGHT!!!"))
            { } else {
                signal.sendTelegram("↑ ↑ ATTENTION ↑ ↑ \n" + "\t" + ticker + "\n RSI+stochRSI 15M OVERBOUGHT!!!");
                counters.changeLastMessageRSI15M(ticker,"↑ ↑ ATTENTION ↑ ↑ \n" + "\t" + ticker + "\n RSI+stochRSI 15M OVERBOUGHT!!!");
            }
        }

        if (RSI5M < 35 && RSI15M < 35 && stochRSI5M < 10 && stochRSI15M < 10) {

            if (counters.getLastMessageRSI15M(ticker).equals("↓ ↓ ATTENTION ↓ ↓ \n" + "\t" + ticker + "\n RSI+stochRSI 15M OVERSOLD!!!")) {
            } else {
                signal.sendTelegram("↓ ↓ ATTENTION ↓ ↓ \n" + "\t" + ticker + "\n RSI+stochRSI 15M OVERSOLD!!!");
                counters.changeLastMessageRSI15M(ticker, "↓ ↓ ATTENTION ↓ ↓ \n" + "\t" + ticker + "\n RSI+stochRSI 15M OVERSOLD!!!");
            }
        }

        //Check H Stoch+RSI signals

        if (RSIH > 65 && RSI15M > 65 && stochRSIH > 90 && stochRSI15M > 90) {

            if (counters.getLastMessageRSIH(ticker).equals("↑ ↑ ↑ ATTENTION ↑ ↑ ↑ \n" + "\t" + ticker + "\n RSI+stochRSI 1H OVERBOUGHT!!!"))
            { } else {
                signal.sendTelegram("↑ ↑ ↑ ATTENTION ↑ ↑ ↑ \n" + "\t" + ticker + "\n RSI+stochRSI 1H OVERBOUGHT!!!");
                counters.changeLastMessageRSIH(ticker,"↑ ↑ ↑ ATTENTION ↑ ↑ ↑ \n" + "\t" + ticker + "\n RSI+stochRSI 1H OVERBOUGHT!!!");
            }
        }

        if (RSIH < 35 && RSI15M < 35 && stochRSIH < 10 && stochRSI15M < 10){

            if (counters.getLastMessageRSIH(ticker).equals("↓ ↓ ↓ ATTENTION ↓ ↓ ↓ \n" + "\t" + ticker + "\n RSI+stochRSI 1H OVERSOLD!!!"))
            { } else {
                signal.sendTelegram("↓ ↓ ↓ ATTENTION ↓ ↓ ↓ \n" + "\t" + ticker + "\n RSI+stochRSI 1H OVERSOLD!!!");
                counters.changeLastMessageRSIH(ticker,"↓ ↓ ↓ ATTENTION ↓ ↓ ↓ \n" + "\t" + ticker + "\n RSI+stochRSI 1H OVERSOLD!!!");
            }
        }
        if (counters.getNumCycle() >= 324)
        {
            counters.changeLastMessageRSI15M(ticker, "New");
            counters.changeLastMessageRSIH(ticker,"New");
            counters.changeLastMessageStochMain(ticker,"New");

            counters.resetNumCycle();
        }

        counters.incrementNumCycle();
        System.out.println("Цикл номер(ТЕСТ): " + Counters.getNumCycle());
    }
}
