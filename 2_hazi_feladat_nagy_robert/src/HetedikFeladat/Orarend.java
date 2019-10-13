/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HetedikFeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Orarend {
    String nap;
    Ora[] orarend;
    int count;

    public Orarend(String nap) {
        this.nap = nap;
        count = 0;
        orarend = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getOrarend() {
        return orarend;
    }

    public void setOrarend(Ora[] orarend) {
        this.orarend = orarend;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Orarend " + "nap=" + nap + ", orarend=" + orarend + ", count=" + count;
    }
    
    public boolean oratHozzaad(Ora ora){
       if(this.count >=12){
           return false; 
       }
       else{
          for(int i=0;i<count;i++){
              if(this.orarend[i].getKezdes()==ora.getKezdes()){
                  return false;
              }
          }
       }
       this.orarend[this.count++]=ora;
       return true;
    }
    
    
    
}
