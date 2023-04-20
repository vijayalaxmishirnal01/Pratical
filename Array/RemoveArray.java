package Array;
import java.util.Arrays;
public class RemoveArray {
	public static void main(String[] args) {
	int[] my_array = {25,14,56,25,36,6,7,18,7,8};
	int Index_position = 4;
	int newValue = 6;
	System.out.println("original array:"+Arrays.toString(my_array));
	
int removeIndex = 5;
	//remove 2nd element from an array
	
//for(int i=my_array.length-1;i > Index_position; i--) {
for(int i=removeIndex;i < my_array.length -1;i++)
	//my_array[i] = my_array[i-1];
	my_array[i] =my_array[i+1];
//}
	System.out.println("After removing the second element::"+Arrays.toString(my_array));
	}
}
