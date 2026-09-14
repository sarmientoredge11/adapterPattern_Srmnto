package adapterPattern;

public class refAdapter implements pwrOutlet {
    private refridge refridge;

    public refAdapter(refridge refridge) { this.refridge = refridge; }

    @Override
    public void plugIn() {refridge.startCooling();}
}
