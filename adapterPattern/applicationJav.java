package adapterPattern;

public class applicationJav {
    public static void main(String[] args) {

        pwrOutlet laptopOutlet = new laptopAdapter(new laptop());
        pwrOutlet refOutlet = new refAdapter(new refridge());
        pwrOutlet phoneOutlet = new spcAdapter(new spCharger());

        laptopOutlet.plugIn();
        refOutlet.plugIn();
        phoneOutlet.plugIn();

    }

}
