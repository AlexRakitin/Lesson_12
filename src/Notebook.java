public class Notebook {

    public static String[] countOfRepeat(int count, String str) {
        String [] aString = new String[count];
        for (int i = 0; i < count; i++) {

            aString[i] = NotebookService.fullNameOfString(str);
        }
        return aString;
    }
}
