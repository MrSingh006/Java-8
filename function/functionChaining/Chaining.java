package function.functionChaining;

import java.util.function.Function;

public class Chaining {

	public static void main(String[] args) {
		Function<Integer,Integer> f1 = i->i*2;
//		Function<Integer,Integer> f2 = j->j*j*j;
		/* Here we can write i as well as j o/p will be same */
		Function<Integer,Integer> f2 = i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));

	}

}
