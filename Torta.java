package obj4;
/*
Írj osztályt, ami egy Torta objektumot valósít meg.
• A torta adattagjai a következőek legyenek: emeletek száma (int), meg van -e kenve
krémmel (boolean).
*/
public class Torta {
    public int emelet;
    public boolean megkenve;
/*
Készíts két konstruktort is az osztályhoz. Az egyik általános legyen, ami minden 
adattagot paraméterlistából állít be, a másik egy alapértelmezett konstruktor legyen, 
ami 1 emeletes, krém nélküli tortát hoz létre.    
*/

    public Torta(int emelet, boolean megkenve) {
        this.emelet = emelet;
        this.megkenve = megkenve;
    }
    public Torta(){
        this(1, false);
    }
/*
Az osztálynak legyen egy void ujEmelet metódusa, ami nem vár paramétert, és egy új
emeletet rak a tortára.
*/
   public void ujEmelet(){
       emelet++;
   }
/*
Az osztálynak legyen egy boolean kremmelMegken metódusa, ami nem vár paramétert.
Ha a torta még nincs megkenve krémmel, úgy a metódus tegye ezt meg. Térjen vissza
logikai értékkel attól függoen, hogy sikerült -e.   
*/
   public boolean kremmelMegken(){
       if(!megkenve){
           megkenve = true;
           return true;
       }
       return false;
   }
/*
Készíts egy int típusú mennyiKaloria metódust az osztályhoz. A torta minden emelete
1000 kalória értéku, ha még krémmel is meg van kenve, akkor ennek a kétszerese.
*/   
    public int mennyiKaloria(){
          if (megkenve){
            return 1000*emelet*2;
        } else {
            return 1000*emelet; 
        }
    }
/*
 Készíts toString metódust az osztályhoz.   
*/  

    @Override
    public String toString() {
        return "Torta" + " emelet=" + emelet + (megkenve?" krémmel megkenve: ":"" ) + " kalóriák: " + mennyiKaloria();
    }
   
/*
A main metódusban hozz létre két tortát a két konstruktorral. 
*/  
   
   
    public static void main(String[] args) {
        Torta t1=new Torta();
        Torta t2=new Torta();
/*
Az alapértelmezett tortát kétszer is kend meg krémmel, ennek eredményét mindig
írd konzolra. 
*/        
    t1.kremmelMegken();
    t1.kremmelMegken();
        System.out.println(t1);
    
/*        
A másik tortára rakj egy emeletet.        
*/
    t2.ujEmelet();
        System.out.println(t2);
    }
    
    
/*
Mindkét objektumot írd ki szövegesen.  
*/

}
