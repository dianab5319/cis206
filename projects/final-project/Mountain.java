public class Mountain{

    /**
    Class definitions are defined and declared. Mountain's name, country 
    and elevation are made private.
    */
       private String mountainName;
       private String country;
       private int elevation;
     
    /**
       sets the Mountain's name using
       @param inputName string from main 
    */
       public void setMountainName(String inputName){
          mountainName = inputName;
       }
    
    /**
       assigns country with a string using
       @param inputCountry string from main
    */
       public void setCountry(String inputCountry){
          country = inputCountry;
       }
    
    /**
       assigns elevation Value using
       @param inputEvaluation integer from main
    */
       public void setElevation(int inputElevation){
          elevation = inputElevation;
       }
    
    /**
       Returns the Mountain's name
    */
       public String getMountainName(){
          return mountainName;
       }
    
    /**
       Returns the Mountain's country
    */
       public String getCountry(){
          return country;
       }
    
    /**
       Returns the Mountain's elevation
    */
       public int getElevation(){
          return elevation;
       }
    
    /**
       Converts the Mountain's elevation from Feet to Meters and
       returns the Mountain's elevation in meters
    */
       public double toMeters(){
          double meters = elevation/3.2808;
          
          return meters;
       }
       
    }