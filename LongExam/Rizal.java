package LongExam;

public class Rizal implements Locations {

    int airFare = 300;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}

