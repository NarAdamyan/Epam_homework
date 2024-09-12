import java.util.Scanner;

public class ArraysLength {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the length of array : ");
        int userinput = myObj.nextInt();
        userinput=userinput>0? userinput:0;

        int[] arrOfnumbers;

        switch (userinput) {
            case 0:
                System.out.println("Please enter positiv number!!!");
                break;
            case 3:
                arrOfnumbers = new int[3];
                System.out.print("Array length is: " + arrOfnumbers.length);
                break;
            case 4:
                arrOfnumbers = new int[4];
                System.out.print("Array length is: " + arrOfnumbers.length);
                break;
            case 5:
                arrOfnumbers = new int[5];
                System.out.print("Array length is: "+arrOfnumbers.length);
                break;
            case 6:
                arrOfnumbers = new int[10];
                System.out.print("Array length is: "+arrOfnumbers.length);
                break;

            case 7:
                arrOfnumbers = new int[10];
                System.out.print("Array length is: "+arrOfnumbers.length);
            break;
            default:
                arrOfnumbers = new int[15];
                arrOfnumbers[0] = 15;
                System.out.println("Array length is: "+arrOfnumbers.length);
                System.out.println("First element is: "+arrOfnumbers[0]);


                break;
        }
    }


}


