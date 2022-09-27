package exceptions;

import org.apache.commons.lang3.ObjectUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Exceptions {


    //throw - cand dorim noi in mod explicit sa aruncam o exceptie

    //throws - atentioneaza ca o metoda/consturctor arunca o exceptie

    //try-catch-finally - modul in care tratam o exceptie


    public static void main(String[] args){

//        checkedException();

//        uncheckedException();

//        try{
//            String cuvant = null;
//            String s = cuvant.toLowerCase(Locale.ROOT);
//            System.out.println("Mesaj: " + s);
//        } catch(NullPointerException e){
//            System.out.println("Am intrat in blocul catch ca sa tratam exceptia");
//            System.out.println(e.getMessage());
//        }

//        try{
//            checkedException();
//        } catch (IOException e){
//            System.out.println("Am intrat in catch");
//        }


        //treating more than 1 exception
//        try{
//
//            //NullPointerException:
//            String cuvant = "ceva string";
//            String s = cuvant.toUpperCase(Locale.ROOT);
//            System.out.println("Mesaj: " + s);
//
//            //ArithmeticException:
//            int a = 10;
//            int b = 0;
//            int result = a / b;
//
//            System.out.println(result);
//
//        } catch(ArithmeticException | NullPointerException e){
//            System.out.println("Am intrat in catch");
//        } finally{
//            System.out.println("Am intrat in finally");
//        }

//        throw new MyException("Mesajul custom al exceptiei mele");

        throw new NullPointerException();


//        System.out.println("Am terminat metodat main");

    }

    public static void checkedException() throws IOException {

        //citim continutul unui fisier
        FileReader file = new FileReader("");

        BufferedReader fileInput = new BufferedReader(file);
        System.out.println("Continut fisier text: " + fileInput.readLine());
        fileInput.close();

    }

    public static void uncheckedException(){

        //NullPointerException
//        String s = null;
//        System.out.println("Lungimea stringului este: " + s.length());


        //Arithmetic Exception
        int a = 10;
        int b = 0;
        int result = a / b;

        System.out.println(result);


    }
}
