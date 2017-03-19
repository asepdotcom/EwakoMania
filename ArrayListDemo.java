//CARA MAKE ARRAYLIST

import java.util.ArrayList;

public class ArrayListDemo {
   public static void main(String[] args) {
      
   // create an empty array list with an initial capacity
   ArrayList<Card> arrlist = new ArrayList<Card>(5);
  
   int i;
	MonsterCard new1 = new MonsterCard("asep","keren",50,1,4000,55,"emas","kodok","boolean",1);
	MonsterCard new2 = new MonsterCard("bambang","keren",50,1,4000,5,"emas","kodok","boolean",2);
	MonsterCard new3 = new MonsterCard("budi","keren",50,1,4000,5,"emas","kodok","boolean",3);
	MonsterCard new4 = new MonsterCard("joko","keren",50,1,4000,5,"emas","kodok","boolean",4);

   // use add() method to add elements in the deque
   arrlist.add(new1);
   arrlist.add(new2);
   arrlist.add(new3);
   arrlist.add(new4);

   System.out.println("Size of list: " + arrlist.size());
	
   // let us print all the elements available in list
   for (i=0;i<arrlist.size();i++) {
   System.out.println(i+". " + arrlist.get(i).getName());
   }  

	System.out.println("Size of list: " + arrlist.size());
   // Removes element at 3rd position
   /*arrlist.remove(2);

   System.out.println("Now, Size of list: " + arrlist.size());
	
   // let us print all the elements available in list
  for (i=0;i<arrlist.size();i++) {
     System.out.println(i+". " + arrlist.get(i).getName());
   }  
   
   arrlist.remove(1);
   
   for (i=0;i<arrlist.size();i++) {
      System.out.println(i+". " + arrlist.get(i).getName());
   }  */
   
   System.out.println("Size of list: " + arrlist.size());
   System.out.println("Size of list: " + arrlist.size());
   System.out.println("Size of list: " + arrlist.size());
	
	
	ArrayList<Card> copyMonster = new ArrayList<Card>(arrlist);
	
	copyMonster.get(0).setUp();
	
	
	 for ( i=0;i<copyMonster.size();i++) {
      System.out.println(i+". " + copyMonster.get(i).getName());
   } 
   
   }
  
 }
   
