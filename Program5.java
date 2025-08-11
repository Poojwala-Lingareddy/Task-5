//Write a Java Program that to Convert all uppercase letters into  lowercase and lowercase letters into uppercase in String ?
class convert{
    public static void main(String[] args) {
        String st = "Poojwala Lingareddy";
        String st2 = "";
        for (int i=0;i<st.length();i++) {
            char ch = st.charAt(i);
            if ( ch >= 'A' && ch <= 'Z') { 
                st2 += Character.toLowerCase(ch);
            } 
            else if (ch >= 'a' && ch <= 'z') { 
                st2 += Character.toUpperCase(ch);
            } 
            else {
                st2 += ch;
            }
        }
        System.out.println("Converted: "+st2);
    }
}