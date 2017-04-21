//Frog Class - Original code by Roberto Olivera
package csc220.program5.oliverar;
import java.awt.*;

public class Frog extends csc220.program5.GameCharacter {
    private Color green = Color.GREEN;
    private Color black = Color.BLACK;
    
    public Frog(int over, int down, int diameter, int moveInterval) {
        super(over, down, diameter, diameter, moveInterval, new csc220.program5.oliverar.List<Point>());
        animationPath.add(new Point(over, down));
        animationPath.add(new Point(over + 100, down));
        animationPath.add(new Point(over, down + 100));
        animationPath.add(new Point(over + 100, down + 100));
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(Color.PINK); //tongue
        g.fillOval(getOver()+9, getDown()-5, 4, 8);
        g.setColor(black);
        g.drawOval(getOver()+9, getDown()-5, 4, 8);
        
        g.setColor(black);
        g.drawOval(getOver()+1,getDown(),20,30); //340 //outline ontop
        
        g.setColor(green); //change to green for legs
        g.fillRect(getOver()-5, getDown()+9, 13, 5); //front left
        g.fillRect(getOver()-6, getDown()+18, 13, 5); //rear left
        g.fillRect(getOver()+14, getDown()+9, 13, 5); //front right
        g.fillRect(getOver()+14, getDown()+18, 13, 5); //rear right
        
        g.setColor(black); //get the outline for the legs
        g.drawRect(getOver()-5, getDown()+9, 13, 5); //front left
        g.drawRect(getOver()-6, getDown()+18, 13, 5); //rear left
        g.drawRect(getOver()+14, getDown()+9, 13, 5); //front right
        g.drawRect(getOver()+14, getDown()+18, 13, 5); //rear right
        
        g.setColor(green);
        g.fillOval(getOver()+1, getDown(), 20, 30); //fill frog body
        
        g.fillRect(getOver()-7, getDown()+5, 3, 10); //front left
        g.fillRect(getOver()+27, getDown()+5, 3, 10); //front right
        g.fillRect(getOver()-6, getDown()+18, 3, 10); //rear left
        g.fillRect(getOver()+25, getDown()+18, 3, 10); //rear right
        
        g.setColor(black); //legs part 2 outline
        g.drawRect(getOver()-7, getDown()+5, 3, 10); //front left
        g.drawRect(getOver()+26, getDown()+5, 3, 10); //front right
        g.drawRect(getOver()-6, getDown()+18, 3, 10); //rear left
        g.drawRect(getOver()+25, getDown()+18, 3, 10); //rear right
        
        g.setColor(green); //finger circles
        g.fillOval(getOver()-8, getDown(), 6, 6);
        g.fillOval(getOver()+25, getDown(), 6, 6);
        g.fillOval(getOver()-7, getDown()+25, 6, 6);
        g.fillOval(getOver()+24, getDown()+25, 6, 6);
        
        g.setColor(black); //finger circles outline
        g.drawOval(getOver()-8, getDown(), 6, 6);
        g.drawOval(getOver()+25, getDown(), 6, 6);
        g.drawOval(getOver()-7, getDown()+25, 6, 6);
        g.drawOval(getOver()+24, getDown()+25, 6, 6);
        
        g.fillOval(getOver()+6, getDown()+4, 3, 3); //eyes
        g.fillOval(getOver()+12, getDown()+4, 3, 3);
    }
    
}
