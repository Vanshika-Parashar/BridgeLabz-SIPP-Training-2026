package sorting;
public class first{
	public static void main(String[]args){
        String s="Hello World";
        char[]arr=s.toCharArray();

        int left=0;
        int right=arr.length-1;
        while(left<=right){
	        char temp=arr[left];
	        arr[left]=arr[right];
	        arr[right]=temp;
	        left++;
	        right--;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
	    sb.append(arr[i]);
        }
        System.out.println(sb.toString());
	}
}