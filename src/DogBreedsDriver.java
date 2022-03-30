public class DogBreedsDriver {
    public static void main(String[] args) {
        // create variable for each dog
        BullDog Max = new BullDog(500, "Non-Sporting", 50, 30);
        Boxer Rex = new Boxer(550, "Lap", 55, 35);
        Dachsund Cooper = new Dachsund(600, "Sporting", 60, 40);
        Dalmation Sam = new Dalmation(650, "Rescue", 65, 45);
        LabradorReteiver Toby = new LabradorReteiver(700, "Retriever", 70, 50);
        SaintBernard Teddy = new SaintBernard(75, "Water", 75, 55);
        // print information for each dog
        System.out.println("Max's information: ");
        System.out.println(Max);
        System.out.println("\nRex's information: ");
        System.out.println(Rex);
        System.out.println("\nCooper's information: ");
        System.out.println(Cooper);
        System.out.println("\nSam's information: ");
        System.out.println(Sam);
        System.out.println("\nToby's information: ");
        System.out.println(Toby);
        System.out.println("\nTeddy's information: ");
        System.out.println(Teddy);
        // change average cost for each dog
        Max.setAverageCost(250);
        Rex.setAverageCost(300);
        Cooper.setAverageCost(350);
        Sam.setAverageCost(400);
        Toby.setAverageCost(450);
        Teddy.setAverageCost(500);
        // print new average cost for each dog
        System.out.println("\nAverage cost of each dog after sale!");
        System.out.println("\nMax's new average cost: ");
        System.out.println("$" + Max.getAverageCost());
        System.out.println("\nRex's new average cost: ");
        System.out.println("$" + Rex.getAverageCost());
        System.out.println("\nCooper's new average cost: ");
        System.out.println("$" + Cooper.getAverageCost());
        System.out.println("\nSam's new average cost: ");
        System.out.println("$" + Sam.getAverageCost());
        System.out.println("\nToby's new average cost: ");
        System.out.println("$" + Toby.getAverageCost());
        System.out.println("\nTeddy's new average cost: ");
        System.out.println("$" + Teddy.getAverageCost());
    }
}