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
        System.out.println();

        jeju.accept(me);
        System.out.println();

        baguio.accept(me);
        System.out.println();

        bohol.accept(me);
        System.out.println();

        rizal.accept(me);
        System.out.println();

        tagaytay.accept(me);
        System.out.println();

    }
}
