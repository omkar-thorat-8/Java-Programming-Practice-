public class Main {
    public static void main(String[] args) {
        String str = new String("Firstbit Solutions Pune");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println();
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
