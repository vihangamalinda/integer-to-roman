package com.vihanga;

public class Calculator {


    public static void main(String[] args) {
        String s = integerToRoman(1994);
        System.out.println(s);

    }

//    private static String intToRoman(int input){
//        String [] romanArr = {"I","V","X","L","C","D","M"};
//        int [] intArr = {1,5,10,50,100,500,1000};
//
//        int value =input;
//        int remainder = 0;
//        int module=0;
//        StringBuilder stringBuilder = new StringBuilder("");
//        for(int inIndex =intArr.length -1 ; inIndex>=0;inIndex--){
//            remainder = value%intArr[inIndex];
//            module = value /intArr[inIndex];
//            System.out.println("remainder:"+ remainder);
//
//
//            if(remainder == 0){
//
//                System.out.println("module: "+module);
//                remainder = value - module;
////                stringGenerator(inIndex,)
//
//            }else if(remainder != value && remainder!=0 ){
//                value = value - module*intArr[inIndex];
//                System.out.println("value: "+value +" module*intArr[inIndex]: "+ remainder*intArr[inIndex]);
//                stringBuilder.append(stringGenerator(inIndex,remainder,romanArr));
//            }
////            else (module == remainder && inIndex ==0){
////
////            }
//
//
//        }
//
//        return stringBuilder.toString();
//    }

    private static String integerToRoman(int input) {



        int[] intArr = {1,4, 5, 9,10,40, 50,90, 100,400, 500, 900,1000};


        int module = 0;
        int value = input;
        StringBuilder stringBuilder = new StringBuilder("");

        for (int index = intArr.length - 1; index >= 0; index--) {

            module = value / intArr[index];

        stringBuilder.append(stringGenerator(index,module));
        value = value- module* intArr[index];

        /*
        four times index means a subtraction
         eg:  IIII = IV , VIIII = IX
        */
//            if (module == 4) {
//                s = stringGenerator(index, 1) + s;
//                value = value - module * intArr[index];
//                System.out.println("S:  " + s);
//            } else {
//                s = s + stringGenerator(index, module);
//                value = value - module * intArr[index];
//                System.out.println("value " + value);
//                System.out.println("module " + module);
//                System.out.println("s: " + s);
//            }

        }
        return stringBuilder.toString();
    }


    private static String stringGenerator(int index, int module) {
        String[] romanArr = {"I","IV", "V","IX", "X", "XL","L","XC", "C","CD" ,"D","CM", "M"};
        String s = "";
        for (int i = 0; i < module; i++) {
            s = s + romanArr[index];
        }
        return s;
    }


}
