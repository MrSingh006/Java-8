package com.functionalInterface;

@FunctionalInterface
interface A {
	public void testA();
}

@FunctionalInterface
interface B extends A {
	public void testA();
}

@FunctionalInterface
interface C{
	public void testC();
}

@FunctionalInterface
interface D extends C{
	
}
