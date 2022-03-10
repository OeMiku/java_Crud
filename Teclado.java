import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Iterator;

public class Teclado extends Electronica{
    private Boolean Luces;
    private Boolean entrada_bluethoot;

    public Boolean getLuces() {
        return Luces;
    }

    public void setLuces(Boolean luces) {
        Luces = luces;
    }

    public Boolean getEntrada_bluethoot() {
        return entrada_bluethoot;
    }

    public void setEntrada_bluethoot(Boolean entrada_bluethoot) {
        this.entrada_bluethoot = entrada_bluethoot;
    }
    public String toString() { return String.format(super.toString() + ", "+ "Luces :" + this.Luces + ", "+ "Entrada a bluethoot: "+ this.entrada_bluethoot);
    }
}
