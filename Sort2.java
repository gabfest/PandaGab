import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
TASK: sort2
LANG: JAVA
*/

public class Sort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//print();
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		Integer[][] arr = new Integer[row][2];
		
		
		for(int i=0;i<row;i++){
			for(int j=0;j<2;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		//sort
		Arrays.sort(arr, new Comparator<Integer[]>() 
				{
					@Override
					public int compare(Integer[] o1, Integer[] o2) {
						Integer a = o1[0];
						Integer b = o2[0];
						return a.compareTo(b);
				}
		});
		
		for(int i=0;i<row;i++){
			for(int j=i+1;j<row;j++){
				//System.out.println("J:"+j);
				if(arr[i][0]==arr[j][0]) {
					if(arr[i][1]<arr[j][1]){
						int tempt =arr[i][1];
						arr[i][1]=arr[j][1];
						arr[j][1]=tempt;
					}
				}
			}
		}
		/*
		int count=1;
		int index =0;
		for(int i=0;i<row-1;i++){
			if(arr[i][0]==arr[i+1][0]){
				index = arr[i][0];
				count++;
				System.out.println("index"+index);
				System.out.println(count);
			}/*
			if(count>1 && arr[i][0]!=arr[i+1][0]){
				int tempt =0;
				for(int k=index;k<count;k++){
					if(arr[k+1][1]>arr[k][1]){
					System.out.println(arr[i][0]+" count :"+count+" less:"+arr[k][1]+" more:"+arr[k+1][1]);
						
						tempt = arr[k][1];
						arr[k][1] = arr[k+1][1];
						arr[k+1][1] = tempt;
					} else {
						
					}
				}
				count =1;
			}			
		}
		 */
		
		
		
		//Print
		for(int i=0;i<row;i++){
			for(int j=0;j<2;j++){
				System.out.print(arr[i][j]+" " );
			}
			System.out.println();
		}
		
	}

	public static void print(){
		int[][]x = { {1,2},{1,0},{1,500},{2,400} };
		//int[] x = {5,4,10,60,44};
		for(int i=0;i<2;i++){
			for(int j=i+1;j<3;j++){
				if(x[i][0]==x[j][0]) {
					if(x[i][1]<x[j][1]){
						int tempt =x[i][1];
						x[i][1]=x[j][1];
						x[j][1]=tempt;
					}
				}
			}
		}
		for(int i=0;i<3;i++){
			System.out.print(x[i][1]+" ");
		}
	}
}
