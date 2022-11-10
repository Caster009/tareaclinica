package clinica;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Clinica {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);        
System.out.println("Ingrese el paciente");
List <String> Pacientes = new LinkedList<>();    //Lista de pacientes
Pacientes.add("Ana");
Pacientes.add("Juan");
Pacientes.add("Maria");
Pacientes.add("Asier");
Pacientes.add("" + scan.next());
Pacientes.forEach((l) -> {
    System.out.println("Pacientes: "+ l);
    });

List <String> Medicina;  //Lista de medicinas
Medicina = new LinkedList<>();
System.out.println("Ingrese el medicamento");
Medicina.add("Triludan");
Medicina.add("Fortasec");
Medicina.add("Clamoxil");
Medicina.add("" + scan.next());
Medicina.forEach((l) -> {
    System.out.println("Medicinas: "+ l);
    });
    
  
    
    
    
    
    }}





 

