package exceptions;

public class Errors {

    //StackOverFlowError

    public static void main(String[] args) {
        metodaRecursiva(5, 1);
    }

    public static void metodaRecursiva(int numar, int iterator){

        if (numar==0){
            return;
        }else{
            System.out.println(iterator);
            iterator++;
            metodaRecursiva(numar, iterator);
        }

    }

}
