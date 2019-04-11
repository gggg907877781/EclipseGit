package test1;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Test3 {
	
	public static int values = 19 ;
	public int sum = 0;
	public boolean pool = false;
	
	public static void main(String[] args) {
		Test3 t1 = new Test3();
		t1.equalOne(values);
		System.out.println(t1.pool);
	}
	
	public void equalOne (Integer value) {
		
		if (sum == 1) {
			pool = true;
			return ;
		}
		
		sum = 0;
		
		ArrayList<Double> list = new ArrayList();
		
		int zhi = 1;
		
		for (int i = 0 ; i < value.toString().length() ; i++) {
			if (i == 0) {
				list.add(Math.pow(value%10,2)); 
			}else {
				zhi *= 10;
				list.add(Math.pow(value/zhi%10,2)); 
			}
		}
		
		
		for (int j = 0 ; j < list.size(); j ++) {
			sum += list.get(j);
		}

		equalOne(sum);
	}

	
}
