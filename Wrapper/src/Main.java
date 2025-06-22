public class Main {
    public static void main(String[] args) {

    	
    	// Byte 
    	
        byte x = 10;
        Byte X = x;
        System.out.println("Wrapped Byte: " + X);
        byte y = X;
        System.out.println("Unboxed Byte: " + y);
        String byteStr = Byte.toString(x);
        System.out.println("Byte as String: " + byteStr);
        byte parsedByte = Byte.parseByte(byteStr);
        System.out.println("Parsed Byte: " + parsedByte);
        System.out.println();
        //Short 
        
        short s = 20;
        Short S = s;
        System.out.println("Wrapped Short: " + S);
        short t = S;
        System.out.println("Unboxed Short: " + t);
        String shortStr = Short.toString(s);
        System.out.println("Short as String: " + shortStr);
        short parsedShort = Short.parseShort(shortStr);
        System.out.println("Parsed Short: " + parsedShort);
        System.out.println();

        //Integer
        
        int i = 30;
        Integer I = i;
        System.out.println("Wrapped Integer: " + I);
        int j = I;
        System.out.println("Unboxed Integer: " + j);
        String intStr = Integer.toString(i);
        System.out.println("Integer as String: " + intStr);
        int parsedInt = Integer.parseInt(intStr);
        System.out.println("Parsed Integer: " + parsedInt);
        System.out.println();

        
        // Long
        
        long l = 40L;
        Long L = l;
        System.out.println("Wrapped Long: " + L);
        long m = L;
        System.out.println("Unboxed Long: " + m);
        String longStr = Long.toString(l);
        System.out.println("Long as String: " + longStr);
        long parsedLong = Long.parseLong(longStr);
        System.out.println("Parsed Long: " + parsedLong);
        System.out.println();

        //Float 
        
        float f = 50.5f;
        Float F = f;
        System.out.println("Wrapped Float: " + F);
        float g = F;
        System.out.println("Unboxed Float: " + g);
        String floatStr = Float.toString(f);
        System.out.println("Float as String: " + floatStr);
        float parsedFloat = Float.parseFloat(floatStr);
        System.out.println("Parsed Float: " + parsedFloat);
        System.out.println();

        //Double
        
        double d = 60.6;
        Double D = d;
        System.out.println("Wrapped Double: " + D);
        double h = D;
        System.out.println("Unboxed Double: " + h);
        String doubleStr = Double.toString(d);
        System.out.println("Double as String: " + doubleStr);
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println("Parsed Double: " + parsedDouble);
        System.out.println();

        //Char
        
        char c = 'A';
        Character C = c;
        System.out.println("Wrapped Character: " + C);
        char k = C;
        System.out.println("Unboxed Character: " + k);
        String charStr = Character.toString(c);
        System.out.println("Character as String: " + charStr);
        char parsedChar = charStr.charAt(0);
        System.out.println("Parsed Character: " + parsedChar);
        System.out.println();


        //Boolean
        
        boolean b = true;
        Boolean B = b;
        System.out.println("Wrapped Boolean: " + B);
        boolean n = B;
        System.out.println("Unboxed Boolean: " + n);
        String boolStr = Boolean.toString(b);
        System.out.println("Boolean as String: " + boolStr);
        boolean parsedBool = Boolean.parseBoolean(boolStr);
        System.out.println("Parsed Boolean: " + parsedBool);
    }
}
