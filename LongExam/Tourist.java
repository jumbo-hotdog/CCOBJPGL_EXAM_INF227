package LongExam;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);
    void visit(Jeju jeju);
    void visit(Baguio baguio);
    void visit(Bohol bohol);
    void visit(Rizal rizal);
    void visit(Tagaytay tagaytay);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location.. ");
    };

    void checkBudget();
}
