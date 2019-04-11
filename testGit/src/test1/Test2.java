package test1;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		int data [] = {5,7};
		int index = data[0];
		for (int i = data[0],j = data[1] ; 0 <= data[0] && i <= j && j <= 2147483647 ; i++) {
			index &=  i;
		}
		System.out.println(index);
	}
}


