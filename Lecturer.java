public class Lecturer extends Staff{
    private double pay;
    private double numberOfLectures;
    public Lecturer(String name ,int ID, String department, double pay, double numberOfLectures){
        super(name ,ID , department);
        this.pay = pay;
        this.numberOfLectures = numberOfLectures;

    }
    @Override
    public double calculateSalary(){
        return pay * numberOfLectures;
    }
    @Override
    public String toString(){
        return super.toString()+" LecturerSalary:"+ calculateSalary();
    }

}