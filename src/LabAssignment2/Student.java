package LabAssignment2;

public class Student{
    private String name;
    private int age;
    private String address;

    
    public void setInfo(String name,int age){
        this.name=name;
        this.age=age;
    }
     public void setInfo(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
     public void displayInfo(){
         System.out.printf("""
                 Name: %s
                 Age: %d
                 Address: %s
                 """,name,age,address);
            System.out.println("--------------------------");
}

      public static void main(String[] args){
          Student[] students = new Student[10];
          for(int i=0;i<students.length;i++){
          students[i]=new Student();  
          }
            String[][] studentData={
                {"John","18","Address1"},
                {"Jane","17","Address2"},
                {"Jack","19","Address3"},
                {"Jill","18","Address4"},
                {"James","17","Address5"},
                {"Jenny","19","Address6"},
                {"Joe","18","Address7"},
                {"Jade","17","Address8"},
                {"Jesse","19","Address9"},
                {"Jasmine","18","Address10"}
            };
            for(int i=0;i<students.length;i++){
                students[i].setInfo(studentData[i][0],Integer.parseInt(studentData[i][1]),studentData[i][2]);
            }

          for (Student student : students) {
              student.displayInfo();
          }
 
      }
     }
