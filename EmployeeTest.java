package M.Encapsulations;

public class EmployeeTest {
    public static void main(String[] args) {
      EmployeeData E = new EmployeeData();
      E. Name = "Jhon";
      E. Surname = "Smith";
        System.out.println(E.Name);
        System.out.println(E.Surname);
        E.getAge();
        E.setAge(30);
        System.out.println(E.getAge());
    }
}
