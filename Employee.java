public class Employee {
    name="Ahmed Mohamed Ali";
    id=2;
    age=24;
    position="Data Engineer";
    salary=10000;



public Employee(String name,int id,int age, String position,int salary){
        this.name=name;
        this.id=id;
        this.age=age;
        this.position=position;
        this.salary=salary;

    }
    public void print_Employee(){
        System.out.println("Employee Name:"+ name);
        System.out.println("Id: "+ id);
        System.out.println("Age :"+ age);
        System.out.println("Position:"+ position);
        System.out.println("Salary:"+ salary);


    }
}
