import java.util.Scanner;

class Example7{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a=0;
        System.out.println("Enter number : ");
      a=sc.nextInt();
      if(a<0)
        System.out.println(a+ "is neg");
      else
        System.out.println(a+ "is pos");
    }
}