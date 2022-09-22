package Pattern;

public class Concluida implements State{
    private final String nome = "Concluida";
    private Context task;

     
    public Concluida(Context task){
        this.task = task;

    };

    @Override 
    public void pendente(){
        task.setEstado(new Pendente(task));
    };
    
    @Override
    public void concluida(){
      System.out.println("A tarefa já está concluida");

    };

    @Override 
    public void atrasada(){
        System.out.println("The task is already set to Completed");

    };

	@Override
	public String toString() {
		return "New state: " + nome;
	}

   
}
