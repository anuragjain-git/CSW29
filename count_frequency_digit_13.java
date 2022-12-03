import java.util.*;
public class count_frequency_digit_13 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[10];
//		int rem = 0;
//		while(num>0) {
//			rem = num % 10;
//			arr[rem]++;
//			num=num/10;
//		}
//		for(int i=0;i<arr.length;i++) {
//			int freq = arr[i];
//			if(freq != 0) {
//				System.out.println(i+"  "+freq);
//			}
//		}
		
		//Q14
		
		int [] arr = new int [] {12, 12, 8, 3, 12, 20, 20, 5,-1, -1};
		int [] freq = new int [arr.length];
		int visited = -1 ;
        for(int i = 0; i < arr.length; i++){
            
        	int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    freq[j] = visited;  
                }  
            }
            if(freq[i] != visited)  
                freq[i] = count; 
            
        }
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != visited)  
                System.out.println(arr[i] + " frequency " + freq[i]);  
        }
	}

}
