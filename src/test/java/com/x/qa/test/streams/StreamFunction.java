package com.x.qa.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.testng.annotations.Test;

public class StreamFunction {
	
	@Test
	public void SomeOnNumbers() {
		List<Integer> list= Arrays.asList(1,2,5,2,3);
		
		Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
		System.out.println(sum.get());
		
		//OR
		
		System.out.println("sum - " +list.stream().reduce(0, (a,b)->a+b));
		//OR
		System.out.println("sum 1 - " +list.stream().reduce(1, Integer::sum));
	}

}
