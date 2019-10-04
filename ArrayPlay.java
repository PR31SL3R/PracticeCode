import java.util.ArrayList;

class ArrayPlay {
  
  public static void main(String[] args) {
    
    ArrayList<String>test = new ArrayList <String>();
    test.add("abc");
    test.add("def");
    test.add("ghi");
    test.add("ert");
    test.add("mno");
    test.add("543");
    test.set(3,"jkl");
    test.remove(5);
    test.indexOf("def");
     System.out.println(test.size());
    System.out.println(test.toString());
    
    ArrayList<String> desertIsland = new ArrayList<String>();
    desertIsland.add("song 1");
    desertIsland.add("song 2");
    desertIsland.add("song 3");
    desertIsland.add("song 4");
    desertIsland.add("song 5");
    desertIsland.add("song 6");
    desertIsland.add("song 7");
    desertIsland.add("song 8");
    
    
    System.out.println(desertIsland.toString());
    System.out.println(desertIsland.size());
    while (desertIsland.size() > 5)
    {desertIsland.remove(5);}
    System.out.println(desertIsland.size());
    System.out.println(desertIsland.toString());
    
    int indexA = desertIsland.indexOf("song 3");
    int indexB = desertIsland.indexOf("song 4");
    
    String tempA = "song 3";

      desertIsland.set(indexA,"song 4");
      desertIsland.set(indexB,tempA);
      
      System.out.println(desertIsland);


  }
  
}