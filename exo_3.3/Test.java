package exo3;
import static org.junit.Assert.*;
import java.util.ArrayList;
Public class Test{
    @org.junit.Test
    public void test(){
        ArrayList<Robot> Robots = new ArrayList<Robot>();
        Robots.add(new RobotType1(20);
        Robots.add(new RobotType2 (20);
        for(int i = 0; i<Robots.size(); i++){
            Robots.get(i).avance();
        }
        for(int i = 0; i<Robots.size(); i++){
            System.out.println(“position Robot de type”+(i+1)+”:”+Robots.get(i).position);
        }



    }




}
