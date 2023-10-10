package Java;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        String romanNum;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a roman number in capital letters");
        romanNum = sc.nextLine();
        sc.close();
       
        for(int i=0;i<romanNum.length();i++){
            int a = RomToInt(romanNum.charAt(i));
            if(i+1 < romanNum.length()){
                int b = RomToInt(romanNum.charAt(i+1));
                if(a>=b)
                    sum = sum+a;
                else
                    sum = sum-a;
            }
            else
                sum = sum+a;
        }
        System.out.println(sum);
    }
    static int RomToInt(char rom){
        if (rom == 'I')
           return 1;
        if (rom == 'V')
           return 5;
        if (rom == 'X')
           return 10;
        if (rom == 'L')
           return 50;
        if (rom == 'C')
           return 100;
        if (rom == 'D')
           return 500;
        if (rom == 'M')
           return 1000;
        return -1;
     } 
}
