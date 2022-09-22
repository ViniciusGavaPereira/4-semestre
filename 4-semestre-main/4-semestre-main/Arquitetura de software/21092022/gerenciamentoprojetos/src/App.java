import Pattern.Context;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Context task = new Context();
        System.out.println(task.getEstado());
        task.requisitarAtrasada();
        task.requisitarConcluida();;
        task.requisitarPendente();;
    }
}
