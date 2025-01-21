//Սարքեք Teacher կլաս, իրա որոշակի փռոփերթիներով։ Դա թողնում եմ Ձեզ, դուք ամեն մեկդ որոշեք թե ինչ փռոփերթիներ
// ունենա Ձեր կլասը։ Ունեք նաև որոշակի գործակից, որի հիման վրա որոշվումա ուսուցիչների բազային աշխատավարձը։
// Ենթադրենք, էդ K գործակիցը սահմանումա պետությունը, որն ընդհանուրա բոլոր ուսուցիչների համար իսկ Ձեր ծրագիրը դա
// ընդունումա որպես input ու փոխանցումա դա Teacher կլասին ֆիքսելու համար։ Գործակիցը չի կարա փոքր լինի 1-ից։
//Ուսուցչի բազային աշխատավարձը որոշվումա minBaseSalary = K * minSalary բանաձևով, ընդ որում MIN_SALARY-ն նույնպես
// ծրագիրը պետքա ստանա որպես input ու հիշվի Teacher կլասի մեջ։ Ուսուցիչների բազային աշխատավարձը չպիտի հաշվվի մեթոդներով
// կամ կոնստրուկտորի մեջ, որևէ ուղիղ կանչով չպիտի դա հաշվարկվի։ Հաշվարկը կատարող կոդը պետքա աշխատի ավտոմատ կլասի լոդինգի
// ժամանակ, իսկ թե ոնց կազմակերպեք, սկզբից պետքա կարդալ թեման։
//Հետո ամեն մի ուսուցիչ պետքա ունենա իրան հատուկ W կայֆիցենտը, որը օբյեկտը ստեղծելուց պետքա փոխանցվի, որը նույնպես
// չի կարա փոքր լինի 1-ից։ Արդեն հենց իրա աշխատավարձի չափը պետքա հաշվարկվի salary = W * minBaseSalary բանաձևով։
package Teacher;

import java.util.Scanner;

public class Teacher {
    private String proffesion;
    private int yearsOfwork;
    private boolean isInManagment;
    private int countOfclass;
    static int K;
    static int MIN_SALARY;
    static int minBaseSalary;
    static int W;

    //    seters and geters
    public int getCountOfClass() {
        return this.countOfclass;
    }

    public int setCountOfClass(int count) {
        if (count > 0) {
            this.countOfclass = count;
        }
        return this.countOfclass;
    }

    public boolean getIsInManagment() {
        return this.isInManagment;
    }

    public boolean setIsInManagment(boolean manage) {
        return this.isInManagment;
    }

    public String setProffesion(String prof) {
        if (prof.length() > 3) {
            return prof;
        }
        return "not valid profession";
    }

    public String getProfecion() {
        return this.proffesion;

    }

    public int getYearsOfwork() {
        if (this.yearsOfwork > 0) {
            return this.yearsOfwork;
        }
        return -1;

    }


    public static int getMinBaseSalary() {
        return minBaseSalary;
    }

    //constructors
    public Teacher(String prof, boolean manage, int years, int count, int W) {
        if (getYearsOfwork() == -1 || getCountOfClass() == -1) {
            System.out.println("not valid initials!!!");
            return;
        }
//        if (K == -1 || W == -1) {
//            System.out.println("not valid salary!!!");
//            return;/.';P[0=-
//        }
        this.proffesion= prof;
        this.isInManagment = manage;
        this.yearsOfwork = years;
        this.countOfclass = count;
        this.W = W;

    }

    public Teacher() {

    }

    public int calculateSalary() {
        return W * minBaseSalary;
    }

    public static void initializeSalaryCoefficients(int k, int minSalary) {

        K = k;
        MIN_SALARY = minSalary;
        minBaseSalary = K * MIN_SALARY;
    }
}
