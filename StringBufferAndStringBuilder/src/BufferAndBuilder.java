public class BufferAndBuilder {
    public static void main(String[] args) {
        
        // =================== STRINGBUFFER DEMO ===================
        System.out.println("===== StringBuffer Methods =====");
        
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb); // Output: Hello

        // append() - Adds string at the end
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // insert() - Inserts string at given index
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // Output: Hello Java World

        // replace() - Replaces characters from index start to end with given string
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb); // Output: Hello C++ World

        // delete() - Deletes characters from index start to end
        sb.delete(6, 10);
        System.out.println("After delete: " + sb); // Output: Hello  World

        // reverse() - Reverses the string
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW  olleH
        
        // Reversing back to original for further use
        sb.reverse();

        // capacity() - Returns the current capacity of the buffer
        System.out.println("Capacity: " + sb.capacity()); // Default capacity: 16 + length of string
        
        // length() - Returns the length of the string
        System.out.println("Length: " + sb.length()); // Output: 12

        // setCharAt() - Sets a character at a specified index
        sb.setCharAt(6, 'X');
        System.out.println("After setCharAt: " + sb); // Output: Hello Xorld

        // ensureCapacity() - Ensures that the capacity is at least equal to the specified minimum
        sb.ensureCapacity(50);
        System.out.println("After ensureCapacity(50), Capacity: " + sb.capacity()); // Output: >=50

        System.out.println("\n");

        // =================== STRINGBUILDER DEMO ===================
        System.out.println("===== StringBuilder Methods =====");

        StringBuilder sbuilder = new StringBuilder("Java");
        System.out.println("Original StringBuilder: " + sbuilder); // Output: Java

        // append() - Adds string at the end
        sbuilder.append(" Programming");
        System.out.println("After append: " + sbuilder); // Output: Java Programming

        // insert() - Inserts string at given index
        sbuilder.insert(5, "is ");
        System.out.println("After insert: " + sbuilder); // Output: Java is Programming

        // replace() - Replaces characters from index start to end with given string
        sbuilder.replace(8, 19, "Fun");
        System.out.println("After replace: " + sbuilder); // Output: Java is Fun

        // delete() - Deletes characters from index start to end
        sbuilder.delete(5, 8);
        System.out.println("After delete: " + sbuilder); // Output: Java Fun

        // reverse() - Reverses the string
        sbuilder.reverse();
        System.out.println("After reverse: " + sbuilder); // Output: nuF avaJ
        
        // Reversing back to original for further use
        sbuilder.reverse();

        // capacity() - Returns the current capacity of the builder
        System.out.println("Capacity: " + sbuilder.capacity()); // Default capacity: 16 + length of string
        
        // length() - Returns the length of the string
        System.out.println("Length: " + sbuilder.length()); // Output: 8

        // setCharAt() - Sets a character at a specified index
        sbuilder.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sbuilder); // Output: Java Xun

        // ensureCapacity() - Ensures that the capacity is at least equal to the specified minimum
        sbuilder.ensureCapacity(50);
        System.out.println("After ensureCapacity(50), Capacity: " + sbuilder.capacity()); // Output: >=50
    }
}
