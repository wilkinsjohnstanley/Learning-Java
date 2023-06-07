public class Pet{
    private PetName name;
    private Person owner;

    public Pet(PetName name, Person owner){
        this.name = name;
        this.owner = owner;
    }
    public PetName getName(){
        return name;
    }
    public void setName(PetName name){
        this.name = name;
    }
}
