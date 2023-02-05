import java.util.Arrays;
import java.util.Random;
public class Main {
    static int[] genPrimeNum (int numToGenerate) {
        int x = 2, y = 2, target = 0, array[] = new int[numToGenerate];
        for (x = 2; target < numToGenerate; ) {
            if (x == y) {
                array[target] = x;
                target++;
                x++;
                y = 2;
            }
            if (x % y == 0) {
                x++;
                y = 2;
            } else {
                y++;
            }
        }
        return array;
    }

        public static void main(String[] args) {
            int[] primeNumbers;

            primeNumbers = genPrimeNum(33);

            System.out.println("The first "+primeNumbers.length+" prime numbers are: "+ Arrays.toString(primeNumbers));
        }
        /*
        Random random = new Random();
        System.out.println((char)33);
        System.out.println((char)125);

        double x = Math.random()*10;
        System.out.println(x);
        System.out.println(Math.round(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.ceil(x));
        */
    }
/*
            ARRAYS 2
if (aliceToDos.toString().contains(bobToDos[0])
            && aliceToDos.toString().contains(bobToDos[1])
            && aliceToDos.toString().contains(bobToDos[2])
            && aliceToDos.toString().contains(bobToDos[3])){
            System.out.println("Alice has the same tasks as Bob!");
        }else System.out.println("Alice doesn't have the same tasks as Bob!");
 */