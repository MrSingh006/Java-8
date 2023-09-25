package consumer.chaning;

import java.util.function.Consumer;

public class Testmovie {

	public static void main(String[] args) {
		
		
		Consumer<Movie> c1 = m->System.out.println(m.name+" This movie is hit");
		Consumer<Movie> c2 = m->System.out.println(m.name+" This movie is Average");
		Consumer<Movie> c3 = m->System.out.println(m.name+" This movie is flop");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		Movie m= new Movie("SpiderMan");

		cc.accept(m);
	}

}
