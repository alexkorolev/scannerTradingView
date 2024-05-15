package utils;

public class Counters {

    private static int numCycle;

    private static String lastMessageGoldH;
    private static String lastMessageBrentH;
    private static String lastMessageSilverH;
    private static String lastMessageUSDH;
    private static String lastMessageCNYH;
    private static String lastMessageDXYH;
    private static String lastMessageQQQH;
    private static String lastMessageIMOEXH;
    private static String lastMessageRTSH;

    private static String lastMessageGold15M;
    private static String lastMessageBrent15M;
    private static String lastMessageSilver15M;
    private static String lastMessageUSD15M;
    private static String lastMessageCNY15M;
    private static String lastMessageDXY15M;
    private static String lastMessageQQQ15M;
    private static String lastMessageIMOEX15M;
    private static String lastMessageRTS15M;

    private static String lastMessageStochGoldH;
    private static String lastMessageStochBrentH;
    private static String lastMessageStochSilverH;
    private static String lastMessageStochUSDH;
    private static String lastMessageStochCNYH;
    private static String lastMessageStochDXYH;
    private static String lastMessageStochQQQH;
    private static String lastMessageStochIMOEXH;
    private static String lastMessageStochRTSH;

    private static int countGOLDH;
    private static int countGOLD4H;
    private static int countBRENTH;
    private static int countBRENT4H;
    private static int countSILVERH;
    private static int countSILVER4H;
    private static int countUSDH;
    private static int countUSD4H;
    private static int countCNYH;
    private static int countCNY4H;
    private static int countDXYH;
    private static int countDXY4H;
    private static int countRTSH;
    private static int countRTS4H;
    private static int countMOEXH;
    private static int countMOEX4H;
    private static int countQQQH;
    private static int countQQQ4H;


        public Counters() {

            numCycle = 0;

            lastMessageStochGoldH = "text";
            lastMessageStochBrentH = "test";
            lastMessageStochSilverH = "test";
            lastMessageStochUSDH = "test";
            lastMessageStochCNYH = "test";
            lastMessageStochDXYH = "test";
            lastMessageStochQQQH = "test";
            lastMessageStochIMOEXH = "test";
            lastMessageStochRTSH = "test";

            lastMessageGold15M = "test";
            lastMessageBrent15M = "test";
            lastMessageSilver15M = "test";
            lastMessageUSD15M = "test";
            lastMessageCNY15M = "test";
            lastMessageDXY15M = "test";
            lastMessageQQQ15M = "test";
            lastMessageIMOEX15M = "test";
            lastMessageRTS15M = "test";

            lastMessageGoldH = "test";
            lastMessageBrentH = "test";
            lastMessageSilverH = "test";
            lastMessageUSDH = "test";
            lastMessageCNYH = "test";
            lastMessageDXYH = "test";
            lastMessageQQQH = "test";
            lastMessageIMOEXH = "test";
            lastMessageRTSH = "test";


            countGOLDH = 0;
            countBRENTH = 0;
            countSILVERH = 0;
            countUSDH = 0;
            countCNYH = 0;
            countDXYH = 0;
            countRTSH = 0;
            countMOEXH = 0;
            countQQQH = 0;

            countGOLD4H = 0;
            countBRENT4H = 0;
            countSILVER4H = 0;
            countUSD4H = 0;
            countCNY4H = 0;
            countDXY4H = 0;
            countRTS4H = 0;
            countMOEX4H = 0;
            countQQQ4H = 0;

        }

    public static int getNumCycle() {return numCycle; }
    public static void incrementNumCycle() {
        numCycle++;
    }
    public static void resetNumCycle() {
        numCycle = 0;
    }

    //Methods for EMA 1H
    public static int getCountEMAH(String ticker) {
        if (ticker == "GOLD"){
            return countGOLDH;
        } else if (ticker == "BRENT"){
            return countBRENTH;
        }else if (ticker == "SILVER"){
            return countSILVERH;
        }else if (ticker == "DOLLAR"){
            return countUSDH;
        }else if (ticker == "CNY"){
            return countCNYH;
        }else if (ticker == "DXY"){
            return countDXYH;
        }else if (ticker == "RTS"){
            return countRTSH;
        }else if (ticker == "QQQ"){
            return countQQQH;
        }else if (ticker == "MOEX"){
            return countMOEXH;
        }
        return 0;
    }

    public static void incrementEMAH(String ticker) {
        if (ticker == "GOLD"){
            countGOLDH++;
        } else if (ticker == "BRENT"){
             countBRENTH++;
        }else if (ticker == "SILVER"){
             countSILVERH++;
        }else if (ticker == "DOLLAR"){
             countUSDH++;
        }else if (ticker == "CNY"){
             countCNYH++;
        }else if (ticker == "DXY"){
             countDXYH++;
        }else if (ticker == "RTS"){
             countRTSH++;
        }else if (ticker == "QQQ"){
             countQQQH++;
        }else if (ticker == "MOEX"){
             countMOEXH++;
        }
    }

    //Methods for EMA 4H
    public static int getCountEMA4H(String ticker) {
        if (ticker == "GOLD"){
            return countGOLD4H;
        } else if (ticker == "BRENT"){
            return countBRENT4H;
        }else if (ticker == "SILVER"){
            return countSILVER4H;
        }else if (ticker == "DOLLAR"){
            return countUSD4H;
        }else if (ticker == "CNY"){
            return countCNY4H;
        }else if (ticker == "DXY"){
            return countDXY4H;
        }else if (ticker == "RTS"){
            return countRTS4H;
        }else if (ticker == "QQQ"){
            return countQQQ4H;
        }else if (ticker == "MOEX"){
            return countMOEX4H;
        }
        return 0;
    }

