package clasesEmpresa;

import java.util.ArrayList;

public class empresa {

    ArrayList<empleado> empleados;

    //Constructor
    public empresa(){
        empleados = new ArrayList<empleado>(); 
    }

    //Metodo que agrega empleados a la empresa
    public void contrataEmpleados(empleado e){
        empleados.add(e);

    }


    //Metodo que obtiene el total de empleados 
    public int getTotalEmpleados(){
        return empleados.size();
    }

    //Metodo que muestra el nombre y el salario de todos los empleados
    public void nombreSalario(){
        for(empleado e: empleados) {
            System.out.println(" Nombre: " + e.getNombre() + " salario: " + e.getSalario());
        } 
    }


    //Metodo que retorna el totl de dinero a todos los empleados
    public double getTotalSalarios() {
        double total = 0;
        for(empleado e: empleados) {
            total = total + e.getSalario();
        }
        return total;
    }




}


