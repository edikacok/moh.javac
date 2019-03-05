package chep5;

public class Person {
    String name;
    int age;
    String gender;
    private String statusKahwin;
    
    public String getstatusKahwin(String jenisOrang) {
        if (jenisOrang.equals("kanak2")) {
            return "Muda lagi";
        } else if(jenisOrang.equals("tansri")) {
            return "Janda";
        } else {
            return "Bujang";
        }
        //return this.statusKahwin;
    }
    
    void walk() {
        
    }
    
    void talk() {
        
    }
    
    void sing() {
        
    }
}
