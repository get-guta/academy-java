package com.bptn.course._18_super_and_inheritance;

//Complete building up this class
public class APStudent extends Student {
private int apScore;

public APStudent( String name, int id, int apScore){
 super(name, id);
 this.apScore = apScore;
}
public String toString() {
     return super.toString() + " " + apScore;
  }

}