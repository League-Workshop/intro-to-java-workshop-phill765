PImage rainbow;
  PImage unicorn;
void setup () {
  rainbow = loadImage("Rainbow.png");
  unicorn = loadImage("Unicorn_4.png");
  size(800,600);
  rainbow.resize(width,height);
  unicorn.resize(400,400);
}


void draw () {
 background(rainbow);
  image(unicorn, mouseX,mouseY);
  
  
  
}