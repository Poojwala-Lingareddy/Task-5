//Write a Java Program that to print Fibonacci Series up to N Terms ?
class fibo{
    public static void main(String[] args){
        int N = 9;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=N-2;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        
    }
}