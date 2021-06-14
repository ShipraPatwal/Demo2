// java program to print your name and roll number

class student
{
  String Name;
  double roll_number;

student()
{
 Name = "Shipra";
 roll_number = 1922062;

}
void show()
{
  System.out.println("Name of the Student is"+Name);
 System.out.println("Roll_No of the Student is"+roll_number);
}
 class qn2
{
 public static void main(String[] args)
{
   student st = new student();
   st.show();
}
}
}
