public class  Demo3{
    public static void main(String[] args){

        int result = add(2,3);
        int result2 = add(3,4,5);
        double result3 = add(5.2,6.3);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }
    static int add(int a, int b){
        return a+b;
    }

    static int add (int a ,int b, int c){
        return a+b+c;
    }

    static double add(double a, double b){
        return a+b;
    }
}