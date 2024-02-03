package slaytSorular_DataCasting;

public class Concatenation {
    public static void main(String[] args) {

        String s1 = "java";

        String s2 = " ";
        String s3 = "kolay";
        String s4 = "";

        int a = 3;
        int b = 4;

        System.out.println(a*b+s2+s1+s2+s3); // 12 java kolay
        System.out.println(a+b+s2+s1+s2+s3); // 7 java kolay
        System.out.println(s4+a+b+s1+s2+s3); // 34java kolay
        System.out.println(s1+a*b+s3); // java12kolay
        System.out.println(s1+s4+a+b+s3);// java34kolay
        System.out.println(s1+(a+b)+s3);// java7kolay

    }

}
