import dio.Inovation.ListaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args){

        ListaDuplamenteEncadeada<String> minhaLinhaEncadeada = new ListaDuplamenteEncadeada<String>();

        minhaLinhaEncadeada.add("c1");
        minhaLinhaEncadeada.add("c2");
        minhaLinhaEncadeada.add("c3");
        minhaLinhaEncadeada.add("c4");
        minhaLinhaEncadeada.add("c5");
        minhaLinhaEncadeada.add("c6");
        minhaLinhaEncadeada.add("c7");

        System.out.println(minhaLinhaEncadeada);
        minhaLinhaEncadeada.remove(3);
        minhaLinhaEncadeada.add(3,"99");
        System.out.println(minhaLinhaEncadeada);
        System.out.println(minhaLinhaEncadeada.get(3));
    }
}
