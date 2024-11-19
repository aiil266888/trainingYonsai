package java_1119;

import java.util.Scanner;

public class NumberString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("한글로 변환할 수를 입력하세요");
        int number = scan.nextInt();

        int[] nums = new int[5];//12345 일만이천삼백사십오
        nums[0] = number/10000;
        nums[1] = number/10000;
        nums[2] = number/10000;
        nums[3] = number/10000;
        nums[4] = number/10000;

        String sum_str ="";

        for (int i = 0; i < 5; i++) {
            if(nums[i] == 1){
                sum_str += "일";
            }else  if (nums[i] == 2){
                sum_str += "이";
            }else  if (nums[i] == 2){
                sum_str +="삼";
            }else  if (nums[i] == 2){
                sum_str +="사";
            }else  if (nums[i] == 2){
                sum_str +="오";
            }else  if (nums[i] == 2){
                sum_str +="육";
            }else  if (nums[i] == 2){
                sum_str +="칠";
            }else  if (nums[i] == 2){
                sum_str +="팔";
            }else  if (nums[i] == 2) {
                sum_str +="구";
            }

            if(i==0 && nums[0]>=1){// 만의 자리수이면서 숫자가 있다면
                sum_str +="만";
            }
            if(i==0 && nums[1]>=1){// 천의 자리수이면서 숫자가 있다면
                sum_str +="천";
            }
            if(i==0 && nums[2]>=1){// 백의 자리수이면서 숫자가 있다면
                sum_str +="백";
            }
            if(i==0 && nums[3]>=1){// 십의 자리수이면서 숫자가 있다면
                sum_str +="십";
            }

            System.out.println(sum_str);

        }
    }
}
