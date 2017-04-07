package ru.loginov.learning;

public class Graph {

	
	public static void main(String[] args) {
		//for( int i = 0; i < graph.length; i++) {
		//	int[] elem = graph[i];
		//}
		int[][] graph = new int[][] {
			new int[] { //0
				1, 2
			},
			new int[] { //1
				0, 3, 0
			},
			new int[] { //2
				0
			},
			new int[] { //3
				1	
			}
	};
	

		System.out.println(isGraphSimple(graph));
	}
	
	static boolean isGraphSimple(int[][] graph) {
		for( int[] arr: graph) {
			if (hasDuplicates(arr, graph.length)) {
				return false;
			}
		}
		return true;
	}
	
	//arr = [ 1, 2, 5, 1, 3 ]
	//maxElement = 5
	//wasFound = [ false, false, false, false, false, false ]
	//wasFound = [ false, true, false, false, false, false ]
	//wasFound = [ false, true, true, false, false, false ]
	//wasFound = [ false, true, true, false, false, true ]
	//wasFound = [ false, true!, false, false, false, false ]
	
	
	static boolean hasDuplicates(int[] arr, int maxElement) {
		boolean[] wasFound = new boolean[maxElement+1];
		for (int elem: arr) {
			if (wasFound[elem]) {
				return true;
			}
			wasFound[elem] = true;
		}
		return false;
	}
	
}
