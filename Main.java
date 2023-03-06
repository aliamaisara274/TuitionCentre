// application team in UTP
public class Main
{
  // application code
  public static void main(String[]args)
  {
    //creating object
    Student mike = new Student();
    Name name = new Name();
        name.setFName("Michael");
        name.setMName("Learns to");
        name.setLName("Rok");
        mike.setName(name);

    Student adila = new Student();
        name.setFName("Adila");
        name.setMName("binti");
        name.setLName("Izzat");
        adila.setName(name);


    Student imran = new Student();
        name.setFName("Syed");
        name.setMName("Imran");
        name.setLName("Ali");
        imran.setName(name);

    // creating a batch object
    StudentBatch sb2023 = new StudentBatch ();
        sb2023.add (mike);
        sb2023.add (adila, 0);
        sb2023.add(imran);

    // declare a method that allows for the following:
    boolean isIn = sb2023.find("Adlin");
    System.out.println(isIn);

    Teacher cikguminah = new Teacher ();

    for(int i = 0; i < 5; i++)
        mike.setMark(90, i);

    // calculate and print the avg
    System.out.println("Mike's average marks = " + mike.calcAvg());

    // calculate the min marks for mike
     System.out.println("Mike's minimum marks = " + mike.calcMin());
  }
}
