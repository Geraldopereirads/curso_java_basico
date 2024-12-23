package entities;

public class Individual extends TaxPayer {
    private Double heathExpenditures;


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
        double tax;
        if (getAnualIncome() < 20000.00) {
            tax = getAnualIncome() * 0.15;
        } else {
            tax = getAnualIncome() * 0.25;
        }
        tax -= getHeathExpenditures() * 0.5;
        if (tax < 0.0) {
            return 0.0;
        }
        return tax;
    }
}
