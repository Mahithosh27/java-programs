
public class bank {

    bank(int principle, int rate, int year) {
        int interest = (principle * rate * year) / 100;
        System.out.println(interest);

    }

    public static void main(String[] args) {
        new sbi(100, 12, 1);
        new hdfc(2000, 13, 2);
        new kvb(3000, 14, 9);
        new ibm(400, 15, 11);

    }

}

class sbi extends bank {
    sbi(int principle, int rate, int year) {
        super(principle, rate, year);
    }

}

class hdfc extends bank {
    hdfc(int principle, int rate, int year) {
        super(principle, rate, year);
    }

}

class kvb extends bank {
    kvb(int principle, int rate, int year) {
        super(principle, rate, year);
    }

}

class ibm extends bank {
    ibm(int principle, int rate, int year) {
        super(principle, rate, year);

    }
}