int started = 0;
int x= 313;
int y= 188;
int acceleration= 5;
PImage catPic;

void setup () {
 size (800,400); 
 catPic = loadImage ("Polite.jpg");
   catPic.resize(width,height);
   background(catPic);
}

void keyPressed() {
 x=x+20;
 y=y+20; 
}

void draw () {
  if(started == 1)
  fill(#FF0D0D);
  if(mousePressed) {
   println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n"); }
   noStroke();
  ellipse(x,y,100,100);
  ellipse(x+177,y+11,100,100);
  if(y>height) {
    y=188;
    x=313;
   background(catPic);
  }
}