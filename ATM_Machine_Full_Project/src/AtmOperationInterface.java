public interface AtmOperationInterface
{
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount); /*
                                            What amount the user wants to withdraw, that will be gotten from the user
                                            so withdrawAmount will be the parameter*/
    public void depositAmount(double depositAmount);
    public void viewMiniStatement();
}
