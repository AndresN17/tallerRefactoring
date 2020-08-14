package modelos;

public class calcularSueldoProfesor {
    /*
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.info.añosdeTrabajo*600 + prof.info.BonoFijo;
        return sueldo;
    }  
    */
    
    
    public double calcularSueldo(Profesor prof){
        return (prof.getInfo().getAñosdeTrabajo()*60 + prof.getInfo().getBonoFijo());
    }
    
}
