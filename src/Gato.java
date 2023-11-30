public class Gato {
    Boolean leucemia;

    @Override
    public String toString() {
        return "Gato{" +
                "leucemia=" + leucemia +
                '}';
    }

    public Boolean getLeucemia() {
        return leucemia;
    }

    public void setLeucemia(Boolean leucemia) {
        this.leucemia = leucemia;
    }
}
