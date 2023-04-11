package unlam.paradigmas.diagnostico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio04 {

	public static int[] resolver(int[][] m) {
		
		if(m.length == 0) {
			System.out.println("No se puede obtener la moda de esta matriz");
			return null;
		}
		
		int[] modas = new int[m.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(!map.containsKey(m[i][j]))
					map.put(m[i][j], 1);
				else
					map.put(m[i][j], map.get(m[i][j])+1);
			}
			//mostrarHashMap(map);
			modas[i] = (Integer)map.keySet().toArray()[map.size()-1];
			map.clear();
		}
		mostrarVector(modas);
		
		return modas;
	}
	
	public static void mostrarVector(int[] vec) {
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i] + " ");
		}
		System.out.println("");
	}
	
	public static void mostrarHashMap(HashMap<Integer, Integer> map) {
		for (Integer key: map.keySet()){
			System.out.println(key+ " = " + map.get(key));
		} 
		System.out.println();
	}
}
