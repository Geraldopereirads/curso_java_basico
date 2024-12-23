package entities;

public class Company extends TaxPayer {
    private Integer numberOfemployees;


    public Company(String name, Double anualIncome, double income, Integer numberOfemployees) {
        super(name, anualIncome);
        this.numberOfemployees = numberOfemployees;
    }


    public Integer getNumberOfemployees() {
        return numberOfemployees;
    }

    public void setNumberOfemployees(Integer numberOfemployees) {
        this.numberOfemployees = numberOfemployees;
    }

    @Override
    public double tax() {
        if (numberOfemployees > 10) {
            return getAnualIncome() * 0.14;
        }
        else {
            return getAnualIncome() * 0.16;
        }

    }

}
