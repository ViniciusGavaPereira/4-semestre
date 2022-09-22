package Pattern;

public class Atrasada implements State{
    
    private final String nome = "Atrasado";
    private Context task;

    public Atrasada(Context task){
        this.task = task;
    }

    
    @Override 
    public void pendente(){
       System.out.println("A tarefa já está pendente");
        
    };

    @Override 
    public void concluida(){
        task.setEstado(new Concluida(task));
    }

    @Override 
    public void atrasada(){
        System.out.println("Esta tarefa já está atrasada");

    };

    @Override
	public String toString() {
		return "New state: " + nome;
	}

  
}
