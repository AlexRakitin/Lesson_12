public class NotebookCycle {

    public static String[] countOfRepeat(int count, String str) {
        String [] aString = new String[count];
        for (int i = 0; i < count; i++) {

            aString[i] = NotebookService.fullNameOfString(str);
        }
        return aString;
    }
    public static String writeOut(String[] str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            String elem =str[i];
            stringBuilder.append(elem).append("\n");
        }
        return stringBuilder.toString();
    }
}



