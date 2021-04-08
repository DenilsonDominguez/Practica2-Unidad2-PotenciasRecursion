
public class Potencias {

    public Potencias() {
    }
    
    public int elevar(int n1,int n2){
    
        if (n2==0){
            return 1;
        }else if(n2==1){
             return n1;
             }else{
               return n1 * elevar(n1,n2-1);
               }
    }
    
}
