class InsuffiecientBalanceException extends Exception{
    InsuffiecientBalanceException(String msg){
        super(msg);
    }
}
public class CustomException {
    static void withdraw(int balance,int amount) throws InsuffiecientBalanceException{
        if(amount>balance){
            throw new InsuffiecientBalanceException("Balance is not sufficient");
        }
        System.out.println("Withdrawl successful");
    }
    public static void main(String[] args) {
        try{
            withdraw(2000,5000 );
        }catch(InsuffiecientBalanceException e){
            System.out.println(e.getMessage());
        }
        
    }
}
