/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targil_1;

/**
 *
 * @author david salmon
 */
public class PaintingChair extends Thread{
int i;
    public PaintingChair(int new_i) {
        i=new_i;
        start();
    }
    @Override
    public void run()
    {
       System.out.println("STEP_2 painting the chair: " + i);
    }    
}
