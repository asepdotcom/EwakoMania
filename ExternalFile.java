import java.io.*;

public class ExternalFile {

   public static final void save(Player p) {
      try {
		  if (p==null){
			  System.out.print("Cant saved");
		  }
		  else{
         FileOutputStream fileOut = new FileOutputStream("p.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		 out.writeObject(p);
			 out.close();
			 fileOut.close();
		  System.out.print("Serialized data is saved in p.txt");
		  }
      }catch(IOException i) {
         i.printStackTrace();
      }
   }
   
   public static final Player load() {
      Player p = null;
	  try {
         FileInputStream fileIn = new FileInputStream("p.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         p = (Player) in.readObject();
         in.close();
         fileIn.close();
	  }catch (EOFException e) {
		// ... this is fine
      }catch(FileNotFoundException e) {
         e.printStackTrace();
         //return;
      }catch(IOException i) {
         i.printStackTrace();
         //return;
      }catch(ClassNotFoundException c) {
         System.out.println("Player class not found");
         c.printStackTrace();
        // return;
      }
      /*
      System.out.println("Deserialized Player...");
      System.out.println("Name: " + p.getName());
      System.out.println("Money: " + p.getMoney());*/
	  return p;
   }
}