
package Clases;

public class Cafetera {
    
    private int CapMax;
    
    private int CapAct;

    //Constuctores
    
    public Cafetera(int CapMax, int CapAct) {
        this.CapMax = CapMax;
        this.CapAct = CapAct;
    }
    
    public Cafetera(){
        
    }
    
    // Seters

    public void setCapMax(int CapMax) {
        this.CapMax = CapMax;
    }

    public void setCapAct(int CapAct) {
        this.CapAct = CapAct;
    }
    
    //Geters

    public int getCapMax() {
        return CapMax;
    }

    public int getCapAct() {
        return CapAct;
    }
}
