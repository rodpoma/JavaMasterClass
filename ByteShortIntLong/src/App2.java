public class App2 {
    public static void main(String[] args) {
    
        //Integer, Byte, Short and Long are wrapper classes. Gives you ways to use operations.

        // int range is -2147483648 to 2147483647. Occupies 32 bits
        // int myMinIntValue = Integer.MIN_VALUE;
        // int myMaxIntValue = Integer.MAX_VALUE;
        // System.out.println("Integer Minimum Value = " + myMinIntValue);
        // System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        // System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));

        // byte is a smaller data type with a range of -128 to 127. Occupies 8 bits
        // byte myMinByteValue = Byte.MIN_VALUE;
        // byte myMaxByteValue = Byte.MAX_VALUE;
        // System.out.println("Byte Minimum Value = " + myMinByteValue);
        // System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // short range from -32768 to 32768. Occupies 16 bits
        // short myMinShortValue = Short.MIN_VALUE;
        // short myMaxShortValue =Short.MAX_VALUE;
        // System.out.println("Short Minimum Value = " + myMinShortValue);
        // System.out.println("Short Maximum Value = " + myMaxShortValue);

        // long myLongValue = 2147483648L; //the 'L' will allow you to put use a number outside of the int range
        // Long range from -9223372036854775808 to 9223372036854775807. Occupies 64 bits
        // long myMinLongValue = Long.MIN_VALUE;
        // long myMaxLongValue =Long.MAX_VALUE;
        // System.out.println("Long Minimum Value = " + myMinLongValue);
        // System.out.println("Long Maximum Value = " + myMaxLongValue);
        // System.out.println(myLongValue);

        // int myTotal = (myMinIntValue/2);

        // Casting: used to convert a number from one type to another. In the following cases, because java will read the variable as an int because its over the literal 2.
        // byte myNewByteValue = (byte)(myMinByteValue/2);

        // short myNewShortValue = (short)(myMinShortValue/2);

        // Primitive Types Challenge:

        byte challengeByte = 100;

        short challengeShort = 30000;

        int challengeInt = 1000000;

        long challengeLong = 50000L + (10L * (challengeByte + challengeInt + challengeShort));
        System.out.println(challengeLong);



    }
}
