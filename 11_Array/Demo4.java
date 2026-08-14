// Linear search — find an item's index

public class Demo4 {
    public static void main(String[] args) {
        String[] names = {"Rounak","Ankit","Aman","Badshah","Piyush","Rishu","Altaf"};

        String target = "Piyush";
        int foundIndex = -1;

        for (int i = 0; i < names.length; i++){
            if (names[i].equals(target)){
                foundIndex = i;
                break;
            }
        }

        System.out.println("Targeted Name Found at Index: " +foundIndex);
        
    }
}