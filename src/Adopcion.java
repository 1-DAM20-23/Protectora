public class Adopcion {
    Integer code;
    String adoptionDate;
    String animalName;
    String PeopleName;

    @Override
    public String toString() {
        return "Adopcion{" +
                "code=" + code +
                ", adoptionDate='" + adoptionDate + '\'' +
                ", animalName='" + animalName + '\'' +
                ", PeopleName='" + PeopleName + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(String adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getPeopleName() {
        return PeopleName;
    }

    public void setPeopleName(String peopleName) {
        PeopleName = peopleName;
    }
}
