package learn;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Properties;

public class JavaIO {

    public static void main(String[] args) throws IOException {
//        RandomAccessFile accessFile = new RandomAccessFile("D:\\a.txt","rw");
//        System.out.println(accessFile.readLine());
//        OutputStream out = System.out;// 打印到控制台，也可以输出到文件
//        OutputStreamWriter osr = new OutputStreamWriter(out);//输出 往out里面准备写内容，内容在下面
//        String str = "Hello World!";
//        osr.write(str);//写
//        //osr.flush();//如果用于网络传输，记得强制刷新缓冲区，否则输出的数据只停留在缓冲区中，而无法进行网络传输
//        osr.close();//关闭资源
//        bbb();
        Properties p = new Properties();
        FileInputStream reader = new FileInputStream(new File("D:\\a.txt"));
        p.load(reader);
        System.out.println(p.getProperty("bbb"));
    }

    //字节输入缓冲流
    public static void eee(){
        try {
            //创建字节输出流实例
            OutputStream out=new FileOutputStream("D:\\a.txt");
            //根据字节输出流构建字节缓冲流
            BufferedOutputStream buf=new BufferedOutputStream(out);

            String data="好好学习,天天向上";
            buf.write(data.getBytes());//写入缓冲区
            buf.flush();//刷新缓冲区，即把内容写入
            //关闭流
            buf.close();//关闭缓冲流时,也会刷新一次缓冲区
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//文件流、转换流、 字符缓冲流  文件复制。。
    public static void ddd()  {
        BufferedReader bufferedReader =null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(
                            new File("D:\\a.txt")),"GBK"));
            File fb = new File("D:\\b.txt");
            if(fb.exists()){
                fb.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\b.txt")),"GBK"));
            String str = "";
            while((str = bufferedReader.readLine()) != null){
                str += "     aaaaaaaaasdf\r\n";
                bufferedWriter.write(str);
            }
            bufferedWriter.flush();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

//字节字符流转换
    public static void ccc() {
        File  f = new File("D:\\a.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(f),"GBK"));
            char[] b = new char[1024];
            bufferedReader.read(b);
            System.out.println(new String(b));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void bbb(){
        BufferedReader bufferedReader =null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(
                            new File("D:\\a.txt")),"GBK"));
            File fb = new File("D:\\b.txt");
            if(fb.exists()){
                fb.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\b.txt")),"GBK"));
            int s = -1;
            while((s = bufferedReader.read()) != -1){

                bufferedWriter.write(s);
            }
            bufferedWriter.flush();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    //文件  字节输入流
    public static void aaa(){
        File  f = new File("D:\\a.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream;
        try {
            fileInputStream = new FileInputStream(f);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte [] b = new  byte[1024];
            bufferedInputStream.read(b);
            System.out.println(new String(b));
//            byte [] b = new byte[1024];
//            fileInputStream.read(b);
//            System.out.println(new String(b));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
