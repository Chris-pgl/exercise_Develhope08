public class Animal {

    public String animalName;

    public void animalName() {
       this.animalName = animalName;
    }


    void animalSound(){
        System.out.println("  Roarr! ");
    }

    void animalSound(String intensity){
        switch (intensity){
            case "high":
                System.out.println("Roarrrrrrr");
                break;
            case "low":
                System.out.println("Roar");
                break;
            default:
                System.out.println("cannot reproduce it poperly");
        }
    }



}
