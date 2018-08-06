PImage mustache;
  PImage HadTo;
void setup () {
  HadTo = loadImage ("HadTo.jpg");
     size(800,600);
     HadTo.resize(width,height);
  mustache = loadImage("Moustache.png");
    mustache.resize(150,150);
}

void draw (){
  background(HadTo);
  image(mustache, mouseX, mouseY);
  
}