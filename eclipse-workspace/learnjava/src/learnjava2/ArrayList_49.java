package learnjava2;

import java.util.ArrayList;

public class ArrayList_49 {
	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>(5);
		l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(0,6);    // this will send 6 to 0th index
        l2.add(15);
        l2.add(16);
        l2.add(17);
        
        
        System.out.println(l1);
        l1.remove(0);
        System.out.println("ArrayList after removing the value at index 0 :" + l1);
        
        l1.addAll(l2);
        System.out.println("L2 Array list : " +l2);
        System.out.println("L1 Array list after merging: "+ l1);
        
        
        l1.addAll(0,l2);
        System.out.println("adding l2 from 0th index");
        System.out.println(l1);
        System.out.println("The first occurrence of 4 in l1 is at index : " + l1.indexOf(4));
        System.out.println("The last occurrence of 4 in l1 is at index : " + l1.lastIndexOf(4));
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

		
	}

}
