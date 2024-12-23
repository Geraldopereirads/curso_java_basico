package entities;

public class Individual extends TaxPayer {
    private Double heathExpenditures;


    public Individual() {

    }


    public Individual(String name, Double anualIncome, Double heathExpenditures) {
        super(name, anualIncome);
        this.heathExpenditures = heathExpenditures;
    }

    public Double getHeathExpenditures() {
        return heathExpenditures;
    }

    public void setHeathExpenditures(Double heathExpenditures) {
        this.heathExpenditures = heathExpenditures;
    }

    @Override
    public double tax() {
        double basicTax;
        if (getAnualIncome() < 20000.00) {
            basicTax = getAnualIncome() * 0.15;
        } else {
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHeathExpenditures() * 0.5;
        if (basicTax < 0.0) {
            return 0.0;
        }
        return basicTax;
    }
}
