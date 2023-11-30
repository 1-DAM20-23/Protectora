public class Animal {
    Integer code;
    String name;
    String fechaNacimiento;



    @Override
    public String toString() {
        return "Animal{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


}
