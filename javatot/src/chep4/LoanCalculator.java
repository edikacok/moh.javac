package chep4;

public class LoanCalculator extends Calculator {
    
    //public void info() {
        //tak boleh sebab parent info() dah final
    //}
   
    public void cetak() {
        System.out.println("Cetak LoanCalculator");
    }
    int jumlah;
    public static void main(String[] args) {
        LoanCalculator cal = new LoanCalculator();
        cal.cetak();
        LoanCalculator cal2 = new LoanCalculator(1);
    }
    
    LoanCalculator() {
        //super();
        System.out.println("i'm in constructor");
    
    }
    LoanCalculator(int amount) {
        this.jumlah = amount;
        System.out.println("i'm in constructor 2");
    }
    private int calcLoanPayment(int amount, int numberOfMonth, String state) {
        return 0;
    }
    
    int calcLoanPayment(int amount) {
        return 0;
    }
    
}
