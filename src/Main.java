import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path writeOut = Paths.get("C:\\Users\\user\\Desktop\\JAVA_19_09\\File\\Lesson_12\\Lesson_12.txt");
        if (!Files.exists(writeOut)) {
            Path writeOutAdd = Files.createFile(writeOut);
        }
        // Колличество строк "Contract"
        String[] strings = Notebook.countOfRepeat(2, NotebookService.getContract());

// Колличество строк "Docnum"
        Notebook.countOfRepeat(3, NotebookService.getDocnum());
// Колличество строк "AnyArray"
        Notebook.countOfRepeat(4, NotebookService.getAnyArray());


//        Path writeOut = Paths.get("C:\\Users\\user\\Desktop\\JAVA_19_09\\File\\Lesson_12\\Lesson_12.txt");
//        if (!Files.exists(writeOut)) {
//            Path writeOutAdd =Files.createFile(writeOut);
//        }
//Files.write(writeOut);


//        List<String> getMassiveAllWriteOut = Files.readAllLines(writeOut);
//        System.out.println(getMassiveAllWriteOut);


    }
}

