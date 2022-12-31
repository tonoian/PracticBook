package herbert_schildt.chapter_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Отображение содержимого текстового файла.
Чтобы воспользоваться этой программой, укажите
имя файла, который требуется просмотреть.
Например, чтобы просмотреть файл Test.txt,
введите в командной строке следующую команду:
java ShowFile.java Test.txt
В этом варианте программы код, открывающий и получающий
доступ к файлу, заключен в один блок оператора try.
Файл закрывается в блоке оператора finally.
 */

public class ShowFile1 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile demo.txt");
            return;
        }

        // В следующем коде сначала открывается файл, а затем
        // из него читаются символы до тех пор, пока не встретится
        // признак конца файла
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        } finally {
            try {
                // закрыть файл в люОом случае
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
