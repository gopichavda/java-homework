package M.Encapsulations;

public class EmployeeData {
    public String Name;
    public String Surname;
    private int Age;

    public void getEmpName(){
        System.out.println("EmpName");
    }
    public void getEmpSurname(){
        System.out.println("EmpSurname");
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public int getAge(){
        return Age;
    }
}



