public class Patient extends User{

    private String birthday;


    private double weight;




    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    private  double height;
    private String blood;

    Patient(String name, String email) {
        super(name,email); //sse quitaron los atributos para no redundar pero si se usan dentro del super


    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + "Kg. ";
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday+ "\n Weight: " +getWeight()+
                "Height"+ getHeight()+"\nBlood"+blood;
    }
}
