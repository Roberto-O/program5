/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc220.program5.chasees;

import csc220.program5.GameCharacter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Elcain Chase
 * 
 */
public class MarioHead extends GameCharacter{
        
    public MarioHead(int over, int down, int width, int height, int moveInterval) {
        super(over - 10, down - 70, width, height, moveInterval, new List<Point>());
        animationPath.add(new Point(over - 10 , down -70));
        animationPath.add(new Point(over + 100, down - 70));
        animationPath.add(new Point(over + 50, down + 50));
        animationPath.add(new Point(over + 250, down + 70));
      //  this.animationPath.add(new Point(over, down));
    }
    
    @Override
    public void draw(Graphics g) {
         
          g.setColor(Color.RED); // hat
          g.fillRect(getOver() + 10, getDown(), getWidth() + 10 , getHeight() - 40 );
          g.fillRect(getOver() - 10, getDown() + 20, getWidth() + 70 , getHeight() - 40 );          
         
          g.setColor(new Color(255,173,96)); //face
          g.fillRect(getOver() - 10, getDown() + 40, getWidth() + 45 , getHeight() + 20 );
          g.fillRect(getOver() - 10, getDown() + 60, getWidth() + 80 , getHeight() - 20 );
          g.fillRect(getOver() - 10, getDown() + 80, getWidth() + 100 , getHeight() - 40 );
          g.fillRect(getOver() + 5, getDown() + 110, getWidth() + 45 , getHeight() - 40 );

          
          g.setColor(new Color(139,69,19)); //Hair
          g.fillRect(getOver() - 10, getDown() + 40, getWidth() - 10 , getHeight() - 40 );
          g.fillRect(getOver() + 5, getDown() + 40, getWidth() - 40 , getHeight() + 5);
          g.fillRect(getOver() + 20, getDown() + 85, getWidth() - 40 , getHeight() - 40);
          g.fillRect(getOver() - 30, getDown() + 60, getWidth() - 40 , getHeight() - 15);
          g.fillRect(getOver() -10, getDown() + 105, getWidth() - 45 , getHeight() - 45);
          
          g.setColor(Color.BLACK);//EYES AND MUST
          g.fillRect(getOver() + 65, getDown() + 40, getWidth() - 45 , getHeight() - 25);
          g.fillRect(getOver() + 60, getDown() + 100, getWidth() + 10 , getHeight() - 45);
          
          g.setColor(new Color(255,173,96));//hands
          g.fillRect(getOver() -40 , getDown() + 180, getWidth()  , getHeight() -10 );
          g.fillRect(getOver() + 100 , getDown() + 180, getWidth() , getHeight() -10 );
          
          
          g.setColor(Color.RED); //clothes
          g.fillRect(getOver() - 10, getDown() + 130, getWidth() + 75 , getHeight() + 3 );
          g.fillRect(getOver() - 25, getDown() + 145, getWidth() + 75 , getHeight() -25 );
          g.fillRect(getOver() + 5, getDown() + 145, getWidth() + 75 , getHeight() -25 );
          g.fillRect(getOver() - 40, getDown() + 160, getWidth() + 75 , getHeight() -40 );
          g.fillRect(getOver() + 25, getDown() + 160, getWidth() + 75 , getHeight() -40 );
          g.setColor(Color.BLUE);
          g.fillRect(getOver() + 20, getDown() + 130, getWidth() -35 , getHeight() + 3 );
          g.fillRect(getOver() + 70, getDown() + 130, getWidth() -35 , getHeight() + 3 );
          g.fillRect(getOver() + 20, getDown() + 160, getWidth() +10 , getHeight() -27 );
          g.fillRect(getOver() + 7 , getDown() + 193, getWidth() +40 , getHeight() -27 );
          g.fillRect(getOver() -10 , getDown() + 210, getWidth() - 10 , getHeight() -27 );
          g.fillRect(getOver() + 75 , getDown() + 210, getWidth() -10 , getHeight() -27 );
          g.setColor(Color.YELLOW);//button
          g.fillRect(getOver() + 20, getDown() + 193, getWidth() - 40 , getHeight() -40 );
          g.fillRect(getOver() + 75, getDown() + 193, getWidth() - 40 , getHeight() -40 );
          g.setColor(new Color(139,69,19));//shoes
          g.fillRect(getOver() -27 , getDown() + 243, getWidth() - 10 , getHeight() -27 );
          g.fillRect(getOver() + 87 , getDown() + 243, getWidth() -10 , getHeight() -27 );
          g.fillRect(getOver() -40 , getDown() + 256, getWidth()  , getHeight() -40 );
          g.fillRect(getOver() + 90 , getDown() + 256, getWidth()  , getHeight() -40 );
         
          
//        g.setColor(Color.getHSBColor(100,100,100)); //Mario's Face
//        g.fillOval(getOver() -5 , getDown() + 25, getWidth()+10, getHeight()+10);
//       
//        g.setColor(Color.white); //eye1
//        g.fillOval(getOver() + 5, getDown() + 35, (getWidth() / 4 ) +5 , (getHeight() / 4) +20);
//        g.setColor(Color.black); 
//        g.drawOval(getOver() + 5, getDown() + 35, (getWidth() / 4 ) +5 , (getHeight() / 4) +20);
//        
//        g.setColor(Color.white); //eye2
//        g.fillOval(getOver() + 33, getDown() + 35, (getWidth() / 4 ) +5 , (getHeight() / 4) +20);
//        g.setColor(Color.black); 
//        g.drawOval(getOver() + 33, getDown() + 35, (getWidth() / 4 ) +5 , (getHeight() / 4) +20);
//        
//        
//        g.setColor(Color.RED); // main hat
//        g.fillOval(getOver(), getDown(), getWidth() + 10, getHeight()-3);
//        g.setColor(Color.WHITE); // inner white circle
//        g.fillOval(getOver() + 15, getDown() + 15, (getWidth() / 2 ) +5 , (getHeight() / 2) -3);
//        g.setColor(Color.BLACK);// marios m
//        g.drawString("M" , getOver() + 28, getDown() + 33);
//        g.setColor(Color.RED); // hat brim
//        g.fillOval(getOver() - 40, getDown() + 37, getWidth() + 33, getHeight() - 40);
//        //end of hat
//        
//        g.setColor(Color.black); //mustache
//        g.drawLine(getOver() + 15 , getDown() + 85, getOver() + 43 , getDown() + 79);
//   
       
       }

}
