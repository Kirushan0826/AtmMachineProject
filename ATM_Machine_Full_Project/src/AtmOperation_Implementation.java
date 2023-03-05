
import java.util.HashMap;
import java.util.Map;

public class AtmOperation_Implementation implements AtmOperationInterface
{
    Atm atm = new Atm();
    Map<Double, String> miniStmt = new HashMap<>();
    @Override
    public void viewBalance()
    {
        System.out.println("Available Balance is :" + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount)
    {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                miniStmt.put(withdrawAmount, " Amount withdrawn");
                System.out.println("Collect the cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance!!!!");
            }
        }
        else
        {
            System.out.println("Enter amount in multiple of 500!!");
        }
    }

    @Override
    public void depositAmount(double depositAmount)
    {
        miniStmt.put(depositAmount, " amount deposited.");
        System.out.println(depositAmount +" Deposited Successfully!!!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement()
    {
        for (Map.Entry<Double, String> m:miniStmt.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}
