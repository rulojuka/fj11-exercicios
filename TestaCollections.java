import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class TestaCollections{
	public static void main(String args[]){
		TreeSet<Integer> meuSet = new TreeSet<>();
		for (int i = 1000; i >= 1; i--) {
			meuSet.add(i);
		}
		/*Já ordena na inserção*/
		/*
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			meuSet.add(random.nextInt(1000)); 
		}
		*/
		for (Integer x : meuSet) {
			System.out.println(x);
			
		}
		
		List<Integer> lista = new ArrayList<>();
		for (int i = 1000; i >= 1; i--) {
			lista.add(i);
		}
		/*
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			meuSet.add(random.nextInt(1000));
		}
		*/
		
		/*Tem que ordenar explicitamente*/
		Collections.sort(lista);
		for (Integer x : lista) {
			System.out.println(x);
			
		}
		
		
		
	}
}

