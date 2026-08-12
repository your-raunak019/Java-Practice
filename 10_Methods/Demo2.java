public class Demo2 {
    public static void main(String [] args){
        
        System.out.println("From first method");
        myName("Md Rounak Ansari");
        System.out.println("_________________________");

        System.out.println("From second method");
        int mul = product(6,7);
        System.out.print("Product is: "+mul);
        System.out.println("\n_________________________");

        System.out.println("From third method");
        printDivider();

    }

    static String myName(String name){
        for (int i = 1; i<= 5; i++){
            System.out.println(i + ". "+name);
        }
        return name;
    }

    static int product(int a, int b){
        return a*b;
    }

    static void printDivider() {
        System.out.println("------------------------");
    }
    
}