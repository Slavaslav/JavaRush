package com.javarush.test.level32.lesson02.task01;

import java.io.IOException;
import java.io.RandomAccessFile;

/* Запись в файл
В метод main приходят три параметра:
1) fileName - путь к файлу
2) number - число, позиция в файле
3) text - текст
Записать text в файл fileName начиная с позиции number.
Если файл слишком короткий, то записать в конец файла.
*/
public class Solution {
    public static void main(String... args) throws IOException {
        //args = new String[]{"d:\\1.txt", "7", "plowplow"};
        RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw");
        long position = Integer.parseInt(args[1]);
        if (position > randomAccessFile.length()) {
            position = randomAccessFile.length();
        }
        randomAccessFile.seek(position);
        randomAccessFile.write(args[2].getBytes());
        randomAccessFile.close();
    }
}
