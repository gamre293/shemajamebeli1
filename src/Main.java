import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
//        c)5
        //2
//        a)int[][] array = new int[5][5];
        //3
//        d)4
        //4
//        c)String
        //5
//        d)კოდი არ დაკომპილირდება
        //6
//        c) byte, short, int, long
        //7
//        c)კომპილაციის ერირი
        //8
//        a)break
        //9
//        a) აცხადებს 10 ინტიან მასივს და ყველას ანიჭებს მნიშვნელობას 0;
        //10
//        e)არცერთი
        //11
//        c) მასივს აქვს ფიქსირებული ზომა
        //12
//        c)git log
        //13
//        c) აახლებს ლოკალურ რეპოსიტორის იმ ცვლილებებით, რომელიც Remote-ში მოხდა
        //14
//        a)0
        //15
//        b) მასივი არის ერთი ცვლადი, რომელსაც შეუძლია შეინახოს რამდენიმე ერთი და იმავე ტიპის მნიშვნელობა
        //16
//        int[ ] prices = {1,5,9,2,10,7};
//        int minIndex = 0;
//        int maxIndex = 0;
//
//        int minPrice = prices[0];
//        int maxPrice = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[1] < minPrice) {
//                minPrice = prices[i];
//                minIndex = i;
//            }
//            if (prices[i] > maxPrice) {
//                maxPrice = prices[i];
//                maxPrice= i;
//
//            }
//        }
//        System.out.println(minIndex + " არის ყველაზე იაფი მაღაზიაში და ღირს " + minPrice);
//        System.out.println(maxIndex + "არის ყველაზე ძვირი მაღაზიაში და ღირს " + maxPrice);
        //17
//        for (int i = 0; i <= 100; i++){
//            if (i % 5 == 0 && i % 7 == 0){
//                System.out.println("HEYHOW");
//            }else if (i % 5 == 0){
//                System.out.println("HEY");
//            } else if (i % 7 == 0) {
//                System.out.println("HOW");
//            }else{
//                System.out.println(i);
//            }
//        }
        //18
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.println("შეიყვანე რიცხვი: ");
//        int rows = scanner.nextInt();
//        System.out.println("შეიყვანე რიცხვი: ");
//        int cols = scanner.nextInt();
//        int[][] array = new int[rows][cols];
//        for (int i = 0; i < rows; i++){
//            for (int j = 0; j < cols; j++);
//            array[i][j] = random.nextInt(100);
//        }
//        System.out.println("2D მასივის გენერატორი არის: ");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.println(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int smallest = array[0][0];
//        int largest = array[0][0];
//        int smallestRow = 0;
//        int smallestCol = 0;
//        int largestRow = 0;
//        int largestCol = 0;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if (array[i][j] < smallest){
//                    smallest = array[i][j];
//                    smallestRow = i;
//                    smallestCol = j;
//                }
//                if (array[i][j] > largest){
//                    largest = array[i][j];
//                    largestRow = i;
//                    largestCol = j;
//                }
//            }
//        }
//        System.out.println("ყველაზე პატარა ელემენტი არის" + smallest + smallestRow + "-ში" + ", " + smallestCol + "-ში");
//        System.out.println("ყველაზე დიდი ელემენტი არის " + largest +largestRow + "-ში" + ", " + largestCol + "-ში");
        //19
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("შიყვანეკუბიწ სიგრძე: ");
//        int n = scanner.nextInt();
//        int[][] array = new int[n][n];
//        for (int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                array[i][j] = random.nextInt(100);
//            }
//        }
//        System.out.println("2D მასივის გენერატორი არის: ");
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.println(array[i][j] +"\t");
//            }
//            System.out.println();
//        }
//        int primaryDiagonalSum = 0;
//        int secondsryDiagonalSum = 0;
//        for ( int i = 0; i < n; i++) {
//            primaryDiagonalSum += array[i][j];
//            secondsryDiagonalSum += array[i][n - 1 - j];
//            if (n % 2 != 0) {
//                int conterElement = array[n / 2][n / 2];
//                int totalSum = primaryDiagonalSum + secondsryDiagonalSum - conterElement;
//                System.out.println("ორივე დიაგონალის ჯამი: " + totalSum);
//            } else {
//                int totalSum = primaryDiagonalSum + secondsryDiagonalSum - conterElement;
//                System.out.println("ორივე დიაგონალის ჯამი არის: " + totalSum);
//            }
//        }
//        scanner.close();
    }
}