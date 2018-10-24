int[] insertQtrBtnParams = {100,100,150,50};
int[] turnCrankBtnParams = {100,200,150,50};
boolean insertQtrBtnHovered = false;
boolean turnCrankBtnHovered = false;
boolean insertQtrBtnPressed = false;
boolean turnCrankBtnPressed = false;
color insertQtrBtnHoveredColor = color(209);
color turnCrankBtnHoveredColor = color(209);
color insertQtrBtnPressedColor = color(0);
color turnCrankBtnPressedColor = color(0);
color baseColor = color(255);
color textColor = color(0);
PFont font;
GumballMachine gumballMachine = new GumballMachine(5);
void setup() 
{
  size(800, 800) ;
  background(255) ;
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  
  
  // load font
  //PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  //textFont(font, 32);
  
  // Only draw once
  //noLoop();
}

void draw() {
  background(255);
  fill(textColor);
  textFont(font, 32);
  text("The Gumball Machine", 250, 60);
  PImage image = loadImage("gumball.jpg");
  image(image, (width-image.width)/2, (height-image.height)/2);
  textFont(font, 20);
  text("Current State: ", 100, 700);
  text(gumballMachine.getState().toString(), 250, 700);
  text("Remaining gumballs:", 100, 750);
  text(gumballMachine.getCount(), 300, 750);
  
  if(insertQtrBtnHovered) {
    fill(insertQtrBtnHoveredColor);
  } else if(insertQtrBtnPressed) {
    fill(insertQtrBtnPressedColor);
  } else {
    fill(baseColor);
  }
  rect(insertQtrBtnParams[0],insertQtrBtnParams[1],insertQtrBtnParams[2],insertQtrBtnParams[3]);
  if(turnCrankBtnHovered) {
    fill(turnCrankBtnHoveredColor);
  } else if(turnCrankBtnPressed) {
    fill(turnCrankBtnPressedColor);
  } else {
    fill(baseColor);
  }
  rect(turnCrankBtnParams[0],turnCrankBtnParams[1],turnCrankBtnParams[2],turnCrankBtnParams[3]);
  
  fill(textColor);
  textFont(font,20);
  text("Insert Quarter", 110, 125);
  text("Turn Crank", 110, 225);
  //runTest() ;
  mouseHover();
}

void mouseHover() {
  if(mouseX >= insertQtrBtnParams[0] && mouseX <= insertQtrBtnParams[0]+insertQtrBtnParams[2] && 
      mouseY >= insertQtrBtnParams[1] && mouseY <= insertQtrBtnParams[1]+insertQtrBtnParams[3]) {
       insertQtrBtnHovered = true; 
       turnCrankBtnHovered = false;
       insertQtrBtnPressed = false;
       turnCrankBtnPressed = false;
      }
  else if(mouseX >= turnCrankBtnParams[0] && mouseX <= turnCrankBtnParams[0]+turnCrankBtnParams[2] && 
      mouseY >= turnCrankBtnParams[1] && mouseY <= turnCrankBtnParams[1]+turnCrankBtnParams[3]) {
       turnCrankBtnHovered = true; 
       insertQtrBtnHovered = false;
       turnCrankBtnPressed = false;
       insertQtrBtnPressed = false;
      }
  else {
    insertQtrBtnHovered = false;
    turnCrankBtnHovered = false;
  }
}
void mousePressed() {
  if(insertQtrBtnHovered) {
    insertQtrBtnPressed = true;
    insertQtrBtnHovered = false;
    turnCrankBtnPressed = false;
    turnCrankBtnHovered = false;
    gumballMachine.insertQuarter();
  } else if(turnCrankBtnHovered) {
    insertQtrBtnPressed = false;;
    insertQtrBtnHovered = false;
    turnCrankBtnPressed = true;
    turnCrankBtnHovered = false;
    gumballMachine.turnCrank();
  }
}

//public void runTest() {
//  GumballMachine gumballMachine = new GumballMachine(5);
//  System.out.println(gumballMachine);
//  gumballMachine.insertQuarter();
//  gumballMachine.turnCrank();
//  System.out.println(gumballMachine);
//  gumballMachine.insertQuarter();
//  gumballMachine.turnCrank();
//  gumballMachine.insertQuarter();
//  gumballMachine.turnCrank();
//  System.out.println(gumballMachine);
//}
