public abstract class Staff{
    String name;
    int ID ;
    String department;

    public Staff(String name,int ID ,String department){
    this.name = name ;
    this.ID = ID ;
    this.department = department;
    }
    abstract double calculateSalary();
    @Override
    public String toString(){
            return "Staff ID " + ID + "name:"+ name+"department:"+ department; 
    }
}