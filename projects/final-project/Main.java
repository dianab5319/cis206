/*
FileName: Main.java
Description: The program creates seven Mountain objects each with their respective data information.
            Each object is inserted into a vector List.The minElevation() method is used to find the 
            smallest elevation value. The program prints all of the objects as well as the lowest 
            elevation mountain.
Date: 06/06/23
Author: Diana Barbosa
email: dianab5319@student.vvc.edu
*/

import java.util.ArrayList;
public class Main{

//Finds the smallest elevation value from the Mountain Object list and
//return the minVal
   public static int minElevation(ArrayList<Mountain> mList){
        Mountain firstObj = mList.get(0);
        int minVal = firstObj.getElevation();
        for(Mountain currObj: mList){
           if(minVal > currObj.getElevation() ){ minVal = currObj.getElevation(); }
	}
        return minVal;
      }



   public static void main(String[] args){

// Mountain objects are created and data is assigned here
      ArrayList<Mountain> mountainList = new ArrayList<Mountain>();
      String smallM = "";
      int smallElevation = 0;
      
      Mountain obj1 = new Mountain();
      obj1.setMountainName("Chimborazo");
      obj1.setCountry("Ecuador");
      obj1.setElevation(20549);
      mountainList.add(obj1);

      Mountain obj2 = new Mountain();
      obj2.setMountainName("Matterhorn");
      obj2.setCountry("Switzerland");
      obj2.setElevation(14692);
      mountainList.add(obj2);

      Mountain obj3 = new Mountain();
      obj3.setMountainName("Olympus");
      obj3.setCountry("Greece (Macedonia)");
      obj3.setElevation(9573);
      mountainList.add(obj3);

      Mountain obj4 = new Mountain();
      obj4.setMountainName("Everest");
      obj4.setCountry("Nepal");
      obj4.setElevation(29029);
      mountainList.add(obj4);

      Mountain obj5 = new Mountain();
      obj5.setMountainName("Mount Marcy - Adirondacks");
      obj5.setCountry("United States");
      obj5.setElevation(5344);
      mountainList.add(obj5);

      Mountain obj6 = new Mountain();
      obj6.setMountainName("Mount Mitchell - Blue Ridge");
      obj6.setCountry("United States");
      obj6.setElevation(6684);
      mountainList.add(obj6);

      Mountain obj7 = new Mountain();
      obj7.setMountainName("Zugspitze");
      obj7.setCountry("Switzerland");
      obj7.setElevation(9719);
      mountainList.add(obj7);

//Smallest elevation is assigned here
      smallElevation = minElevation(mountainList);

//All Mountain objects are printed with their respective information
// smallest mountain is searched as well
      for(Mountain m: mountainList){
            System.out.printf("%s %s %d ft %.2f m%n", 
                              m.getMountainName(),
                              m.getCountry(),
                              m.getElevation(),
                              m.toMeters());
            if(m.getElevation() == smallElevation){
                  smallM = m.getMountainName();
                  smallElevation = m.getElevation();
            }
      }
// Smallest Mountain is printed along with their smallest value in ft
         System.out.printf("Smallest Mountain: %s %d ft%n", smallM, smallElevation);
      }
}
