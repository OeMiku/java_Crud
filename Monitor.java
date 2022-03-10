public class Monitor extends Electronica{
    private Integer Pulgadas;
    public Integer getPulgadas() {
        return Pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        Pulgadas = pulgadas;
    }
    public String toString() { return String.format(super.toString() + ", "+"Pulgadas :" + this.Pulgadas);
    }
}
