package Facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        System.out.println(bins.sum("0011", "0110"));
        System.out.println(bins.mult("0011", "0110"));
    }
}
