package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    
    static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee("Carlos", "Oliveira", 52000.0d, List.of("Projeto 1", "Projeto 3")));
        employees.add(new Employee("Regina", "Cazé", 5000.0d, List.of("Projeto 2", "Projeto 0")));
        employees.add(new Employee("Andressa", "Carla", 4000.0d, List.of("Projeto 1", "Projeto 4")));
        employees.add(new Employee("Brian", "Domingues", 4500.0d, List.of("Projeto 3", "Projeto 4")));
    }
    

    public static void main(String[] args) {
       
        //Fpteach
        employees.stream().forEach((employee -> System.out.println(employee)));
       
        
        //Map
        {Set<Employee> salarioAumentado = employees.stream().map(employee -> new Employee(employee.getFirstName(), employee.getLastName(),
                employee.getSalary()*1.10d, employee.getProject())).collect(Collectors.toSet());
        System.out.println(salarioAumentado);}
    
        //filter
        {List<Employee> empregadoFiltrado = employees.stream().filter(employee -> employee.getSalary() < 5000.0).map(employee -> new Employee(employee.getFirstName(), employee.getLastName(),
                employee.getSalary()*1.10d, employee.getProject())).collect(Collectors.toList());
        System.out.println(empregadoFiltrado);}
        
        //Primeiro empregado
        {Employee empregadoPrimeiro = employees.stream().filter(employee -> employee.getSalary() > 5000.d).findFirst().orElse(null);
        System.out.println(empregadoPrimeiro);}
        
        //flatMap
        
        String projects = employees.stream().map(employee -> employee.getProject())
                .flatMap(strings -> strings.stream()).collect(Collectors.joining(","));
        
        System.out.println(projects);
        
        //Operações de circuitos curtos
        List<Employee> circuitoCurto =
        employees.stream().skip(1).limit(1).collect(Collectors.toList());
        
        System.out.println(circuitoCurto);
        
        //finitedata
        Stream.generate(Math::random).limit(5).forEach(value -> System.out.println(value));
        
        //ordenar
        List<Employee> empregadosOrdenados = employees.stream().sorted((o1, o2) -> o1.getFirstName().
                compareToIgnoreCase(o2.getFirstName())).collect(Collectors.toList());
        System.out.println(empregadosOrdenados);
        
        //max ou min
        Employee empregadoQueGanhaMais = employees.stream().max(Comparator.comparing(Employee::getSalary)).
                orElseThrow(NoSuchElementException::new);
        System.out.println(empregadoQueGanhaMais);
        
        //reduzir
        Double totalSal = employees.stream().map(employee -> employee.getSalary()).reduce(0.0, Double::sum);
        System.out.println(totalSal);
    }
    
    
}
