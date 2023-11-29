public class Perro {


    Boolean amigable=false;

    public Boolean getAmigable() {
        return amigable;
    }

    public void setAmigable(Boolean amigable) {
        this.amigable = amigable;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "amigable=" + amigable +
                '}';
    }


}
