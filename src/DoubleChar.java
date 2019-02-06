public class DoubleChar {

    public String doubleChar(String str) {
        String r = "";
        for (int i = 0; i < str.length(); i++){
            r+=str.charAt(i);
            r+=str.charAt(i);
        }
        return r;
    }
    public static void main (String [] args) {
        DoubleChar x = new DoubleChar();
        DoubleChar y = new DoubleChar();
        DoubleChar z = new DoubleChar();
        System.out.println(x.doubleChar("The"));
        System.out.println(y.doubleChar("AAbb"));
        System.out.println(z.doubleChar("Hi-There"));

123
    }}
