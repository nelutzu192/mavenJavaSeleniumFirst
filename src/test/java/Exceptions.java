import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Exceptions {

    public static void main(String[] args) throws IOException {

        //throw
        //throws
        //try-catch-finally

        //throw - cand dorim sa aruncam o anumita exceptie/eroare

        //throws - atentionare ca o metoda sau construrctor arunca o eroare/exceptie

        //try-catch-finally - definire handlere pt exepctiile sau erorile noastre

//        checkedExceptions();

//        uncheckedExceptions();

//        metodaRecursiva(5,1);

//        try{
//            String cuvant = null;
//            String ss = cuvant.toLowerCase();
//            System.out.println("Rezultatul este: " + ss);
//        } catch (NullPointerException e){
//            System.out.println("Am intrat in blocul catch");
//
//        }

//        try{
//            checkedExceptions();
//        } catch (IOException e){
//            //grija la file ala sa i pui o locatie greista ca sa dea exceptie
//            System.out.println("Am intrat in catch");
//        }

        //how to handle 2 different exceptions
//        try{
//            String cuvant = "un oarecare string";
//            String ss = cuvant.toUpperCase();
//            System.out.println("Rezultatul este: " + ss);
//
//            int a = 10;
//            int b = 0;
//            int result = a / b;
//            System.out.println("Rezultatul impartirii este: " + result);
//        } catch (NullPointerException | ArithmeticException e){
//
//            System.out.println("Am intrat in blocul catch");
//
//        }

        //finally

//        try{
//            String cuvant = "un oarecare string";
//            String ss = cuvant.toUpperCase();
//            System.out.println("Rezultatul este: " + ss);
//
//            int a = 10;
//            int b = 0;
//            int result = a / b;
//            System.out.println("Rezultatul impartirii este: " + result);
//        } catch (NullPointerException e){
//
//            System.out.println("Am intrat in blocul catch");
//
//        } finally{
//            System.out.println("Am intrat in finally");
//        }
//
//
//        System.out.println("S-a terminat metoda main");



        //throw
//        throw new NullPointerException();

//        throwsException();

        throw new MyCustomException("Mesajul custom");

    }

    //depistate la momentul compilarii - arunca ceva (throws)
    //trubie tratare mereu, altfel nu ruleaza codul, avand o eroare de compilare

    //click pe linia care arunca eroare si Alt+Enter

    public static void checkedExceptions() throws IOException {

        //sa citim dintr un fisier - prim data dam un empty fileName
        FileReader file = new FileReader("src/test/resources/text.txt");

        //apoi cream fisiereul si il salvam local
        //apoi citim din el for real

        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();


    }

    //depistate la momentul rularii codului (runtime); nu sunt prinse la compilare
    public static void uncheckedExceptions(){

        //toate erorile sunt unchecked exceptions

        //String null (Null Pointer Exception)
//        String s = null;
//        s.length();


        //Division by 0 (Arithmetic Exception)
        int a = 10;
        int b = 0;
        int result = a / b;

        System.out.println("Rezultat: " + result);


    }

    //error exemplification
    public static void metodaRecursiva(int numar, int n){

        //stack overflow error
        if (numar == 0){
            return;
        }else{
            System.out.println(n);
            n++;
            metodaRecursiva(numar,n);
        }



    }

    public static void throwsException(){
        throw new ArithmeticException();
    }

}
