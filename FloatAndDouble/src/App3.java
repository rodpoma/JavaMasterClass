public class App3 {
    public static void main(String[] args) {

        //float and double used for non-whole numbers

        // float Single precision occupies 32 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min = " + myMinFloatValue);
        System.out.println("Float Max = " + myMaxFloatValue);

        // double precision occupies 64 bits
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min = " + myMinDoubleValue);
        System.out.println("Double Max = " + myMaxDoubleValue);

        // d or f allows for decimals, or by casting
        int myIntValue = 5/3; //int will round down to 2
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d; //twice as precise as the float
        System.out.println("IntValue = "+ myIntValue);
        System.out.println("FloatValue = "+ myFloatValue);
        System.out.println("DoubleValue = "+ myDoubleValue);

        // Challenge
        int myWeight = 220;
        double myWeightKilo = myWeight * .45359237d;
        System.out.println("My Weight in Kilograms: " + myWeightKilo);
        
    }
}
