package forTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		int[][]inputCards = {{5,7,3,9,4,9,8,3,1,1,2,2,4,4,1,1,2,3}};
		int[][]inputCards = {{5,7,3,9,4,9,8,3,1},{1,2,2,4,4,1},{1,2,3}};

	    Set<Integer> mySet = new HashSet<Integer>();
	    int highestCard = -1;
	    mySet.add(highestCard); 
	    for (int i = 0; i < inputCards.length; i++) {
	        Arrays.sort(inputCards[i]);
	        for (int card : inputCards[i]) {
	            if(mySet.contains(card)){
	                mySet.remove(card);
	            } else {
	                mySet.add(card);
	            }
	        }
	    }
	    for(int value : mySet){
	        highestCard = value;
	    }  
	    System.out.println(highestCard);
	}

}
