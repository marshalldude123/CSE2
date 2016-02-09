// Marshall Stallings
// Hw 02
public class Arithmetic{
    public static void main(String[] args) {
        // Number of pairs of pants
        int numPants = 3;
        // Cost per pair of pants
        double pantsPrice = 34.98;
        // Number of shirts
        int numShirts = 2;
        // Cost per shirt
        double shirtPrice = 24.99;
        // Number of belts
        int numBelts = 1;
        // Cost per belt
        double beltPrice = 33.99;
        // Tax rate
        double paSalesTax = 0.06;
        //
        // Calculate totals for each iteam
        //
        // Total cost for pants
        double totalCostPants = (numPants * pantsPrice);
        // Total cost for shirts
        double totalCostShirts = (numShirts * shirtPrice);
        // Total cost for belts
        double totalCostBelt = (numBelts * beltPrice);
        //
        // Calculate sales tax on each item
        //
        // Sales tax for pants
        double pantsTax = (pantsPrice * paSalesTax);
        // Sales tax for shirts
        double shirtsTax = (shirtPrice * paSalesTax);
        // Sales tax for belts
        double beltTax = (beltPrice * paSalesTax);
        //
        // Pants total with tax
        double pantsCostTax = totalCostPants * pantsTax;
        // Calculate overall total with no tax
        double overallTotal = (totalCostPants + totalCostShirts + totalCostBelt);
        // Calculate overall sales tax
        double overallTaxTotal = (pantsTax + shirtsTax + beltTax);
        // Calculate overall total with tax
        double overallTotalTax = ((overallTotal * paSalesTax) + overallTotal);
        //
        // Round all numbers to two decimals
        // Round Pants with Tax
        double pantsCostTax1 = Math.round(pantsCostTax * 100);
        double pantsCostTax2 = pantsCostTax1 / 100;
        // Round Pants
        double totalCostPants1 = Math.round(totalCostPants * 100);
        double totalCostPants2 = totalCostPants1 / 100;
        // Round Shirts
        double totalCostShirts1 = Math.round(totalCostShirts * 100);
        double totalCostShirts2 = totalCostShirts1 / 100;
        //Round belts
        double totalCostBelt1 = Math.round(totalCostBelt * 100);
        double totalCostBelt2 = totalCostBelt1 / 100;
        // Round pant tax
        double pantsTax1 = Math.round(pantsTax * 100);
        double pantsTax2 = pantsTax1 / 100;
        // Round shirt tax
        double shirtsTax1 = Math.round(shirtsTax * 100);
        double shirtsTax2 = shirtsTax1 / 100;
        // Round belt tax
        double beltTax1 = Math.round(beltTax * 100);
        double beltTax2 = beltTax1 / 100;
        // Round total cost
        double overallTotal1 = Math.round(overallTotal * 100);
        double overallTotal2 = overallTotal1 / 100;
        // Round total tax
        double overallTaxTotal1 = Math.round(overallTaxTotal * 100);
        double overallTaxTotal2 = overallTaxTotal1 / 100;
        // Round total with tax
        double overallTotalTax1 = Math.round(overallTotalTax * 100);
        double overallTotalTax2 = overallTotalTax1 / 100;
        //
        // Print out values
        System.out.println("The cost of the pants without tax is $" + totalCostPants2);
        System.out.println("The tax on the pants is $" + pantsTax2);
        System.out.println("The cost of the pants including tax is $" + pantsCostTax2);
        System.out.println(" ");
        System.out.println("The cost of the shirts without tax is $" + totalCostShirts2);
        System.out.println("The tax on the shirts is $" + shirtsTax2);
        System.out.println("The cost of the pants including tax is $" + (totalCostShirts2 + shirtsTax2));
        System.out.println(" ");
        System.out.println("The cost of the belts without tax is $" + totalCostBelt2);
        System.out.println("The tax on the belts is $" + beltTax2);
        System.out.println("The cost of the belts including tax is $" + (totalCostBelt2 + beltTax2));
        System.out.println(" ");
        System.out.println("The total cost without tax is $" + overallTotal2);
        System.out.println("The total tax is $" + overallTaxTotal2);
        System.out.println("The total cost including tax is $" + overallTotalTax2);
    }
}