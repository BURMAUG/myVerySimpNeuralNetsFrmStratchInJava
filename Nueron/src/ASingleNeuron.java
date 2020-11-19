//NAME: Burmau Garba
//INSPIRED BY AUTHORS HARRISON KINGSLEY & DANIEL kUKIELA
//BOOK: NEURAL NETWORK FROM SCRATCH
//DATE: 18. NOV. 2020
//DESCRIPTION: MY DESIRE IS TO THOROUGHLY UNDERSTAND WHAT A NEURAL NETWORK IS DOING

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ASingleNeuron {
    //this is a more efficient way of building a single neuron
    public static double singleNeuron(List<Double> weights, List<Double> inputs, double bias){
        double result = 0; //result for later computation
        //loop through the weight and inputs
        for(int i = 0; i <  weights.size(); i++)
            result += (weights.get(i) * inputs.get(i));  //calculate the dot product of the weights and inputs
        return result + bias; //add the bias and return the result
    }
    //THIS IS GOING TO BE FOR MATRIX MULTIPLICATION

    public static void main(String[] args) {
        List<Double> weights = new ArrayList<>();
        //List<Integer> w = new Arrays.asList(new int[] {1,2,3});
        //System.out.println(w);

        List<Double> inputs = new ArrayList<>();
        weights.add(1.0);
        weights.add(2.0);
        weights.add(3.0);
        // weights.add(2.5);

        inputs.add(0.2);
        inputs.add(0.8);
        inputs.add(-0.5);
        inputs.add(1.0);
        double result = 0;

        double res = singleNeuron(weights, inputs, 2);
        System.out.println(res);
//        trial in a line and inefficient way of going about it.
        double out = weights.get(0) * inputs.get(0) + weights.get(1)*inputs.get(1) + weights.get(2)*inputs.get(2) + 2;
        System.out.println("put: " + out);

        for(int i = 0; i < weights.size(); i++){
            result += (weights.get(i) * inputs.get(i)) ;
        }
        System.out.println(result + 2);

        int[] arr1 = {3,43,46,45,345};
        int[] arr2 = {356,643,846,745,345};
        int[][] arr3 = {arr1, arr2, {12,32,12,12,2}};
        System.out.println(arr3.length);
        System.out.println(arr3[2].length);
    }

}
