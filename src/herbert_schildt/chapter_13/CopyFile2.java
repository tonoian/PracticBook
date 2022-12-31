package herbert_schildt.chapter_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Версия программы CopyFile, использующая оператор try с ресурсами.
Она демонстрирует управление двумя ресурсами (в данном случае -
файлами) в одном операторе try
 */
public class CopyFile2 {
    public static void main(String[] args) {
        int i;

        // сначала убедиться, что заданы оба файла
        if (args.length != 2) {
            System.out.println("Использование: CopyFile2 откуда куда");
            return;
        }
        // открыть два файла и управлять ними в операторе try
        try (FileInputStream fIn = new FileInputStream(args[0]);
             FileOutputStream fOut = new FileOutputStream(args[1])) {
            do {
                i = fIn.read();
                if (i != -1) fOut.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("ошибка ввода-вывода: " + e);
        }
    }
}
