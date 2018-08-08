  int BX = 0;
  int XHS = 5;
  int BY = 0;
  int YHS = 5;
void setup () {
  
 size (1000,1000);
 background (#000000);
   noStroke(); 
   int BX = 0; 
  
  
 
  
  
  
  
  
  
  
}

void draw () {
   background (#000000);
    fill(#FFFFFF);
  ellipse (BX,500,50,50);
BX+=XHS;
if(BX>width) {
 XHS=-XHS; 
}
  if(BX<0) {
   XHS=-XHS; 
  }
  BY+=YHS;
  if(BY>height) {
    YHS=-YHS;
  }
  if(BY<0) {
   YHS=-YHS; 
  }
  
  
  
  
  
}