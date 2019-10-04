public class numberCruncher{

public int div3(int a){
if (a%3==0){return 1;}
else{return 0;}

}

public int div4(int b){
if (b%4==0 && div3(b)==1){System.out.println(b+" number is divible by at least 3, 4 and 12");
return 1;}
else{return 0;}

}

public int div5(int c){
if (c%5==0 && div3(c) ==1&& div4(c)==1){System.out.println(c+" number is divible by at least 3, 4, 12 and 60");
return 1;}
else{return 0;}

}




public static void main(String[] arge){

numberCruncher test1 = new numberCruncher();

test1.div4(600);
}
}