    public static void incrementEMA4H(String ticker) {
        if (ticker == "GOLD"){
            countGOLD4H++;
        } else if (ticker == "BRENT"){
            countBRENT4H++;
        }else if (ticker == "SILVER"){
            countSILVER4H++;
        }else if (ticker == "DOLLAR"){
            countUSD4H++;
        }else if (ticker == "CNY"){
            countCNY4H++;
        }else if (ticker == "DXY"){
            countDXY4H++;
        }else if (ticker == "RTS"){
            countRTS4H++;
        }else if (ticker == "QQQ"){
            countQQQ4H++;
        }else if (ticker == "MOEX"){
            countMOEX4H++;
        }
    }

    //Methods for Stoch 1H
    public static String getLastMessageStochMain(String ticker) {

            if (ticker == "GOLD"){
                return lastMessageStochGoldH;
            } else if (ticker == "BRENT"){
            return lastMessageStochBrentH;
            }else if (ticker == "SILVER"){
                return lastMessageStochSilverH;
            }else if (ticker == "DOLLAR"){
                return lastMessageStochUSDH;
            }else if (ticker == "CNY"){
                return lastMessageStochCNYH;
            }else if (ticker == "DXY"){
                return lastMessageStochDXYH;
            }else if (ticker == "RTS"){
                return lastMessageStochRTSH;
            }else if (ticker == "QQQ"){
                return lastMessageStochQQQH;
            }else if (ticker == "MOEX"){
                return lastMessageStochIMOEXH;
            }
        return "nothing";
        }

    public static void changeLastMessageStochMain(String ticker, String text) {
        if (ticker == "GOLD"){
            lastMessageStochGoldH = text;
        } else if (ticker == "BRENT"){
             lastMessageStochBrentH = text;
        }else if (ticker == "SILVER"){
             lastMessageStochSilverH = text;
        }else if (ticker == "DOLLAR"){
             lastMessageStochUSDH = text;
        }else if (ticker == "CNY"){
             lastMessageStochCNYH = text;
        }else if (ticker == "DXY"){
             lastMessageStochDXYH = text;
        }else if (ticker == "RTS"){
             lastMessageStochRTSH = text;
        }else if (ticker == "QQQ"){
             lastMessageStochQQQH = text;
        }else if (ticker == "MOEX"){
             lastMessageStochIMOEXH = text;
        }

        }

    public static String getLastMessageRSI15M(String ticker) {

        if (ticker == "GOLD"){
            return lastMessageGold15M;
        } else if (ticker == "BRENT"){
            return lastMessageBrent15M;
        }else if (ticker == "SILVER"){
            return lastMessageSilver15M;
        }else if (ticker == "DOLLAR"){
            return lastMessageUSD15M;
        }else if (ticker == "CNY"){
            return lastMessageCNY15M;
        }else if (ticker == "DXY"){
            return lastMessageDXY15M;
        }else if (ticker == "RTS"){
            return lastMessageRTS15M;
        }else if (ticker == "QQQ"){
            return lastMessageQQQ15M;
        }else if (ticker == "MOEX"){
            return lastMessageIMOEX15M;
        }
        return "nothing";
    }

    public static void changeLastMessageRSI15M(String ticker, String text) {
        if (ticker == "GOLD"){
            lastMessageGold15M = text;
        } else if (ticker == "BRENT"){
            lastMessageBrent15M = text;
        }else if (ticker == "SILVER"){
            lastMessageSilver15M = text;
        }else if (ticker == "DOLLAR"){
            lastMessageUSD15M = text;
        }else if (ticker == "CNY"){
            lastMessageCNY15M = text;
        }else if (ticker == "DXY"){
            lastMessageDXY15M = text;
        }else if (ticker == "RTS"){
            lastMessageRTS15M = text;
        }else if (ticker == "QQQ"){
            lastMessageQQQ15M = text;
        }else if (ticker == "MOEX"){
            lastMessageIMOEX15M = text;
        }

    }

    public static String getLastMessageRSIH(String ticker) {

        if (ticker == "GOLD"){
            return lastMessageGoldH;
        } else if (ticker == "BRENT"){
            return lastMessageBrentH;
        }else if (ticker == "SILVER"){
            return lastMessageSilverH;
        }else if (ticker == "DOLLAR"){
            return lastMessageUSDH;
        }else if (ticker == "CNY"){
            return lastMessageCNYH;
        }else if (ticker == "DXY"){
            return lastMessageDXYH;
        }else if (ticker == "RTS"){
            return lastMessageRTSH;
        }else if (ticker == "QQQ"){
            return lastMessageQQQH;
        }else if (ticker == "MOEX"){
            return lastMessageIMOEXH;
        }
        return "nothing";
    }

    public static void changeLastMessageRSIH(String ticker, String text) {
        if (ticker == "GOLD"){
            lastMessageGoldH = text;
        } else if (ticker == "BRENT"){
            lastMessageBrentH = text;
        }else if (ticker == "SILVER"){
            lastMessageSilverH = text;
        }else if (ticker == "DOLLAR"){
            lastMessageUSDH = text;
        }else if (ticker == "CNY"){
            lastMessageCNYH = text;
        }else if (ticker == "DXY"){
            lastMessageDXYH = text;
        }else if (ticker == "RTS"){
            lastMessageRTSH = text;
        }else if (ticker == "QQQ"){
            lastMessageQQQH = text;
        }else if (ticker == "MOEX"){
            lastMessageIMOEXH = text;
        }

    }

}
