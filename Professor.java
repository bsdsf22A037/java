public class Professor extends Staff{
    private double monthlySalary;
    public Professor(String name ,int ID ,String department,double monthlySalary){
            super(name,ID,department);
            this.monthlySalary = monthlySalary;
    }
    @Override
    public double  calculateSalary(){
        return monthlySalary;
    }
    @Override
    public String toString(){
        return super.toString() + "Position:Professor , Salary:"+ monthlySalary;
    }
  


}