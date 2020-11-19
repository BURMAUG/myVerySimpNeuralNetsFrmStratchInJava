import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ASingleNeuron {

    public static void main(String[] args) {
        List<Integer> weights = new ArrayList<>();
        List<Double> inputs = new ArrayList<>();
        weights.add(1);
        weights.add(2);
        weights.add(3);

        inputs.add(0.2);
        inputs.add(0.8);
        inputs.add(-0.5);
        double result = 0;
        for(int i = 0; i < weights.size(); i++){
           result += (weights.get(i) * inputs.get(i)) ;
        }
        System.out.println(result + 2);
    }
}
