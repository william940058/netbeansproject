package investmentviewermvc;

/**
 * Based on program in Big Java: Late Objects by Cay Horstmann; modified
 */
public class InvestmentCntl {

    private final InvestmentModel model;
    private final InvestmentView view;

    public InvestmentCntl() {
        model = new InvestmentModel();
        view = new InvestmentView(this);
        view.setVisible(true);
    }

    public double addInterest(double interestRate) {
        return model.addInterest(interestRate);
    }

    public double getInitialBalance() {
        return InvestmentModel.getINITIAL_BALANCE();
    }

    public double getDefaultRate() {
        return InvestmentModel.getDEFAULT_RATE();
    }
    
}


