package herbert_schildt.chapter_13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Копирование файла.
Чтобы воспользоваться этой программой, укажите
имена исходного и целевого файлов.
Например, чтобы скопировать файл FIRST.txt в файл SECOND.txt,
введите в командной строке следующую команду:
java CopyFile.java FIRST.txt SECOND.txt
 */

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fIn = null;
        FileOutputStream fOut = null;

        // сначала убедиться, что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }
        // копировать файл
        try {
            // попытаться открыть файлы
            fIn = new FileInputStream(args[0]);
            fOut = new FileOutputStream(args[1]);
            do {
                i = fIn.read();
                if (i != -1) fOut.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("ошибка ввода-вывода: " + e);
        } finally {
            try {
                if (fIn != null) fIn.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                if (fOut != null) fOut.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
