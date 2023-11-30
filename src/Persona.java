public class Persona {
    String name;
    String surnames;
    String dni;
    Integer phone;

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", dni='" + dni + '\'' +
                ", phone=" + phone +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
