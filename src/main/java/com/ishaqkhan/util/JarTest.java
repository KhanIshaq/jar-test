/**
 * 
 */
package com.ishaqkhan.util;

import org.apache.log4j.Logger;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;


/**
 * @author ishaqkhan
 * 
 */
public class JarTest {

	private static final Logger logger = Logger.getLogger(JarTest.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> numbers =  IntStream.rangeClosed(1,100)
										  .map(n -> n*2)
										  .boxed()
									      .collect(Collectors.toList());
		
		for(Integer i : numbers)
			logger.info(" Iterating : " + i);
	}

}
