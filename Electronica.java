public class Electronica implements Comparable<Electronica> {
    protected String SKU;
    protected String Tipo;
    protected String Modelo;
    protected String Marca;
    protected Boolean EstaBorrado = false;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Boolean getEstaBorrado() {
        return EstaBorrado;
    }

    public void setEstaBorrado(Boolean estaBorrado) {
        EstaBorrado = estaBorrado;
    }

    public String toString() { return String.format( "SKU : " + this.SKU+ ", " + "Tipo: "+ this.Tipo + ", "+ "Modelo: " + this.Modelo + ", " + "Marca: "+ this.Marca);
    }
    public int compareTo(Electronica o){
        return this.getSKU().compareTo(o.getSKU());

    }

}
