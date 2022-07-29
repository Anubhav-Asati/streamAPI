package com.sapient.aem.ui;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

import com.sapient.aem.service.Person;

public class StreamAPIDemo {

	public static void main(String[] args) {
		
		Integer list[]= {10,12,35,25,67,89,56,99,11};
		Stream<Integer> s1=Arrays.stream(list);
		s1.forEach((n)->System.out.println(n));
		System.out.println("Using method references");
		//s1.forEach(System.out::println);//
		Arrays.stream(list).forEach(System.out::println);
		Stream<String> st=Stream.of("Java","JavaEE","Spring","Hibernate","Javascript");
		st.
		map((s)->s.length())
		.forEach(System.out::println);
		Stream<String> st1=Stream.of("Java","JavaEE","Spring","Hibernate","Javascript");
		st1.
		map((s)->s.toUpperCase())
		.forEach(System.out::println);
		
		Person persons[]= {
				new Person(523465785454L,"Smith",LocalDate.of(1990, 5, 15),"Pune","smith@gmail.com",9878985559L),
				new Person(323465785454L,"Clarke",LocalDate.of(1991,9, 15),"Mumbai","clarke@sapient.com",7878987989L),
				new Person(123465715450L,"Adams",LocalDate.of(1989, 12, 25),"Hyderabad","adams@ibm.com",9878987980L),
				new Person(223000785459L,"Jones",LocalDate.of(1998, 10, 10),"New Delhi","jones@sapient.com",8878987989L)
		};
		
		System.out.println("Displaying persons working in Sapient");
		Arrays.stream(persons).filter((p)->p.getEmail().contains("sapient")).forEach(System.out::println);
		
		System.out.println("Display person names working in sapient..");
		Arrays.stream(persons)
		.filter((p)->p.getEmail().contains("sapient"))
		.map((p)->p.getName())
		.forEach(System.out::println);
		
		System.out.println("Displaying person objects in the alphabetical order of their names...");
		Arrays.stream(persons)
		.sorted(  (p1,p2)->  p1.getName().compareTo(p2.getName()))
		.forEach(System.out::println);
		
		System.out.println("Collected sorted persons into an array and displayed...");
		Object sortedPersons[] = 
				Arrays.stream(persons)
				.sorted(  (p1,p2)->  p1.getName().compareTo(p2.getName()))
				.toArray();
		
		Arrays.stream(sortedPersons).forEach(System.out::println);
		
		System.out.println("distinct(),limit() and skip() are special filters...");
		System.out.println("applying distinct().. ");
		Stream.of(67,87,96,67,80,87,96)
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("applying limit().. ");
		Stream.of(67,87,96,67,80,87,96)
		.limit(4) //limit the stream to first 4 elements
		.map((n)->n*n)
		.forEach(System.out::println);
		
		System.out.println("applying skip().. ");
		Stream.of(67,87,96,67,80,87,96)
		.skip(4) //skip first 4 elements of the stream
		.map((n)->n*n)
		.forEach(System.out::println);
		
		System.out.println("Display person names working in sapient..");
		Arrays.stream(persons)
		.filter((p)->p.getEmail().contains("sapient"))
		.map((p)->p.getName())
		.forEach(System.out::println);
		
		System.out.println("Displaying person objects in the alphabetical order of their names...");
		Arrays.stream(persons)
		.sorted(  (p1,p2)->  p1.getName().compareTo(p2.getName()))
		.forEach(System.out::println);
		
		System.out.println("distinct(),limit() and skip() are special filters...");
		System.out.println("applying distinct().. ");
		Stream.of(67,87,96,67,80,87,96)
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("applying limit().. ");
		Stream.of(67,87,96,67,80,87,96)
		.limit(4) //limit the stream to first 4 elements
		.map((n)->n*n)
		.forEach(System.out::println);
		
		System.out.println("applying skip().. ");
		Stream.of(67,87,96,67,80,87,96)
		.skip(4) //skip first 4 elements of the stream
		.map((n)->n*n)
		.forEach(System.out::println);
		
		System.out.println("Collecting stream into Integer array..");
		Integer distinctMarks[]= Stream.of(78,98,67,85,99,75)
				.filter((m)->m>=75)
				.toArray(size->new Integer[size]);	

		Arrays.stream(distinctMarks).forEach(System.out::println);




		System.out.println("Collecting stream into int array..");
		int distinctionMarks[]= Stream.of(78,98,67,85,99,75)
				.filter((m)->m>=75)
				.mapToInt(m->m) //transforms each element from object-type to int type
				.toArray();

		Arrays.stream(distinctionMarks).forEach(System.out::println);
		
		Optional<Integer> opt=Stream.of(78,98,67,85,99,75).reduce((a,b)->a+b);

		if(opt.isPresent()) {
			
			// int[] to Integer[] or Integer[] to int[] is not implicit
			//Integer to int (auto-unboxing) or int->Integer(auto-boxing) is implicit
			int result= opt.get(); //auto-unboxing
			System.out.println(result);
		}
		else {
			System.out.println("No result");
		}
		OptionalInt optional1=		
				Stream.of(78,98,67,85,99,75)
				.mapToInt(m->m)
//				.min();
				.max();
		
		if(optional1.isPresent()) {
			System.out.println(optional1.getAsInt());
		}
		
		
		System.out.println("count() example..");
		long total= Stream.of(78,98,67,85,99,75).count();
		System.out.println("Total elements: "+ total);

		
	}
}
		



		
		

