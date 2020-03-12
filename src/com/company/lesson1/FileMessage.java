package com.company.lesson1;

import javafx.scene.Parent;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMessage implements Serializable {

    private String fileName;
    private long length;
    private byte[] date;

    public String getFileName() {
        return fileName;
    }

    public long getLength() {
        return length;
    }

    public byte[] getDate() {
        return date;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setDate(byte[] date) {
        this.date = date;
    }

    public FileMessage(Path path){
        if(Files.isDirectory(path)){
            throw  new RuntimeException("Unable to creat file message from dir");
        }

        try {
            this.fileName = path.getFileName().toString();
            this.length = Files.size(path);
            this.date = Files.readAllBytes(path); //предназначен только для работы с небольшим файлом
        } catch (IOException e) {
            throw  new RuntimeException("Unable to creat file message from "+ path.toString());

        }
    }
}
