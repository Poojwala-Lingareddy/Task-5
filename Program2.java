//Write a Java Program that to Convert an Integer to String and float to Character  ?
class convert{
    public static void main(String[] args) {
        int num = 20;
        String st ="";
        st += num;
        float nums = 7.3f;
        String strFloat = Float.toString(nums);
        char ch = strFloat.charAt(0);
        System.out.println(ch);
    }
}