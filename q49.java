import java.util.Scanner;

class employee {
   String first_name;
   String last_name;

   String getFirstName() {
      return first_name;
   }

   void setFirstName(String first_name) {
      this.first_name = first_name;
   }

   String getLastName() {
      return last_name;
   }

   void setLastName(String last_name) {
      this.last_name = last_name;
   }

}

class ContractEmployee extends employee {
   String department;
   String designation;
   double salary;

   void displayFullName() {
      System.out.println("full name :" + getFirstName() + " " + getLastName());
   }

   String getDepartment() {
      return department;
   }

   void setDepartment(String department) {
      this.department = department;
   }

   void setDesignation(String designation) {
      this.designation = designation;
   }

   String getDesignation() {
      return designation;
   }

}

class HourlyEmployee extends ContractEmployee {
   int hours;
   double wages;

   void calculateWages(int hours, double wages) {
      salary = hours * wages;
      System.out.println("the total salary of employee : " + salary);
   }

   String getDesignation() {
      return designation;
   }

   void setDesignation(String designation) {
      this.designation = designation;
   }
}

class WeeklyEmployee extends ContractEmployee {
   int week;
   double wages;

   void calculateWages(int week, double wages) {
      salary = week * wages;
      System.out.println("the total salary of employee : " + salary);
   }

   String getDesignation() {
      return designation;
   }

   void setDesignation(String designation) {
      this.designation = designation;
   }
}

class RegularEmployee extends employee {
   String department;
   String designation;
   double salary;

   void displayFullName() {
      System.out.println("full name :" + getFirstName() + " " + getLastName());
   }

   String getDepartment() {
      return department;
   }

   void setDepartment(String department) {
      this.department = department;
   }

   void setDesignation(String designation) {
      this.designation = designation;
   }

   String getDesignation() {
      return designation;
   }

   double getSalary() {
      return salary;
   }

   void setSalary(double salary) {
      this.salary = salary;
   }

}

public class q49 {
   public static void main (String[] args) {
      String fname;
      String lname;
      String dep;
      String desg;
      double salary;
      int designation;

      Scanner obj = new Scanner(System.in);
      System.out.println("enter the first name");
      fname = obj.nextLine();
      System.out.println("enter the last name");
      lname = obj.nextLine();
      System.out.println("enter the department");
      dep = obj.nextLine();

      System.out.println("chose your designation 1 for contract Employee 2 for regular employee ");
      designation = obj.nextInt();
      switch (designation) {
         case 1:
            ContractEmployee Ct = new ContractEmployee();
            int des;
            int hours;
            int weeks;
            double wages;
            Ct.setFirstName(fname);
            Ct.setLastName(lname);
            Ct.setDepartment(dep);

            String depa = Ct.getDepartment();

            System.out.println("enter the designation 1 for hourly employee 2 for weekly employee");
            des = obj.nextInt();
            switch (des) {
               case 1:
                  System.out.println("enter the working hours ");
                  hours = obj.nextInt();
                  System.out.println("enter the wages per hours ");
                  wages = obj.nextInt();
                  HourlyEmployee HE = new HourlyEmployee();
                  HE.setDesignation("Hourly Employee");
                  desg = HE.getDesignation();
                  Ct.displayFullName();
                  System.out.println("Department : " + depa);
                  System.out.println("Designation : " + desg);
                  HE.calculateWages(hours, wages);
                  break;

               case 2:
                  System.out.println("enter the working weeks ");
                  weeks = obj.nextInt();
                  System.out.println("enter the wages per weeks ");
                  wages = obj.nextInt();
                  WeeklyEmployee WE = new WeeklyEmployee();
                  WE.setDesignation("Hourly Employee");
                  desg = WE.getDesignation();
                  Ct.displayFullName();
                  System.out.println("Department : " + depa);
                  System.out.println("Designation : " + desg);
                  WE.calculateWages(weeks, wages);
                  break;

               default:
                  System.out.println("enter the right number");
                  break;
            }

            break;

         case 2:
            RegularEmployee Rg = new RegularEmployee();
            System.out.println("enter the salary");
            salary = obj.nextInt();
            Rg.setFirstName(fname);
            Rg.setLastName(lname);
            Rg.setDepartment(dep);
            Rg.setDesignation("REGULAR EMPLOYEE");
            Rg.setSalary(salary);

            depa = Rg.getDepartment();
            desg = Rg.getDesignation();
            salary = Rg.getSalary();

            Rg.displayFullName();
            System.out.println("Department : " + depa);
            System.out.println("Designation : " + desg);
            System.out.println("Salary : " + salary);
            break;

         default:
            System.out.println("enter right number ");
      }
      obj.close();
   }
}
