package com.scit.tandanzi.vo;

public class SlListVO {
int slFoodNum;
String slType;
String slName;
int slKcal;
int slCarbohy;
int slProtein;
int slFat;

public SlListVO() {
   // TODO Auto-generated constructor stub
}

public SlListVO(int slFoodNum, String slType, String slName, int slKcal, int slCarbohy, int slProtein, int slFat) {
   super();
   this.slFoodNum = slFoodNum;
   this.slType = slType;
   this.slName = slName;
   this.slKcal = slKcal;
   this.slCarbohy = slCarbohy;
   this.slProtein = slProtein;
   this.slFat = slFat;
}

public int getSlFoodNum() {
   return slFoodNum;
}

public void setSlFoodNum(int slFoodNum) {
   this.slFoodNum = slFoodNum;
}

public String getSlType() {
   return slType;
}

public void setSlType(String slType) {
   this.slType = slType;
}

public String getSlName() {
   return slName;
}

public void setSlName(String slName) {
   this.slName = slName;
}

public int getSlKcal() {
   return slKcal;
}

public void setSlKcal(int slKcal) {
   this.slKcal = slKcal;
}

public int getSlCarbohy() {
   return slCarbohy;
}

public void setSlCarbohy(int slCarbohy) {
   this.slCarbohy = slCarbohy;
}

public int getSlProtein() {
   return slProtein;
}

public void setSlProtein(int slProtein) {
   this.slProtein = slProtein;
}

public int getSlFat() {
   return slFat;
}

public void setSlFat(int slFat) {
   this.slFat = slFat;
}

@Override
public String toString() {
   return "ListVO [slFoodNum=" + slFoodNum + ", slType=" + slType + ", slName=" + slName + ", slKcal=" + slKcal
         + ", slCarbohy=" + slCarbohy + ", slProtein=" + slProtein + ", slFat=" + slFat + "]";
}



}