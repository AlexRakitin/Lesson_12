import java.util.Random;


public class NotebookService {
    private static String contract = "contract";
    private static String docnum = "docnum";
    private static String anyArray = "";

    public static String getContract() {
        return contract;
    }

    public static String getDocnum() {
        return docnum;
    }

    public static String getAnyArray() {
        return anyArray;
    }

    public static void printData(String str) {
        System.out.println(str);
    }

    public static char randomNameText() {
        Random randomTextLetter = new Random();
        String eng = "abcdefghijklmnopqrstuvwxyz";
        String dig = "0123456789";
        String sum = eng + eng.toLowerCase() +
                dig;
        char charAt = sum.charAt(randomTextLetter.nextInt(sum.length()));
        return charAt;
    }

    public static String fullNameOfString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] abc = str.toCharArray();
        for (int i = str.length(); i < 15; i++) {
            stringBuilder.append(randomNameText());
        }
        printData(str + stringBuilder);
        return str + stringBuilder.toString();
    }
}
