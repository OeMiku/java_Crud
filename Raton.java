public class Raton extends Electronica{
    private Boolean entrada_bluethoot;


    public Boolean getEntrada_bluethoot() {
        return entrada_bluethoot;
    }

    public void setEntrada_bluethoot(Boolean entrada_bluethoot) {
        this.entrada_bluethoot = entrada_bluethoot;
    }
    public String toString() { return String.format(super.toString() + ", " + "Entrada con bluethoot :" + ", " + this.entrada_bluethoot);
    }
}
