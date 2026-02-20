package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Solution sol =  context.getBean("solution",Solution.class);
		System.out.println(sol);
		
		// now we use spelExpresionParser class
		// not use, mostly use @value annotion 
		SpelExpressionParser sp = new SpelExpressionParser();
		Expression ex = sp.parseExpression("3+3");
		System.out.println(ex.getValue());
		
	}

}
