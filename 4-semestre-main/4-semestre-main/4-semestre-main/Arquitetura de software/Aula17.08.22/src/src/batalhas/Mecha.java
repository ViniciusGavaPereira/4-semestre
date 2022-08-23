package batalhas;

public class Mecha implements Prime, Brute, Science, Ranged {
    
    public int life, movement;

    public Mecha(int life, int movement) {
        super();
        this.life = life;
        this.movement = movement;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }


    //Prime
    @Override
    public void fist(){};

    @Override
    public void viceFist(){};

    @Override
    public void flame(){};

    @Override
    public void burst(){};

    @Override
    public void spartan(){};

    @Override
    public void eletric(){};

    @Override
    public void hydraulicLegs(){};

    //Brute
    @Override
    public void taurus(){};

    @Override
    public void aerial(){};

    @Override
    public void ramingEngines(){};

    @Override
    public void janus(){};

    @Override
    public void grapplingHook(){};

    @Override
    public void unstableCannon(){};

    @Override
    public void gravwell(){};


    //Science
    @Override
    public void repulse(){};

    @Override
    public void teleporter(){};

    @Override
    public void attractionPulse(){};

    @Override
    public void acid(){};



    @Override
    public void artemis(){};

    @Override
    public void cluster(){};



    //Ranged
    @Override
    public void rocket(){};

    @Override
    public void vulcan(){};

    @Override
    public void crioLauncher(){};

    @Override
    public void rock(){};

}
