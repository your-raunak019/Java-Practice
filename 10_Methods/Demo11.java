// Write a method that takes a String name and an int age, and returns a sentence combining both.

public class Demo11 {

    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        String sentence = createSentence(name, age);
        System.out.println(sentence);
    }

    static String createSentence(String name, int age) {
        return "My name is " + name + " and I am " + age + " years old.";
    }
}