package dna;

import java.util.*;
public class Matrix<T>{

  private ArrayList<ArrayList<T>> matrix;
  private int row, col;
  public Matrix(int row, int col){
    this.row = row;
    this.col = col;
    ArrayList<T> temp = new ArrayList<T>();
    this.matrix= new ArrayList<ArrayList<T>>();
    for (int i=0;i<col;i++){
      for (int j=0;j<row;j++){
        temp.add(null);
      }
      this.matrix.add(temp);
      temp = new ArrayList<T>();
    }
  }
  public void insert (int row, int col, T value){
    try{
    if (row<=this.row&&col<=this.col)
      this.matrix.get(col).set(row,value);
    else
      throw new IndexOutOfBoundsException();
    }catch (IndexOutOfBoundsException ie){
      printError(row,col);
      System.exit(0);
    }catch (Exception e){
      System.err.println("Something is really broken here. :O");
      e.printStackTrace();
    }
  }
  public void delete (int row, int col){
    try{
    if (row<=this.row&&col<=this.col)
      this.matrix.get(col).set(row, null);
    else{
      throw new IndexOutOfBoundsException();
    }
    }catch (IndexOutOfBoundsException ie){
      printError(row,col);
      System.exit(0);
    }catch (Exception e){
      System.err.println("Something is really broken here. :O");
      e.printStackTrace();
    }
  }
  public T retrieve (int row, int col){
    try{
    if (row<=this.row&&col<=this.col)
      return this.matrix.get(col).get(row);
    else{
      throw new IndexOutOfBoundsException();

    }
    }catch (IndexOutOfBoundsException ie){
      printError(row,col);
      return null;
    }catch (Exception e){
      System.err.println("Something is really broken here. :O");
      e.printStackTrace();
      return null;
    }
  }
  private void printError(int row, int col){
    if (row>this.row&&col>this.col){
      System.err.println ("IndexOutOfBoundsException: The row and column is out of range.");
    }
    else if (row>this.row){
      System.err.println("IndexOutOfBoundsException: The row is out of range.");
    }
    else{
      System.err.println("IndexOutOfBoundsException: The column is out of range.");
    }
  }
  public String toString(){
    String stringMat = "";
    for (ArrayList<T>  t : this.matrix) {
      for (T coord : t){
        if (coord!=null){
          stringMat+="["+ coord +"] ";
        }
        else
          stringMat+="[ ] ";
      }
        stringMat+="\n";
    }
    return stringMat;
  }
  public static void main(String[] args){//self testing main method.
    Matrix<Integer> t = new Matrix<Integer>(7,5);
    //t.insert(5,1, 5);
    t.insert (1,2, 4);
    t.insert(3,3,0);
    System.out.println(t);
    t.delete(3,3);
    System.out.println(t);
    System.out.println(t.retrieve(1,2));
  }
}
