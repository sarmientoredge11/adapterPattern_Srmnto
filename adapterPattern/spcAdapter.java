package adapterPattern;

public class spcAdapter implements pwrOutlet {
    private spCharger spCharger;

    public spcAdapter(spCharger spCharger) { this.spCharger = spCharger; }

    @Override
    public void plugIn() {spCharger.chargePhone();}
    }

