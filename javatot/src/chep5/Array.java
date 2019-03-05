package chep5;

public class Array {
    public static void main(String[] args) {
        String[] people = new String[3];
        people[0] = "Abu";  
        people[1] = "Ali"; 
        people[2] = "Ramasamy"; 
        
        System.out.println(people[2]);
        Integer[] bil = new Integer[5];
        int[] jum = {1,2,4};
        
        for( int i = 0; i < jum.length; i++ ){
            System.out.println(jum[i]);
        }
        
    }
    
}
