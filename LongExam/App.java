package LongExam;

public class App {
    public static void main(String[] args) throws Exception {

        Locations boracay = new Boracay();
        Locations jeju = new Jeju();
        Locations baguio = new Baguio();
        Locations bohol = new Bohol();
        Locations rizal = new Rizal();
        Locations tagaytay = new Tagaytay();

        Tourist me = new Me();

        boracay.accept(me);
        jeju.accept(me);
        baguio.accept(me);
        bohol.accept(me);
        rizal.accept(me);
        tagaytay.accept(me);

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

    }
}
