import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User { //clase externa llamada Doctor

//Atributos
    private String speciality;
    Doctor(String name, String email) {
        super(name,email); //otro constructor qur toma dos argumentos como name y speciality

        System.out.println("El nombre del doctor es " + name);
        //se asignan esos valores a los atributos del obejto Doctor

        this.speciality = speciality;

    }


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>(); // se declara un arraylist la cual almacena objetos de la clase interna

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time)); // se agregan las fechas al array

    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){ // nos devuelve el array
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+ speciality + "\nAvailable: "+ availableAppointments.toString();
    }

    public static class AvailableAppointment { //clase interna
        private int id;
        private Date date;

        private String time;

        public AvailableAppointment(Date date, String time) { //Constructor
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment{" +
                    "date=" + date +
                    ", time='" + time + '\'' +
                    '}';
        }
    }


}
