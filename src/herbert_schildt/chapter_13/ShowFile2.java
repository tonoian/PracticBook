package herbert_schildt.chapter_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
В этой версии программы ShowFile2 оператор try с ресурсами
применяется для автоматического закрытия файла
Примечание: для выполнения этого кода требуется версия JDK 7
 */
public class ShowFile2 {
    public static void main(String[] args) {
        int i;

        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile2 имя_файла");
            return;
        }
        // Ниже оператор try с ресурсами применяется
        // сначала для открытия, а затем для автоматического
        // закрытия файла по завершении блока этого оператора
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден ");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
