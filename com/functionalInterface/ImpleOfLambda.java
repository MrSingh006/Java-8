package com.functionalInterface;

@FunctionalInterface
interface FunInterf
{
	public void test();
}
//public class ImpleOfLambda implements FunInterf
//{
//	public void test()
//	{
//		System.out.println("This is implementation class");
//	}
//}

//class Driver
//{
//	public static void main(String[] args)
//	{
//		FunInterf fi = new ImpleOfLambda();
//		fi.test();
//	}
//}

/*
 * Here implementation class is removed as it is replaced by Lambda expression
 */

class LambdaDriver
{
	public static void main(String[] args)
	{
		FunInterf fi = () -> System.out.println("This is calling of functional interface by lambda");
//		fi.test();
	}
}

