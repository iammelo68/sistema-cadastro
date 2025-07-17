public class Pet {
    String petName, addressNumber, addressCity, addressStreet, petRace;
    int petAge;
    float petWeight;
    PetSex petSex;
    PetType petType;


    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getPetRace() {
        return petRace;
    }

    public void setPetRace(String petRace) {
        this.petRace = petRace;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public float getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(float petWeight) {
        this.petWeight = petWeight;
    }

    public PetSex getPetSex() {
        return petSex;
    }

    public void setPetSex(PetSex petSex) {
        this.petSex = petSex;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    @Override
    public String toString() {
        return "Pet {" +
                "\n  Nome: " + petName +
                "\n  Raça: " + petRace +
                "\n  Idade: " + petAge + " anos" +
                "\n  Peso: " + petWeight + " kg" +
                "\n  Sexo: " + (petSex != null ? petSex.name() : "não informado") +
                "\n  Tipo: " + (petType != null ? petType.name() : "não informado") +
                "\n  Endereço: Rua " + addressStreet + ", Nº " + addressNumber + ", " + addressCity +
                "\n}";
    }

}


