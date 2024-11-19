package java_1119;

public class Array04 {
    public static void main(String[] args) {
        int[] arr = {4,1,8,-3,6};

        int max = arr[0]; //배열의 첫 번째를 최대값에 대입
        int min = arr[0];//배열의 첫 번째를 최소값에 대입

        for(int i = 0; i<arr.length; i++){
            if(max < arr[i]){
                max =arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("최댓값 :" + max);
        System.out.println("최솟값 :" + min);
    }
}
