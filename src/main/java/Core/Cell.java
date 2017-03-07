package Core;

import GUI.Sprite;

import static Core.Constants.CELL_SIZE;


public class Cell {

    private int x;
    private int y;
    private int state;

    public Cell (int x, int y, int state){
        this.x=x;
        this.y=y;
        this.state=state;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getHeight(){
        return CELL_SIZE;
    }

    public int getWidth(){
        return CELL_SIZE;
    }

    public int getState(){
        return this.state;
    }

    public void setState(int state){
        this.state = state;
    }

    public void update(boolean have_to_decrease){
        if (have_to_decrease && this.state>0){
            this.state--;
        }
    }


    public GUI.Sprite getSprite(){
        if(this.state>0){

            return GUI.Sprite.BODY;
        }else if(this.state==0){

            return null;
        }else{
            switch(this.state){
                case -1: return Sprite.CHERRIES;
                case -2: return Sprite.APPLE;
                default: return Sprite.BANANAS;
            }


            }
        }
    }



