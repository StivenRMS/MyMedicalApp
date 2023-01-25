import javax.print.Doc;

public class Doctor {
     static int id = 0;//Autoincrement
    String name;
    String email;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");

    }

    Doctor(String name, String speciality){
        id++;
        System.out.println("El nombre del doctor es " + name);
        this.name = name;
        this.speciality = speciality;

    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("id = " + id);
    }
    






}
