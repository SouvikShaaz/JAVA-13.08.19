import java.util.Scanner;
class Mytime
 {
   int hh, mm, ss;
   public void getTime(int h, int m, int s)
   {
     ss= (s%60);
     mm= (m%60)+(s/60);
     hh= h+(m/60);
   }
   public void showTime()
   {
     System.out.print("TIME : "+hh+":"+mm+":"+ss);
   }
  }

class Time
 {
  static Scanner input;
  public static void main (String args[])
   {
  System.out.print ("Enter H: ");
  input=new Scanner (System.in);
  int h=input.nextInt();
  System.out.print ("Enter M: ");
  input=new Scanner (System.in);
  int m=input.nextInt();
  System.out.print ("Enter S: ");
  input=new Scanner (System.in);
  int s=input.nextInt();
  Mytime obj=new Mytime();
  obj.getTime(h,m,s);
  obj.showTime();
   } 
 }

