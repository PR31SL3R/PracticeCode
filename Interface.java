import java.util.Random; 
import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Interface{

//gets input from user
public void getUserInput()throws InterruptedException{
System.out.println("press 1 for Hello World\n press 2 for Calc\n Press 3 for quit\n Press 4 for Kitchen");
Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a==2){
        runCalculator();}
        if (a==1){
        runHelloWorld();}
        if (a==3){
        System.out.println("you have quit");}
        if (a==4){
        System.out.println("I am running the Kitchen");
        runKitchenStoveFlame();
        }
        }
//Runs HelloWorld
public void runHelloWorld()throws InterruptedException{
        HelloWorld myWorld = new HelloWorld();
        myWorld.printer();
        TimeUnit.SECONDS.sleep(1);
        Interface newUser = new Interface();
        newUser.getUserInput();
        
}

public void runKitchenStoveFlame(){
Stove myStove = new Stove(220);
while (1==1){
System.out.println("You have the following options. Set flame get flame get voltage set voltage");
Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1){System.out.println("you chose add\n enter two numbers");
        int b = in.nextInt();
        int c = in.nextInt();
        myStove.flame1.setFlame(2);
        }







}
}


// Runs Calculator 
public void runCalculator()throws InterruptedException{
Calculator myCalc = new Calculator();
System.out.println("I am running the calculator");

while (1==1){
System.out.println("Press 1 for add");
System.out.println("Press 2 for subtract");
System.out.println("Press 3 for multiply");
System.out.println("Press 4 for divide");
System.out.println("Press 5 for modulo");
System.out.println("Press 6 to quit");

Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1){System.out.println("you chose add\n enter two numbers");
        int b = in.nextInt();
        int c = in.nextInt();
        myCalc.add(b,c);
        TimeUnit.SECONDS.sleep(1);
        }
        if (a == 2){System.out.println("you chose substract\n enter two numbers");
        int b = in.nextInt();
        int c = in.nextInt();
        myCalc.subtract(b,c);
        TimeUnit.SECONDS.sleep(1);
        }
        if (a == 3){System.out.println("you chose multiply\n enter two numbers");
        int b = in.nextInt();
        int c = in.nextInt();
        myCalc.multiply(b,c);
        TimeUnit.SECONDS.sleep(1);
        }
        if (a == 4){System.out.println("you chose divide\n enter two numbers");
        int b = in.nextInt();
        int c = in.nextInt();
        myCalc.divide(b,c);
        TimeUnit.SECONDS.sleep(1);
        }
        if (a == 5){System.out.println("you chose modulo\n enter two numbers");
        int b = in.nextInt();
        int c = in.nextInt();
        myCalc.modulo(b,c);
        TimeUnit.SECONDS.sleep(1);
        }
        if (a == 6){System.out.println("you chose quit");
        getUserInput();}
        if (a == 7){
        int b = in.nextInt();
        int c = in.nextInt();
System.out.println("test");
        myCalc.procent(b,c);}

}
}
//Runs startup Sequence
public void startUpSequence()throws InterruptedException{

System.out.println("Program is booting");
  TimeUnit.SECONDS.sleep(3);
  System.out.println("3......");
  TimeUnit.SECONDS.sleep(1);
  System.out.println("2......");
  TimeUnit.SECONDS.sleep(1);
  System.out.println("1......");
  TimeUnit.SECONDS.sleep(1);
  System.out.println("online");
System.out.println("Hi - I am the interface");
getUserInput();

}


public static void main(String[] args)throws InterruptedException{
Interface newUser = new Interface();
newUser.startUpSequence();



}


}




              
