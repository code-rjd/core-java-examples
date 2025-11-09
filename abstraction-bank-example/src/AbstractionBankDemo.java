import com.coderjd.abstraction.bank.service.SBIBankService;

public class AbstractionBankDemo {
    public static void main(String[] args) {
        SBIBankService sbibankService = new SBIBankService();
        sbibankService.openAccount();
        sbibankService.disburseLoan();
    }
}