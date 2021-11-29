// Note that Graphviz must be installed on your laptop to execute the tree visualization correctly.
// Graphviz can be installed from the link here:(https://graphviz.gitlab.io/download/)

import java.util.*;
import java.io.*;

public class Tree{
  public static ArrayList<String> generateTree(int[] ls) {
    // generate tree
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < ls.length; i++){
      String str = "\t" + ls[i] + " -- ";
      if ((2*i)+1 < ls.length)
        str += "{" + ls[(2*i)+1];
      if ((2*i)+2 < ls.length)
        str += " " + ls[(2*i)+2]; 
      if (str.indexOf("{") <= 0)
        str += "{";
      str += "};\n";
      result.add(str);
    }
    return result;
  }
  public static void main(String[] args){
    int[] ls = {1,2,3,4,5,6,7,8};
    ArrayList<String> tree = generateTree(ls);
    File dot = new File("tree.dot");
    try {
      if (dot.createNewFile())
        System.out.println("File created: " + dot.getName());
      else 
        System.out.println("File already exists.");
      FileWriter myWriter = new FileWriter("tree.dot");
      // write the heading of the file
      myWriter.write("graph Tree{" + "\n");
      // traverse through the tree and write the content to file
      for (int i = 0; i < tree.size(); i++){
        myWriter.write(tree.get(i));
      }
      // Writes the closing bracket for file
      myWriter.write("}");
      myWriter.close();
      System.out.println("Successfully generated tree.dot file.");

    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

    String compileCommand = "dot -Tpng tree.dot -o tree.png";
    try {
      // run the compileCommand
      Process compile = Runtime.getRuntime().exec(compileCommand);
    } catch (IOException e) {
      System.out.println("Failed!");
      e.printStackTrace();
    }
    System.out.println("Tree Image created Successfully.");
  }
    
}
