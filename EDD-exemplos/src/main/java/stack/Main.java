package stack;

import dio.innovation.Carro;

import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Hyundai"));
        stackCarros.push(new Carro("Honda"));
        stackCarros.push(new Carro("Wolks"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

    }
}
