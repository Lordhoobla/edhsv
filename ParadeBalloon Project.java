//NOTE: THIS IS NOT IN THE EDHESIVE PRODUCT
import java.util.Scanner;
import java.lang.String;
public Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    ParadeBalloon x=new ParadeBalloon();
    System.out.print("Enter Name of Balloon: ");
    int n=scan.next().toUpperCase();
    System.out.print("Enter Height of Balloon(feet): ");
    int h=scan.nextInt();
    System.out.print("Enter amount of helium: ");
    int he=scan.nextInt();
    ParadeBalloon y=new ParadeBalloon(name,h,he,1);
    System.out.print("Enter Name of Balloon: ");
    int n=scan.next().toUpperCase();
    System.out.print("Enter Height of Balloon(feet): ");
    int h=scan.nextInt();
    System.out.print("Enter amount of helium: ");
    int he=scan.nextInt();
    ParadeBalloon z=new ParadeBalloon(name,h,he,1);
    System.out.println(x+"\n"+y+"\n"+z);
    x.move(5);y.move(3);
    for(int i=0;i<5;i++){y.addHelium();}
    x.move(6);y.move(2);
    for(int i=0;i<6;i++){z.removeHelium();}
    z.move(5);
    System.out.println(z.distanceTo(y));
    System.out.print(x+"\n"+y+"\n"+z);
  }
}
