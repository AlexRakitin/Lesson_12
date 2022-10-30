import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        // Колличество строк "Contract"
        String[] stringsContract = NotebookCycle.countOfRepeat(2, NotebookService.getContract());
        // Колличество строк "Docnum"
        String[] stringsDocnum = NotebookCycle.countOfRepeat(3, NotebookService.getDocnum());
        // Колличество строк "AnyArray"
        String[] stringsAnyArray = NotebookCycle.countOfRepeat(4, NotebookService.getAnyArray());

        // Запись файлов в Lesson_12.txt
        try (FileWriter writer = new FileWriter("C:\\Users\\user\\Desktop\\JAVA_19_09\\Lesson_12\\Lesson_12.txt", false)) {

            writer.write(NotebookCycle.writeOut(stringsContract));
            writer.write(NotebookCycle.writeOut(stringsDocnum));
            writer.write(NotebookCycle.writeOut(stringsAnyArray));
        }

        // Считывание файлов из Lesson_12.txt
        Path writeOut = Paths.get("C:\\Users\\user\\Desktop\\JAVA_19_09\\Lesson_12\\Lesson_12.txt");
        if (!Files.exists(writeOut)) {
            Path writeOutAdd = Files.createFile(writeOut);
        }
        List<String> getMassiveAllWriteOut = Files.readAllLines(writeOut);
        System.out.println(getMassiveAllWriteOut);

        // Запись файлов "contract"
        Path writeOutContract = Paths.get("C:\\Users\\user\\Desktop\\JAVA_19_09\\Lesson_12\\Contract.txt");
        Files.writeString(writeOutContract, "");
        getMassiveAllWriteOut.stream().filter(s -> s.startsWith("contract")).forEach(s -> {
            try {
                Files.writeString(writeOutContract, s + "\n", StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        // Запись файлов "docnum"
        Path writeOutDocnum = Paths.get("C:\\Users\\user\\Desktop\\JAVA_19_09\\Lesson_12\\Docnum.txt");
        Files.writeString(writeOutDocnum, "");
        getMassiveAllWriteOut.stream().filter(s -> s.startsWith("docnum")).forEach(s -> {
            try {
                Files.writeString(writeOutDocnum, s + "\n", StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        // Запись файлов которые содержат остальные строки
        Path writeOutAnyArray = Paths.get("C:\\Users\\user\\Desktop\\JAVA_19_09\\Lesson_12\\AnyArray.txt");
        Files.writeString(writeOutAnyArray, "");
        getMassiveAllWriteOut.stream().filter(s -> !s.startsWith("docnum")).filter(s -> !s.startsWith("contract")).forEach(s -> {
            try {
                Files.writeString(writeOutAnyArray, s + "\n", StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}



