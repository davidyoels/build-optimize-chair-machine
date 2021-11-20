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
public class CoverChair extends Thread{

    int i;
    public CoverChair(int new_i) {
    i=new_i;
    start();
    }
    
    @Override
    public void run()
    {
       System.out.println("STEP_4 cover the seat of the chair: " + i);
    }
    
}
