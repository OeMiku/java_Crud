public class CPU extends Electronica {
    private Integer RAM;
    private String Procesador;
    private Integer DiscoDuro;


    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public Integer getDiscoDuro() {
        return DiscoDuro;
    }

    public void setDiscoDuro(Integer discoDuro) {
        DiscoDuro = discoDuro;
    }

    public String toString() { return String.format(super.toString() + ", "+ "RAM  :" + this.RAM +", "+ "Procesador: " + this.Procesador +", "+ "Disco duro: " + this.DiscoDuro);
    }
}
