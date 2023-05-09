package LongExam;

public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay.");
    }

    public void visit(Boracay boracay) {

        System.out.println("Budget is " + budget +".");
        if(budget >= boracay.airFare) {
            System.out.print("Enjoying my summer vacation in Boracay.");
            budget = budget - boracay.airFare;
            System.out.println(" Current budget is " + budget +".");    
        } else
            System.out.println("You do not have enough budget to go to Boracay.");
    }

    public void visit(Jeju jeju) {

        System.out.println("Budget is " + budget +".");
        if(budget >= jeju.airFare) {
            System.out.print("Relaxing in Jeju island.");
            budget = budget - jeju.airFare;
            System.out.println(" Current budget is " + budget +".");    
        } else
            System.out.println("You do not have enough budget to go to Jeju.");

    }

    public void visit(Baguio baguio) {

        System.out.println("Budget is " + budget +".");
        if(budget >= baguio.airFare) {
            System.out.print("Having fun in baguio.");
            budget = budget - baguio.airFare;
            System.out.println(" Current budget is " + budget +".");    
        } else
            System.out.println("You do not have enough budget to go to Baguio.");
    }

    public void visit(Bohol bohol) {

        System.out.println("Budget is " + budget +".");
        if(budget >= bohol.airFare) {
            System.out.print("Taking a tour in Chocolate hills.");
            budget = budget - bohol.airFare;
            System.out.println(" Current budget is " + budget +".");    
        } else
            System.out.println("You do not have enough budget to go to Bohol.");
    }


    public void visit(Rizal rizal) {

        System.out.println("Budget is " + budget +".");
        if(budget >= rizal.airFare) {
            System.out.print("Having a staycation in Rizal.");
            budget = budget - rizal.airFare;
            System.out.println(" Current budget is " + budget +".");    
        } else
            System.out.println("You do not have enough budget to go to Rizal.");
    }
    
    public void visit(Tagaytay tagaytay) {

        System.out.println("Budget is " + budget +".");
        if(budget >= tagaytay.airFare) {
            System.out.print("Freezing in Tagaytay.");
            budget = budget - tagaytay.airFare;
            System.out.println(" Current budget is " + budget +".");    
        } else
            System.out.println("You do not have enough budget to go to Tagaytay.");
    }

    public void checkBudget() {
        System.out.println(" My budget is " + budget + ".");
    }

}
