package entity;

public class Televisor extends Electrodomestico {

    protected Integer resolucion;
    protected boolean sintonizadorTdt;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizadorTdt, String color,
            String consumo, Integer peso) {
        super(color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public void crearTelevisor() {
        
        String sintonizadorTDT = "n";

        crearElectrodomestico();

        System.out.println("Ingrese la resolucion");
        this.resolucion = read.nextInt();

        System.out.println("Tiene sintonizador TDT? y/n" );
        sintonizadorTDT = read.next();
        
        if(sintonizadorTDT.equalsIgnoreCase("y")){
            
            this.setSintonizadorTdt(true);
            
        }else{
            
            this.setSintonizadorTdt(false);
        }
       

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        
        Integer porcentaje = this.precio +(int)Math.round(this . precio * 0.3);
        
        if(this.resolucion > 40){
            this.precio = this.precio + porcentaje; 
        }
        
        if(this.isSintonizadorTdt()){
            this.precio = this.precio + 500;
        }
    }
    
    

}
