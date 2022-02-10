package JavaVideo.List.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HigherOrderFunctionExample {
    public static void main(String[] args) {
        List<RichPersons> persons = new ArrayList<>();
        persons.add(new RichPersons("Alex", "Black", 50000, 25));
        persons.add(new RichPersons("John", "Green", 75000, 35));
        persons.add(new RichPersons("Sam", "Brown", 80000, 40));
        persons.add(new RichPersons("Tony", "Grey", 90000, 50));
        testPredicate(persons);
        testFunction(persons);
        testConsumer(persons);
    }

    private static void testPredicate(List<RichPersons> persons){
        System.out.println("Testing predicate...");
        Predicate<RichPersons> isRich = x-> x.getSalary()>=7500;
        Predicate<RichPersons> isYong = y-> y.getAge()<=40;
        System.out.println("is reach and young");
        findAll(persons, isRich.and(isYong)).forEach(System.out::println);
        System.out.println("is reach or young");
        findAll(persons, isRich.or(isYong)).forEach(System.out::println);
        System.out.println("is not young");
        findAll(persons, isYong.negate()).forEach(System.out::println);

    }

    private  static <T> List<T> findAll(List<T> elements, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T element : elements){
            if(predicate.test(element)){
                filteredList.add(element);
            }
        }
        return filteredList;
    }

    private static void  testFunction(List<RichPersons> persons){
        System.out.println("Testing Function...");
        //f1.compose(f2) ==> f1(f2(x));
        //f1.andThen(f2) ==> f2(f1(x));
        // Function.identity;

        Function<RichPersons, String> name = x -> x.getFirstName() + " " + x.getLastNAme();
        Function<String, String> sayHello = y -> "Hello " + y;
        Function<RichPersons, String> composeFunction = sayHello.compose(name);
        List<String> transformList = transform(persons, composeFunction);

        Function<String, String> exclaim = z -> z + "!!!";
        Function<String, String> toUpper = String::toUpperCase;

        transform(transformList, compose(toUpper, exclaim)).forEach(System.out::println);
    }

    private static <T> Function<T, T> compose(Function<T, T>... functions){
        Function<T,T> result = Function.identity();
        for(Function<T, T> f : functions){
            result = result.andThen(f);
        }
        return result;
    }

    private static <T, R> List<R> transform(List<T> elements, Function<T, R> function){
        List<R> list = new ArrayList<>();
        for(T elem : elements){
            list.add(function.apply(elem));
        }
        return list;
    }

    public static void testConsumer(List<RichPersons> persons){
        System.out.println("Testing consumer...");
        //f1.andThen(f2(X)) => f1(x) andThen f2(x);
        Consumer<RichPersons> rise = x -> x.setSalary(x.getSalary() * 11 /10);
        processList(persons, rise.andThen(System.out::println));
    }

    public static <T> void processList(List<T> elements, Consumer<T> consumer){
        for (T e: elements){
            consumer.accept(e);
        }
    }
}
