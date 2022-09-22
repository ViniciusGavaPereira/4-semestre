package Pattern;

public class Pendente implements State{
    

    private final String nome = "Pendente";
    private Context task;
    
    public Pendente(Context task){

        this.task = task;
        
    }

    @Override 
    public void pendente(){
        System.out.println("Esta tarefa já está pendente");

    };

    
    @Override 
    public void concluida(){

        task.setEstado(new Concluida(task));
    }

    @Override 
    public void atrasada(){
      task.setEstado(new Atrasada(task));

    };

    @Override
    public String toString() {
        return "Pendente [nome=" + nome + ", tarefa=" + task + "]";
    };
    
}
