import java.util.stream.IntStream;
import java.util.stream.Stream;

class HelloWorld{

    public static void main(String[] args) {
        IntStream.range(1,5).forEach(s -> print("Hello World"));
    }

    private static void print(String s){
        //nice comment
        System.out.println(s);
    }

    public void foo(){}
}
