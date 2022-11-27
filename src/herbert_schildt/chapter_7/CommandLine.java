package herbert_schildt.chapter_7;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.*;

// Вывести все аргументы командной строки
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
