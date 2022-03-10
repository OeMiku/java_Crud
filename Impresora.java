public class Impresora extends Electronica {
    private Boolean escaner;


    public Boolean getEscaner() {
        return escaner;
    }

    public void setEscaner(Boolean escaner) {
        this.escaner = escaner;
    }

    public String toString() { return String.format(super.toString() + ", "+"Escaner :" + this.escaner);
    }
}
