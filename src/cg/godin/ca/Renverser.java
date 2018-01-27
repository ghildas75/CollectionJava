package cg.godin.ca;
import java.util.*;

public class Renverser {

	private ArrayList<Integer>  list= new ArrayList<>();
	
	
	public Renverser(ArrayList<Integer> list) {
		
		this.list = list;
	}


	public ArrayList<Integer> getList() {
		return list;
	}


	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}


	public ArrayList<Integer> inverser(int i, int j){
		
		if (i>j)
			return null;
		if (i>list.size()||i<0)
			return null;
		if (j>list.size()||j<0)
			return null;
		
		for (int k = 0; k <(j-i)/2; k++) {
			
			
//			
//			int tmp=list.get(i);
//		     tmp= list.get((taille-1)-i);
		    int temps=list.get(k);
		    int last=list.get( ((j-i)-k)-1);
			list.set(k,last );
			list.set(((j-i)-k)-1, temps);
//	        arr[i] = arr[len-i-1];
//	        arr[len-i-1] = tmp;
//			
	     }	
		return list;
	}
	
	
public ArrayList<Integer>verser(int i, int j){
		
		if (i>j)
			return null;
		if (i>list.size()||i<0)
			return null;
		if (j>list.size()||j<0)
			return null;
		ArrayList<Integer> small= new ArrayList<>();
		
		for (int k = i; k <=j; k++) {
			small.add(list.get(k));
			
//			
	     }	
		  Collections.reverse(small);
		  
		  for (Integer s : small) {
			System.out.print(s+"\t");
		
		  }
		System.out.println();
		
			for(int y=i,k=0; y<=j && k<small.size(); y++,k++) {
		   list.set(y, small.get(k));
			
		  }	
	     	 
		
	
		return list;
}

	
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(7);
		list.add(11);
		list.add(12);
		list.add(1);
		
		Renverser r= new Renverser(list);
//		for (Integer item : list) {
//			System.out.print(item+"\t");
//		}
//		System.out.println();
//		r.inverser(1, 3);
//		
		for (Integer item : list) {
			System.out.print(item+"\t");
		}
		System.out.println();
		 ArrayList<Integer> mysm=r.verser(0, 1);
		 for (Integer item : mysm) {
				System.out.print(item+"\t");
			}
	
	}
}
