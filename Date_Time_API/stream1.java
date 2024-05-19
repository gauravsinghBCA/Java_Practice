import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class stream1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> streamData = list.stream();
        streamData.forEach(i-> System.out.println(i));
    }
}
