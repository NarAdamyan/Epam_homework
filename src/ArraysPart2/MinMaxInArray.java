//Վերցնում եք ամբողջ թվերի զանգված։ Մի ցիկլով գտնում եք տվյալ զանգվածի միջի մինիմում ու
//        մաքսիմում թվերը։ Դիտարկում եք տարբեր corner case-եր նաև, որպեսզի վստահ լինեք,
//        որ ճիշտա աշխատում։ Օրինակ եթե array-ի մեջ բոլոր թվերը նույնն են, ուրեմն ձեր
//        մինիմումն ու մաքսիմումը պիտի համընկնեն։

package ArraysPart2;

public class MinMaxInArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int minEl = arr[0];
        int maxEl = arr[0];

        for (int el = 1; el < arr.length; el++) {
            if (arr[el] < minEl) {
                minEl = arr[el];
            } else if (arr[el] > maxEl) {
                maxEl = arr[el];
            }
        }

        System.out.println("The smallest element in the array is: " + minEl);
        System.out.println("The bigest element in the array is: " + maxEl);
    }
}
