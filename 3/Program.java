import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Program{
    public static void main(String[] args) throws IOException {

        // 1.
        // Path path1 = new Path() {
        //     @Override
        //     public FileSystem getFileSystem() {
        //         return null;
        //     }

        //     @Override
        //     public boolean isAbsolute() {
        //         return false;
        //     }

        //     @Override
        //     public Path getRoot() {
        //         return null;
        //     }

        //     @Override
        //     public Path getFileName() {
        //         return null;
        //     }

        //     @Override
        //     public Path getParent() {
        //         return null;
        //     }

        //     @Override
        //     public int getNameCount() {
        //         return 0;
        //     }

        //     @Override
        //     public Path getName(int index) {
        //         return null;
        //     }

        //     @Override
        //     public Path subpath(int beginIndex, int endIndex) {
        //         return null;
        //     }

        //     @Override
        //     public boolean startsWith(Path other) {
        //         return false;
        //     }

        //     @Override
        //     public boolean endsWith(Path other) {
        //         return false;
        //     }

        //     @Override
        //     public Path normalize() {
        //         return null;
        //     }

        //     @Override
        //     public Path resolve(Path other) {
        //         return null;
        //     }

        //     @Override
        //     public Path relativize(Path other) {
        //         return null;
        //     }

        //     @Override
        //     public URI toUri() {
        //         return null;
        //     }

        //     @Override
        //     public Path toAbsolutePath() {
        //         return null;
        //     }

        //     @Override
        //     public Path toRealPath(LinkOption... options) throws IOException {
        //         return null;
        //     }

        //     @Override
        //     public WatchKey register(WatchService watcher, WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers) throws IOException {
        //         return null;
        //     }

        //     @Override
        //     public int compareTo(Path other) {
        //         return 0;
        //     }
        // };
        // Path path2 = new Path() {
        //     @Override
        //     public FileSystem getFileSystem() {
        //         return null;
        //     }

        //     @Override
        //     public boolean isAbsolute() {
        //         return false;
        //     }

        //     @Override
        //     public Path getRoot() {
        //         return null;
        //     }

        //     @Override
        //     public Path getFileName() {
        //         return null;
        //     }

        //     @Override
        //     public Path getParent() {
        //         return null;
        //     }

        //     @Override
        //     public int getNameCount() {
        //         return 0;
        //     }

        //     @Override
        //     public Path getName(int index) {
        //         return null;
        //     }

        //     @Override
        //     public Path subpath(int beginIndex, int endIndex) {
        //         return null;
        //     }

        //     @Override
        //     public boolean startsWith(Path other) {
        //         return false;
        //     }

        //     @Override
        //     public boolean endsWith(Path other) {
        //         return false;
        //     }

        //     @Override
        //     public Path normalize() {
        //         return null;
        //     }

        //     @Override
        //     public Path resolve(Path other) {
        //         return null;
        //     }

        //     @Override
        //     public Path relativize(Path other) {
        //         return null;
        //     }

        //     @Override
        //     public URI toUri() {
        //         return null;
        //     }

        //     @Override
        //     public Path toAbsolutePath() {
        //         return null;
        //     }

        //     @Override
        //     public Path toRealPath(LinkOption... options) throws IOException {
        //         return null;
        //     }

        //     @Override
        //     public WatchKey register(WatchService watcher, WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers) throws IOException {
        //         return null;
        //     }

        //     @Override
        //     public int compareTo(Path other) {
        //         return 0;
        //     }
        // };
        // rwLine(path1, path2);

        // 3.
        /* Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
        Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
        Подумайте, что должно происходить при закрытии этого ресурса?
        Напишите метод для проверки, закрыт ли ресурс.
        При попытке вызвать add() у закрытого ресурса, должен выброситься IOException */

        Counter counter = new Counter();
        try (counter){
            counter.add();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // counter.add();
    }

    // 1.
    public static void rwLine(Path pathRead, Path pathWrite) /* throws IOException */ {
        BufferedReader in = null;
        BufferedWriter out = null;
        try{
            in = Files.newBufferedReader (pathRead) ;
            out = Files.newBufferedWriter(pathWrite) ;
            out .write(in.readLine());
            throw new IOException("Файл не удалось открыть");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }   

} 