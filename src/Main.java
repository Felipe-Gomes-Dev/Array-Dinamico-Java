
public class Main {
    public static void main(String[] args) {
        MyList lista = new MyList(2);
        System.out.println("Array: " + lista.toArray());
        lista.add(1);
        lista.add(2);
        System.out.println("Array: " + lista.toArray());
        System.out.println("Contains valor 0: " + lista.contains(0));
        System.out.println("Contains valor 1: " + lista.contains(1));
        System.out.println("Elemento do índice 1: " + lista.get(1));
        lista.set(1, 3);
        System.out.println("Set valor 3 no índice 1");
        System.out.println("Elemento do índice 1: " + lista.get(1));
        System.out.println("Índice do valor 3: " + lista.indexOf(3));
        System.out.println("Array: " + lista.toArray());
        lista.remove(0);
        System.out.println("Removendo elemento do índice 0");
        System.out.println("Array: " + lista.toArray());
        lista.add(4);
        System.out.println("add valor 4 ");
        System.out.println("Array: " + lista.toArray());
        lista.removeValue(4);
        System.out.println("Removendo valor 4");
        System.out.println("Array: " + lista.toArray());
    }   
}
