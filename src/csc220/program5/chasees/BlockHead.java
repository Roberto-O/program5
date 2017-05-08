/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc220.program5.chasees;

import csc220.list.List;
import csc220.program5.GameCharacter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author chasees2020
 */
public class BlockHead extends GameCharacter {

    public BlockHead(int over, int down, int width, int height, int moveInterval) {
        super(over, down, width, height, moveInterval, new List<Point>());
        animationPath.add(new Point(over, down));
        animationPath.add(new Point(over + 100, down));
        animationPath.add(new Point(over, down + 100));
        animationPath.add(new Point(over + 100, down + 100));
        this.animationPath.add(new Point(over,down));
    }

    
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
       // g.fillRect(getOver(), getDown(), getWidth(), getHeight());
    }
    
}
