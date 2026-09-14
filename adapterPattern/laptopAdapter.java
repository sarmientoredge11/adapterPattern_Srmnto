package adapterPattern;

public class laptopAdapter implements pwrOutlet {
    private laptop laptop;

    public laptopAdapter(laptop laptop){this.laptop = laptop; }



    @Override
    public void plugIn() {laptop.charge();}
}
