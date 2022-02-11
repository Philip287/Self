package JavaVideo.List.streams;

import JavaVideo.List.streams.model.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOverviewMain {
    private static List<Employee> employeeList = new ArrayList<>();
    private static List<Employee> secondList = new ArrayList<>();
    private static Map<Integer, Employee> employeeMap = null;

    public static void main(String[] args) throws IOException {
        employeeList.add(new Employee(1, "Alex", "Black", 50000));
        employeeList.add(new Employee(2, "John", "Green", 75000));
        employeeList.add(new Employee(6, "Sam", "Brown", 80000));
        employeeList.add(new Employee(9, "Tony", "Grey", 90000));
        employeeList.add(new Employee(10, "Mike", "Yellow", 60000));
        employeeList.add(new Employee(11, "Viktoria", "Pink", 75000));
        employeeList.add(new Employee(16, "Sean", "Magenta", 80000));
        employeeList.add(new Employee(19, "Kate", "Black", 88000));
        //employeeList.add(new Employee(9, "Tone", "Grey", 90000));
        //employeeList.add(new Employee(10, "Mike", "Yellow", 60000));
        // employeeList.add(new Employee(11, "Victoria", "Pink", 75000));


        secondList.add(new Employee(1, "Alex", "Black", 50000));
        secondList.add(new Employee(2, "John", "Green", 75000));
        secondList.add(new Employee(6, "Sam", "Brown", 80000));
        secondList.add(new Employee(9, "Tony", "Grey", 90000));
        secondList.add(new Employee(10, "Mike", "Yellow", 60000));
        secondList.add(new Employee(11, "Viktoria", "Pink", 75000));
        secondList.add(new Employee(16, "Sean", "Magenta", 80000));
        secondList.add(new Employee(19, "Kate", "Black", 88000));

        testStreamFormList();
        // testStreamFromFile();

        testSortAndReduce();

    }

    private static void testSortAndReduce() {
        Employee employee = employeeList.stream().max((e1, e2) -> e1.getId() - e2.getId()).get();
        System.out.println(employee);

        Employee employee1 = employeeList.stream().min(Comparator.comparingInt(Employee::getSalary)).get();
        System.out.println(employee1);

        employeeList.stream().sorted((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()))
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);

        Employee identity = new Employee(0, " ", " ", 0);
        Employee reducedEmployee = employeeList.stream()
                .reduce(identity, (e1, e2) -> {
                    e1.setId(e1.getId() + e2.getId());
                    e1.setSalary(e1.getSalary() + e2.getSalary());
                   return e1;
                });
        System.out.println(reducedEmployee);


    }

    private static void testStreamFormList() {
        employeeList.stream().
                filter(e -> e.getSalary() > 60000).
                filter(e -> e.getId() < 10).
                collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();
        Integer[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Stream.of(ids)
                .map(StreamsOverviewMain::findBuId)
                .filter(Objects::nonNull)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Optional<Employee> first = Stream.of(ids).map(StreamsOverviewMain::findBuId).filter(Objects::nonNull).findFirst();

        Random r = new Random();
        Integer integer = Stream.of(ids)
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 3 == 0)
                .filter(i -> i % 5 == 5)
                .findFirst()
                .orElseGet(() -> r.nextInt());

        System.out.println(integer);


        int sum = Stream.of(ids)
                .map(StreamsOverviewMain::findBuId)
                .filter(Objects::nonNull)
                .mapToInt(Employee::getSalary).sum();
        System.out.println(sum);

        List<List<Employee>> departments = new ArrayList<>();
        departments.add(secondList);
        departments.add(employeeList);

        departments.stream().flatMap(l -> l.stream().map(e -> e.getFirstName())).forEach(System.out::println);
        int sum1 = 0;
        /* Consumer<Integer> c = e -> e*2;
        //Stream.of(ids).peek(e->e=e*2).forEach(System.out::println);
        Stream.of(ids).forEach(c); */


    }

    private static void testStreamFromFile() throws IOException {
        Files.lines(Paths.get("GradeBook.txt")).filter(e -> e.length() > 5)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    private static Employee findBuId(int id) {
        if (employeeMap == null) {
            employeeMap = employeeList.stream().distinct().collect(Collectors.toMap(Employee::getId, e -> e));
        }
        return employeeMap.get(id);
    }
}
