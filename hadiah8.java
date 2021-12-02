package grafis;
 import java.awt.*;
  public class hadiah8 extends Panel{
hadiah8(){
}
public void paint (Graphics g) {
g.drawString("Ini mobil dan nama saya Yessi Tandiarny",30,430);
g.setColor(Color.PINK);
g.fillRect(0, 250, 350, 100);
g.fillRect(0, 200, 250, 60);
g.setColor(Color.BLACK);
g.fillArc(30,300,100,100,0,360);
g.fillArc(200,300,100,100,0,360);


      }
public static void main(String[] args) {
Frame f = new Frame ("Testing Graphics Panel");
 hadiah8 gp = new hadiah8();
  f.add (gp);
   f.setSize (900, 900); 
   f. setVisible(true);
   }
   }