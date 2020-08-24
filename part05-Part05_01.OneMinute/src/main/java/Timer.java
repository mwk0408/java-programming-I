/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class Timer {
    private ClockHand s;
    private ClockHand ms;
    public  Timer() {
        this.s=new ClockHand(60);
        this.ms=new ClockHand(100);
    }
    public void advance() {
        this.ms.advance();
        if (this.ms.value()==0) {
            this.s.advance();
        }
    }
    public String toString() {
        return this.s+":"+this.ms;
    }
}
