package batalhas;

import java.util.ArrayList;
import java.util.List;

public class RiftWalkers  extends Mecha{


    public RiftWalkers() {
    }
    List<Mecha> mechaSquad;

    List<Mecha> gerarRiftWalker(){

        Mecha Combat_Mecha = new Mecha(3,3);
        mechaSquad.add(Combat_Mecha);

        Mecha Cannon_Mecha = new Mecha(3,3);
        mechaSquad.add(Cannon_Mecha);

        Mecha Artillery_Mecha = new Mecha(2,3);
        mechaSquad.add(Artillery_Mecha);

        return mechaSquad;
    }
            

}
