public class Strings_builder {
    public static void main(String[] args) {

       // StringBuilder sb = new StringBuilder("Khan Muhammad");
        //System.out.println(sb);

        //Char at index 0 -->K
       // System.out.println(sb.charAt(0));

        //replace index of 0
        // sb.setCharAt(0, 'k');
        // sb.setCharAt(5, 'm');
        // System.out.println(sb);

        //insert any thing 
        // sb.insert(13, " Abro");
        // System.out.println(sb);


        //Delete any part of String
        // StringBuilder sb = new StringBuilder("Khan Muhammad");
        // sb.delete(0, 5);
        // System.out.println(sb);

        // Append --> to add in last
        // sb.append(" Abro");
        // System.out.println(sb);

        //length
        //System.out.println(sb.length());

        //Reverse String

        StringBuilder sb = new StringBuilder("Khan");
        //System.out.println(sb.reverse());
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
        
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
        
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}