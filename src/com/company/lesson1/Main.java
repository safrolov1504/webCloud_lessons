package com.company.lesson1;

import com.company.lesson1.FileMessage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Path path = Paths.get("1","2"); //может указывать на дериторию или на файл
        path  = path.resolve("3.txt"); //достраивает путь до файла


        System.out.println(path.getFileName().toString());//имя последнего

        System.out.println(path);
        System.out.println(path.getName(1)); // вытаскивает имя по индексу. часть имени выдает
        System.out.println(path.getName(path.getNameCount()-1)); // выдает имя файла


        //Files. - класс для работы с файлом
        System.out.println();
        System.out.println(Files.exists(path));

        FileMessage fileMessage = new FileMessage(Paths.get("demo.txt"));
        System.out.println(Arrays.toString(fileMessage.getDate()));



    }
}
