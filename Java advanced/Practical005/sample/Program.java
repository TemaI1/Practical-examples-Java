package ru.lesson.practical005.sample;

import java.io.*;
import java.nio.channels.FileChannel;


public class Program {
    public static void main(String[] args) throws IOException {

        File sou = new File("copyTest.txt");
        File des = new File("copyTest2.txt");

        copyFileUsingStream(sou, des);
        copyFileUsingChannel(sou, des);
    }

//      метод для копирования файла с использованием потоков
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

//      копирования файлов с помощью класса FileChannel
    private static void copyFileUsingChannel(File source, File dest) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }finally{
            sourceChannel.close();
            destChannel.close();
        }
    }

}
